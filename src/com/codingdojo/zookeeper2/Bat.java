package com.codingdojo.zookeeper2;

public class Bat extends Mammal {
	
	public void fly() {
		System.out.println("HHHkkkkk!");
		this.setEnergyLevel(-50);
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("so -- well, never mind!");
		this.setEnergyLevel(25);
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("The town is on fire!");
		this.setEnergyLevel(-100);
		displayEnergy();
	}
}