package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Aufgabe2
{
    public static void main(String[] args)
    {
        try{
            System.out.println("Bis welche Zahl wollen sie summieren?");
            Scanner s = new Scanner(System.in);
            int weite = Integer.parseInt(s.nextLine());
            int sum = 0;
            List<Callable<Integer>> listofintegerlists = new ArrayList<>();
            if(weite>=100)
            {
                int howmanythreads = weite/100;
                ExecutorService executor = Executors.newFixedThreadPool(howmanythreads);
                for(int i = 1; i <= howmanythreads; i++)
                {
                    ThreadB gsf = new ThreadB(i*100);
                    listofintegerlists.add(gsf);
                }
                for(Future<Integer> future : executor.invokeAll(listofintegerlists))
                {
                    sum += future.get();
                }
                System.out.println("Ergebnis = " + sum);
                executor.shutdown();
            }
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}