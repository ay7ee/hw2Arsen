package com.company;

public class ShinobiNaruto extends Shinobi{
    public ShinobiNaruto(){
        super(new VillageFire(), new SkillWind());
    }

    @Override
    public void name(){
        System.out.println(" My name is Uzumaki Naruto. And I am a current Hokage");
    }
}
