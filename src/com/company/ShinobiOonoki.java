package com.company;

public class ShinobiOonoki extends Shinobi{
    public ShinobiOonoki(){
        super(new VillageEarth(), new SkillEarth());
    }

    @Override
    public void name(){
        System.out.println(" My name is Oonoki. And I am a previous Tsuchikage");
    }

}
