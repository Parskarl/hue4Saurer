package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadA implements Runnable
{
    Integer teiler;
    List<Integer> intvomchunk;
    int number;
    public ThreadA(Integer teiler, List<Integer> intvomchunk, int number)
    {
        this.teiler = teiler;
        this.intvomchunk = intvomchunk;
        this.number = number;
    }

    @Override
    public void run()
    {
        for(int i : intvomchunk)
        {
            if(i % teiler == 0)
            {
                if(i!=0){System.out.println("Thread "+number+" found: "+i);}
            }
        }
    }
}
