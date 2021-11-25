package com.oopDesign.abstraction;

public abstract class GameAbsIslemler
{
    abstract public String gameAbsDown();
    abstract public void playAbsGame(String gameAbsName);

    private int gameAge;

    public void tryMethod()
    {
        System.out.println("Try");
    }

    public void sum(int x, int y)
    {
        System.out.println("sum: " + (x +y));
    }

    public int getGameAge()
    {
        return gameAge;
    }

    public void setGameAge(int gameAge)
    {
        this.gameAge = gameAge;
    }
}
