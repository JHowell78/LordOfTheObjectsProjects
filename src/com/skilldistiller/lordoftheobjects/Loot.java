package com.skilldistiller.lordoftheobjects;

public class Loot
{
	private int itemFound;
	
	String [] treasure = {"10 Gold coins", "5 sparkly gems", "25 Gold coins", "Empty Treasure Chest", "Half Eaten Sandwich", "Sword of Flames", "Dager of Ice", "Crossbow of Lightning", "Battle Axe", "Staff of Power"};


	public void lootFound()	
	{
		itemFound = (int)(Math.random() * treasure.length);
		System.out.println("You found: "+ treasure[itemFound]);
		
	}
public Loot() {
	// TODO Auto-generated constructor stub
}

	public Loot(int itemFound, int gold, String[] treasure) {
		super();
		this.itemFound = itemFound;
		this.treasure = treasure;
	}


	public int getItemFound()
	{
		return itemFound;
	}


	public void setItemFound(int itemFound)
	{
		this.itemFound = itemFound;
	}


	


	


	public String[] getTreasure()
	{
		return treasure;
	}


	public void setTreasure(String[] treasure)
	{
		this.treasure = treasure;
	}	
	
		
}

