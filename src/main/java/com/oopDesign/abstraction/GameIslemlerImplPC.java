package com.oopDesign.abstraction;

import com.oopDesign.nonAbstract.GameIslemler;

public class GameIslemlerImplPC implements GameIslemler
{

    @Override
    public String gameDown()
    {
        return "Valo PC Edition";
    }

    @Override
    public void playGame()
    {
        System.out.println("Game running on PC.");
    }
}
