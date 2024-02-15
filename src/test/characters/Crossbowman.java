package test.characters;

public class Crossbowman extends Character{
    private String crossbowType;
    private int reloadSpeed;
    private int boltAccuracy;
    private boolean hasExplosiveBolts;
    private int aimingTime;
    private boolean isCrouched;
    private int camouflageSkill;
    private String[] knownBoltTypes;

    public Crossbowman() {
        // Конструктор по умолчанию без параметров
    }

    @Override
    public void attack() {
        System.out.println("Crossbowman shoots with a crossbow");
    }

    @Override
    public void defend() {
        System.out.println("Crossbowman takes cover");
    }

    @Override
    public void heal() {
        System.out.println("Crossbowman applies a healing salve");
    }
}
