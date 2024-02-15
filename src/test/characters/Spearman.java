package test.characters;

public class Spearman extends Character{
    private String spearType;
    private int blockingAbility;
    private boolean isPhalanxFormation;
    private int spearLength;
    private boolean hasThrowingSpears;
    private int chargingSpeed;
    private String battleCry;
    private boolean isShielded;

    public Spearman() {
        // Конструктор по умолчанию без параметров
    }

    @Override
    public void attack() {
        System.out.println("Spearman thrusts with a powerful spear");
    }

    @Override
    public void defend() {
        System.out.println("Spearman blocks with the spear");
    }

    @Override
    public void heal() {
        System.out.println("Spearman uses a bandage for healing");
    }
}
