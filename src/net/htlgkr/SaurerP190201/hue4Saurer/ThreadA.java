package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadA implements Callable<List<Integer>>
{
    int weite;
    int weite2;

    public ThreadA(int weite, int weite2)
    {
        this.weite = weite;
        this.weite2 = weite2;
    }

    public static void main(String[] args)
    {
        Aufgabe1 a = new Aufgabe1();
        a.filltest();
        ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(a.chunk);

        for (int i = 1; i < a.chunk+1; i++)
        {
            System.out.println("Created Thread "+i);
            tpe.execute(a);
        }
        tpe.shutdown();
    }

    @Override
    public List<Integer> call() throws Exception
    {
        return null;
    }
}
