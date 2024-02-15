package test.characters;

import test.characters.Character;

public class Peasant extends Character {
    private int experience;
    private int gold;
    protected int agility;
    protected int intelligence;
    protected int luck;
    protected int charisma;
    protected int dexterity;


    // Конструктор, геттеры, сеттеры

    @Override
    public void attack() {
        System.out.println("Peasant attacks with a pitchfork to the chest");
    }

    @Override
    public void defend() {
        System.out.println("Peasant defends with a shield");
    }

    @Override
    public void heal() {
        System.out.println("Peasant restores energy");
    }
}

