package com.company;

public class ShinobiMei extends Shinobi{
    public ShinobiMei(){
        super(new VillageWater(), new SkillWater());
    }

    @Override
    public void name(){
        System.out.println(" My name is Mei Terumi. And I am a previous Mizukage");
    }
}
