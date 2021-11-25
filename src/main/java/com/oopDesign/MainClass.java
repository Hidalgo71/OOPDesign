package com.oopDesign;

import com.oopDesign.abstraction.GameIslemlerImplPC;
import com.oopDesign.encapsulationAndPolymorphisim.StudentClass;
import com.oopDesign.encapsulationAndPolymorphisim.TeacherClass;
import com.oopDesign.nonAbstract.GameIslemler;
import com.oopDesign.nonencap.*;

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

        AnimalClass ani1 = new AnimalClass();
        ani1.getTailNum(14);
        System.out.println("Animal tail: " + ani1.getTailNum());

        bird1.animalSound();
        bird1.breath();

        //==============
        //constructor order list
        AnimalClass ani2 = new AnimalClass();
        Cat cat2 = new Cat();
        Cat1Class cat4 = new Cat1Class();
        Dog dog3 = new Dog();
        Dog1Class dog4 = new Dog1Class();

        AnimalClass ani3 = new AnimalClass();
        AnimalClass ani4 = new Cat1Class();
        if (ani4 instanceof Cat1Class)
        {
            System.out.println("Yes, It's cat.");
        }


        //======================
        GameIslemler gameIslemlerPC = new GameIslemlerImplPC();
        String gamePC = gameIslemlerPC.gameDown();
        gameIslemlerPC.playGame();

    }
}
