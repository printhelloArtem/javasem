package test.characters;

public class Monk extends Character{
    private String martialArtsStyle;
    private int meditationLevel;
    private boolean isVegetarian;
    private int agilityBoost;
    private boolean hasHealingHands;
    private boolean isMartialArtsMaster;
    private String[] knownTechniques;
    private String mantra;

    public Monk() {
        // Конструктор по умолчанию без параметров
    }

    @Override
    public void attack() {
        System.out.println("Monk delivers a powerful martial arts strike");
    }

    @Override
    public void defend() {
        System.out.println("Monk enters a defensive stance");
    }

    @Override
    public void heal() {
        System.out.println("Monk meditates for healing");
    }
}
