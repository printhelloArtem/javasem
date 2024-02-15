package test.characters;

public abstract class Character {
    protected int health;
    protected int strength;
    protected int defense;


    public abstract void attack();

    public abstract void defend();

    public abstract void heal();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

