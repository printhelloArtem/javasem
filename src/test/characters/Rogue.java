package test.characters;

import test.characters.Character;

public class Rogue extends Character {
    private int stealth;
    private int theftExperience;
    private String favoriteWeapon;
    private String disguise;
    private boolean isPoisoned;
    private int lockpickingSkill;
    private String[] knownPoisons;
    private int agilityBoost;

    public Rogue() {
        // Конструктор по умолчанию без параметров
    }

    @Override
    public void attack() {
        System.out.println("Rogue performs a backstab");
    }

    @Override
    public void defend() {
        System.out.println("Rogue dodges the attack");
    }

    @Override
    public void heal() {
        System.out.println("Rogue uses poison for healing");
    }
}