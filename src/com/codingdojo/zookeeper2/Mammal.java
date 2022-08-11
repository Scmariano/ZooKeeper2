package com.codingdojo.zookeeper2;

public class Mammal {
	private int energyLevel = 300;
	
	public int displayEnergy() {
		System.out.printf("Energy Level is: %s\n", energyLevel);
		return	energyLevel;
	}
	
	public void setEnergyLevel(int energy) {
		energyLevel += energy;
	}
}