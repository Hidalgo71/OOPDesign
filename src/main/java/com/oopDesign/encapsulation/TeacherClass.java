package com.oopDesign.encapsulation;

public class TeacherClass
{
    private String nameSur;
    private int age;

    public String getNameSur()
    {
        return nameSur;
    }
    public void setNameSur(String nameSur)
    {
        this.nameSur = nameSur + ".";
    }

    //Get & Set
    public int getAge(){ return age; }
    public void setAge(int age){ this.age = age; }
}
