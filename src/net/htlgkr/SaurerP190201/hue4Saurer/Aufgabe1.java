package net.htlgkr.SaurerP190201.hue4Saurer;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Aufgabe1
{
    ArrayList<Integer> arr = new ArrayList<>();
    int chunk;
    int teiler;

    public void filltest()
    {
        String FILENAME = "numbers.csv";
        try {Scanner s = new Scanner(new File(FILENAME));
            while(s.hasNextLine())
            {
                String l = s.nextLine();
                String[] aline = l.split(":");
                for (String str:aline)
                {
                    try{
                        arr.add(Integer.valueOf(str));
                    }
                    catch (Exception e)
                    {
                        System.out.println("Zahl "+str+" funktioniert nicht!");
                    }
                }
            }
        }
        catch (FileNotFoundException e) {e.printStackTrace();}
        System.out.println();
        System.out.println("Geben sie die Gewünschte Chunkzahl ein:");
        Scanner schunks = new Scanner(System.in);
        chunk=Integer.parseInt(schunks.nextLine());
        System.out.println("Geben sie den Gewünschten Teiler ein:");
        Scanner console = new Scanner(System.in);
        teiler = Integer.parseInt(console.nextLine());
    }

    public static void main(String[] args)
    {
        Aufgabe1 a = new Aufgabe1();
        a.filltest();
        int lengthofeverylist = (a.arr.size()/a.chunk) + 1;
        List<List<Integer>> listoflistsofints = new ArrayList<>();
        int c =0;
        for (int i = 0; i < a.chunk; i++)
        {
            List<Integer> az = new ArrayList<>();
            for(int j = 0; j < lengthofeverylist; j++)
            {
                if(c==a.arr.size()){break;}
                az.add(a.arr.get(c));
                c++;
            }
            listoflistsofints.add(az);
        }
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(listoflistsofints.size());
        int whatthread =1;
        for(List<Integer> lists : listoflistsofints)
        {
            ThreadA cd = new ThreadA(a.teiler,lists,whatthread);whatthread++;
            executor.execute(cd);
        }
        executor.shutdown();
    }
}