package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadB implements Callable<Integer>
{
    @Override
    public Integer call() throws Exception
    {
        Aufgabe2 a = new Aufgabe2();
        int summe = 0;
        int z=1;
        for (int i = summe-100; i < a.weite; i++)
        {
            summe += z;
            z++;
        }
        return null;
    }
}
