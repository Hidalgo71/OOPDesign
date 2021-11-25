package com.oopDesign.nonAbstract;

public class GameIslemlerImplPC implements GameIslemler, WindowsIslemler
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
