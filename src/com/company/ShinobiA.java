package com.company;

public class ShinobiA extends Shinobi{
    public ShinobiA(){
        super(new VillageLightning(), new SkillLightning());
    }

    @Override
    public void name(){
        System.out.println(" My name is A. And I am a previous Raikage");
    }
}
