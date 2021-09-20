package com.company;

public class ShinobiGaara extends Shinobi{
    public ShinobiGaara(){
        super(new VillageWind(), new SkillWind());
    }

    @Override
    public void name(){
        System.out.println(" My name is Gaara. And I am a current Kazekage");
    }
}
