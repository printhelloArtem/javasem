package test.characters;

import test.characters.Character;

public class Sniper extends Character {
    private String rifleType;
    private int accuracy;
    private boolean isCamouflaged;
    private int bulletVelocity;
    private String preferredDistance;
    private boolean hasSilencer;
    private int camouflageSkill;
    private String[] knownSnipingLocations;

    public Sniper() {
        // Конструктор по умолчанию без параметров
    }

    @Override
    public void attack() {
        System.out.println("Sniper takes a precise shot");
    }

    @Override
    public void defend() {
        System.out.println("Sniper finds cover");
    }

    @Override
    public void heal() {
        System.out.println("Sniper uses a medical kit");
    }
}

