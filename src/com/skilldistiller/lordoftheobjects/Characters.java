package com.skilldistiller.lordoftheobjects;

import java.util.Random;

import java.util.Scanner;
public class Characters
{
	private String characterName;
	private int hitPoints, minAttack, maxAttack;
	private Random random = new Random();


	public Characters(String characterName, int hitPoints, int minAttack, int maxAttack) {
		super();
		this.characterName = characterName;
		this.hitPoints = hitPoints;
		this.minAttack = minAttack;
		this.maxAttack = maxAttack;
	}
	
	
	public String getCharacterName()
	{
		return characterName;
	}



	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}



	public int getHitPoints()
	{
		return hitPoints;
	}



	public void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
	}



	public int getMinAttack()
	{
		return minAttack;
	}



	public void setMinAttack(int minAttack)
	{
		this.minAttack = minAttack;
	}



	public int getMaxAttack()
	{
		return maxAttack;
	}



	public void setMaxAttack(int maxAttack)
	{
		this.maxAttack = maxAttack;
	}



	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Class: ");
		builder.append(characterName);
		builder.append(", Hit Points: ");
		builder.append(hitPoints);
		builder.append(", Attack Range: (");
		builder.append(minAttack);
		builder.append(" - ");
		builder.append(maxAttack);
		builder.append(").");
		return builder.toString();
	}

	public   int whenAttacked()
	{
		int attack = random.nextInt(maxAttack - minAttack);
		if (hitPoints > attack)
			hitPoints = hitPoints - attack;
		System.out.printf(" " + characterName + " was attacked and suffered %d points of damage (%s)\n", attack, // words
				getPlayerHealth());
		if (hitPoints < attack)
		{
			System.out.println("You did not survie: ");
			System.out.println("Game Over");
		}
		if (!playerDead(hitPoints))
		{
			System.out.println("Thanks for playing, better luck next time.");
		}
		return hitPoints;
	}

	public String getPlayerHealth()
	{
		return "Current hit points: " + hitPoints;
	}
	
	 public boolean playerDead(int hitPoints) {
		if (hitPoints > 0)
			return false;
		else 
		return true;
	}
	

}