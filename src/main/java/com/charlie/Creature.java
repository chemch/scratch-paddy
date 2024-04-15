package com.charlie;

public abstract class Creature {
	private CreatureType creatureType;

	public CreatureType getCreatureType() {
		return creatureType;
	}

	public void setCreatureType(CreatureType creatureType) {
		this.creatureType = creatureType;
	} 
}