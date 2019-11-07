package org.wedu.classtest1;

public class Hero {
        String name;
        String heroName;
        float heroHP;
        float heroArmor;
        int heroMoveSpeed;

        public Hero(){
                this.name=name;


        }
        public Hero(String heroName,float heroHP,float heroArmor,int heroMoveSpeed){
/*
                this.heroName=heroName;
                this.heroHP=heroHP;
                this.heroArmor=heroArmor;
                this.heroMoveSpeed=heroMoveSpeed;*/
                this(heroName,heroHP);
                this.heroArmor=heroArmor;
                this.heroMoveSpeed=heroMoveSpeed;

        }
        public Hero(String name,float hp){
                this.heroName=name;
                this.heroHP=hp;
        }




}
