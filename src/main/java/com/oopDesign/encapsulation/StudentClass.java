package com.oopDesign.encapsulation;

public class StudentClass
{
    private String nameSur;
    public int age;

    public String nameCounter()
    {
        return nameSur;
    }
    public void giveName(String nameSurname)
    {
        nameSur = nameSurname;
    }
}
