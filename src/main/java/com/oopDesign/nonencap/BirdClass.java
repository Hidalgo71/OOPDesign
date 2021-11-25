package com.oopDesign.nonencap;

public class BirdClass extends AnimalClass
{
    private int flyHigh;

    @Override
    public void animalSound()
    {
        System.out.println("Cik Cik");
    }

    @Override
    public void breath()
    {
        super.breath();
        System.out.println("Bird breeeeeeeeeeath");
    }

    public int getFlyHigh()
    {
        return flyHigh;
    }

    public void setFlyHigh(int flyHigh)
    {
        this.flyHigh = flyHigh;
    }
}
