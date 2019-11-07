package org.wedu.classtest1;

import org.wedu.interface1.Healer;

public class Support extends Hero implements Healer {

    @Override
    public void heal() {
        System.out.println("治疗");
    }

    public static void main(String[] args) {
        Support hd=new Support();
        hd.heal();
    }
}
