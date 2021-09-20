package com.company;

public abstract class Shinobi {
    private Villages villages;
    private Skills skills;

    public Shinobi(){
    }

    public Shinobi ( Villages villages ,Skills skills){
        this.villages = villages;
        this.skills = skills;
    }

    public void country(){
        this.villages.village();
    }

    public void technique(){
        this.skills.skill();
    }

    public abstract void name();
}
