package test.characters;

public class Wizard extends Character{
    private String staffType;
    private int magicPower;
    private boolean hasFamiliar;
    private int manaPool;
    private String favoriteSpell;
    private boolean isTeleportationMaster;
    private String knownSpells;
    private int meditationLevel;

    public Wizard(

            int health, int strength, int agility, int defense, String weapon,
            String staffType, int magicPower, boolean hasFamiliar,
            int manaPool, String favoriteSpell, boolean isTeleportationMaster,
            String knownSpells, int meditationLevel

    ) {

            this.health = health;
            this.strength = strength;

            this.defense = defense;




            this.staffType = staffType;
            this.magicPower = magicPower;
            this.hasFamiliar = hasFamiliar;
            this.manaPool = manaPool;
            this.favoriteSpell = favoriteSpell;
            this.isTeleportationMaster = isTeleportationMaster;
            this.knownSpells = knownSpells;
            this.meditationLevel = meditationLevel;

    }

    @Override
    public void attack() {
        System.out.println("Wizard casts a powerful spell");
    }

    @Override
    public void defend() {
        System.out.println("Wizard creates a magical barrier");
    }

    @Override
    public void heal() {
        System.out.println("Wizard uses a healing potion");
    }

}
