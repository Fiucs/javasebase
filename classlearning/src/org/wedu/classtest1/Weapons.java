package org.wedu.classtest1;

public class Weapons extends Item {

    String ac;
    int armorLevel;


    public static void main(String[] args) {
        Weapons weapon=new Weapons();
        System.out.println(weapon.ac);
        weapon.name="sort";
        weapon.price=1600;
        weapon.ac="shield";
        weapon.armorLevel=7;

        System.out.println(weapon.armorLevel);


    }
    public Weapons(){
        super();
        ac="Good";
        armorLevel=11;




    }



}
