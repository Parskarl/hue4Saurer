package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadB
{
    public static void main(String[] args)
    {
        Aufgabe2 a = new Aufgabe2();
        a.starter();
        ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(a.wievielethreads);
        for (int i = 1; i < a.wievielethreads; i++)
        {
            System.out.println("Created Thread "+i);
            tpe.execute(a);
        }
        tpe.shutdown();
    }
}
