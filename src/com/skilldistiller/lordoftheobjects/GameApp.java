package com.skilldistiller.lordoftheobjects;

import java.util.Scanner;
import java.util.Random;

public class GameApp
{
	int killCount = 0;
	Characters player = new Characters("Hero", 300, 7, 20);
	Characters enemy = new Characters("Enemy", 50, 5, 15);
	Scanner kb = new Scanner(System.in);

	public void play()
	{

		System.out.println("----------------------------------------------------------");
		System.out.println("THE DARK FORESTS OF MYSTERY!!!");
		System.out.println("----------------------------------------------------------");
		System.out.println("Developers: Josh H. & Connor C.");
		System.out.println("Copyright 2019");
		System.out.println("----------------------------------------------------------");
		System.out.println("Please Select A Character Class Below");
		System.out.println("----------------------------------------------------------");
		System.out.println("1. Knight");
		System.out.println("2. Rogue");
		System.out.println("3. Mage");
		System.out.println("----------------------------------------------------------");
		System.out.print("Your Choice: ");

		int charChoice = kb.nextInt();

		switch (charChoice)
		{
		case 1:
			Characters knight = new Characters("Knight", 75, 7, 20);
			System.out.println(knight);
			System.out.println("----------------------------------------------------------");
			System.out.println("Congratulations Hero, you've chosen the Knight class!");
			System.out.println("Good luck on your adventures!");
			System.out.println("----------------------------------------------------------");
			System.out.println();

			encounter();

			break;

		case 2:

			Characters rogue = new Characters("Rogue", 75, 7, 20);
			System.out.println(rogue);
			System.out.println("----------------------------------------------------------");
			System.out.println("Congratulations Hero, you've chosen the Mage class!");
			System.out.println("Good luck on your adventures!");
			System.out.println("----------------------------------------------------------");
			System.out.println();

			encounter();

			break;

		case 3:

			Characters mage = new Characters("Mage", 75, 7, 20);
			System.out.println(mage);
			System.out.println("----------------------------------------------------------");
			System.out.println("Congratulations Hero, you've chosen the Mage class!");
			System.out.println("Good luck on your adventures!");
			System.out.println("----------------------------------------------------------");
			System.out.println();

			encounter();

			break;

		default:

			System.out.println("----------------------------------------------------------");
			System.out.println("Please select a valid class from the menu");
			System.out.println("----------------------------------------------------------");

			play();

		}

	}

	public void encounter()
	{
		Random random = new Random();
		Characters player = new Characters("Player 1", 100, 7, 20);
		Characters enemy1 = new Characters("Monster", 30, 5, 15);
		Characters enemy2 = new Characters("Monster", 50, 7, 20);
		Characters enemy3 = new Characters("Monster", 75, 10, 25);
		boolean dead = false;
		Scanner kb = new Scanner(System.in);
		System.out.println(
				"You are wandering aimlessly through the forrest when you see a collection of 3 strange doors:");
		System.out.println();
		System.out.println(
				"Press 1 to open the door on the left, 2 for the door in the middle, and 3 for the door on the right.");
		System.out.println();
		int open = kb.nextInt();
		System.out.println("You are attacked by a Goblin");
		System.out.println();
		System.out.println(enemy1);
		System.out.println();
		System.out.println("You attack first: ");
		System.out.println();
		deathMatch(enemy1);
		killCount++;
		System.out.println("You have defeated " + killCount + " total enemies");
		System.out.println();
		System.out.println("You found a treasure chest: Press 1 to open ");
		kb.nextInt();
		System.out.println("Item Found: ");
		System.out.println();
		System.out.println("A half eaten sandwich!!!");
		System.out.println();
		if (killCount == 3)
		{
			System.out.println("Winner Winner Chicken Dinner!!!");
		}
		System.out.println("Now you are back in front of a choice of 2 doors:");
		System.out.print("Press 1 to open the door on the left or 2 for the door on the right.");
		kb.nextInt();
		System.out.println();
		System.out.println("You are attacked by an Orc");
		System.out.println();
		System.out.println(enemy2);
		System.out.println();
		System.out.println("You attack first: ");
		System.out.println();
		deathMatch(enemy2);

		killCount++;
		System.out.println("You have defeated " + killCount + " total enemies");
		System.out.println();
		System.out.println("You found a treasure chest: Press 1 to open ");
		kb.nextInt();
		System.out.println("Item Found: ");
		System.out.println();
		System.out.println("A bag of sparkly gems!!!");
		System.out.println();
		if (killCount == 3)
		{
			System.out.println("Winner Winner Chicken Dinner!!!");
		}
		System.out.println("Only one door left:");
		System.out.print("Press 1 to enter the last door .");
		System.out.println();
		kb.nextInt();
		System.out.println("You are attacked by a Troll");
		System.out.println();
		System.out.println(enemy3);
		System.out.println();
		System.out.println("You attack first: ");
		System.out.println();
		deathMatch(enemy3);

		killCount++;
		System.out.println("You have defeated " + killCount + " total enemies");
		System.out.println();
		System.out.println("You found a treasure chest: Press 1 to open ");
		kb.nextInt();
		System.out.println("Item Found: ");
		System.out.println();
		System.out.println("The end of the game!!!");
		System.out.println();
		if (killCount == 3)
		{
			System.out.println("Winner Winner Chicken Dinner!!!");
			playAgain();
		}
	}

	public void deathMatch(Characters enemy)
	{
		Random random = new Random();
		boolean dead = false;
		if (!dead)
		{
			do
			{
				int enemyHit = random.nextInt(player.getMaxAttack() - player.getMinAttack());
				int newEnemyHitPoints = enemy.getHitPoints() - enemyHit;
				enemy.setHitPoints(newEnemyHitPoints);
				System.out.println("You attacked and dealt " + enemyHit + " points of damage to your enemy.");
				if (newEnemyHitPoints < 0)
				{
//					System.out.println("You have defeated your enemy.");
				} else
				{
					System.out.println("Enemies Remaining Health: " + newEnemyHitPoints);
					enemy.setHitPoints(newEnemyHitPoints);
					System.out.println("Now the enemy attacks: ");
					int playerHit = random.nextInt(enemy.getMaxAttack() - enemy.getMinAttack());
					int newHitPoints = player.getHitPoints() - playerHit;
					player.setHitPoints(newHitPoints);
					System.out.println(
							"Your were attacked and suffered " + playerHit + " points of damage to your health.");
					if (newHitPoints < 1)
					{
						dead = true;
						System.out.println("You did not survie: ");
						System.out.println("Game Over");
					} else
					{
						System.out.println("Your Remaining Health: " + newHitPoints);
						player.setHitPoints(newHitPoints);
					}
				}
			} while (player.getHitPoints() > 0 && enemy.getHitPoints() > 0);
		}

	}

	public void playAgain()
	{
		System.out.println("Do you want to play again? (Y/N");
		String yesNo = kb.next();
		if (yesNo.equals("Y"))
		{
			play();
		} else if (yesNo.equals("N"))
		{
			System.out.println("Thank you for playing!");
			System.out.println("Exiting game...");
		}
		else {
			System.out.println("That is not a valid option");
			playAgain();
		}
	}
}
