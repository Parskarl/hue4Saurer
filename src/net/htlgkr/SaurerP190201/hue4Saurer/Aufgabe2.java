package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.Scanner;

public class Aufgabe2 implements Runnable
{
    int weitea;
    int weiteb;
    int weite;
    int wievielethreads;
    int sum;
    public void starter()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Wieweit wollen sie berechnen:");
        weite = Integer.parseInt(s.nextLine());
        wievielethreads = (int) Math.round(weite/100);wievielethreads++;
        weitea=0;weiteb=100;
    }

    @Override
    public void run()
    {

    }
}
