package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadB implements Callable<Integer>
{
    int biswohin;

    public ThreadB(int biswohin) {
        this.biswohin = biswohin;
    }

    @Override
    public Integer call() throws Exception
    {
        return ((biswohin+1)*biswohin)/2;
    }
}
