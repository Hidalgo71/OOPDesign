package com.oopDesign.nonencap;

public class AnimalClass
{
    protected String surName;
    private int tailNum;

    public void animalSound()
    {
        System.out.println("Animal Sound: ");
    }
    //Super: ata sınıftaki bir şey

    public void breath()
    {
        System.out.println("Breeeeeeeeetah");
    }


    public AnimalClass()
    {
        System.out.println("");
    }

    public int getTailNum()
    {
        return tailNum;
    }

    public String getSurName()
    {
        return surName;
    }

    public void setSurName(String surName)
    {
        this.surName = surName;
    }

    public int getTailNum(int i)
    {
        return tailNum;
    }

    public void setTailNum(int tailNum)
    {
        this.tailNum = tailNum;
    }
}
