package com.oopDesign;

import com.oopDesign.encapsulation.StudentClass;
import com.oopDesign.encapsulation.TeacherClass;
import com.oopDesign.nonencap.BirdClass;
import com.oopDesign.nonencap.Cat;
import com.oopDesign.nonencap.Cat1Class;
import com.oopDesign.nonencap.Dog;

public class MainClass
{
    public static void main(String[] args)
    {
        StudentClass stu1 = new StudentClass();
        //stu1.nameSur = "Yekta";
        stu1.age = 28;

        stu1.giveName("Yekta");

        TeacherClass tea1 = new TeacherClass();
        tea1.setNameSur("Tea Yek");
        System.out.println("Name: " + tea1.getNameSur());

        //==============
        Cat cat1 = new Cat();
        cat1.setName("cat name");

        //Dog dog1 = new Dog();
        //dog1.setName("Dog name");
        Dog dog2 = new Dog("dog Name");

        System.out.println("Cat name: " + cat1.getName());
        System.out.println("Dog name: " + dog2.getName());

        //==============

        Cat1Class cat3 = new Cat1Class();
        cat3.setAttr1(644);
        System.out.println("Cat3: " + cat3.getAttr1());

        //==============

        BirdClass bird1 = new BirdClass();
        bird1.setFlyHigh(23);
        System.out.println("Fly: " + bird1.getFlyHigh());

        //==============



    }

}
