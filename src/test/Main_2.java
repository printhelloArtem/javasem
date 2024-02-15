package test;

import test.characters.*;

public class Main_2 {
    public static void main(String[] args) {
   Peasant peasant = new Peasant();
   Rogue rogue = new Rogue();
   Sniper sniper = new Sniper();
   Monk monk = new Monk();
   Crossbowman crossbowman = new Crossbowman();
   Spearman spearman = new Spearman();
   Wizard wizard = new Wizard(100,50,100,50,"sword","cloth",0,true,50,"fireball",true,"Levitation",8 );

        System.out.println(wizard);//Не совсем понял нужно ли создавать конструктор для каждого из наследников поэтому создал только для одного
        System.out.println(monk);
        System.out.println(crossbowman);
        System.out.println(spearman);
        System.out.println(peasant);
        System.out.println(rogue);
        System.out.println(sniper);

    }
}
