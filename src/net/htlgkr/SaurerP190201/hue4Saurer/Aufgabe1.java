package net.htlgkr.SaurerP190201.hue4Saurer;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe1 implements Runnable
{
    ArrayList<Integer> arr = new ArrayList<>();
    ArrayList<Integer> divisable = new ArrayList<>();
    int chunk;
    int teiler;
    static int groesederteile;
    /*public static void main(String[] args)
    {
        Aufgabe1 a = new Aufgabe1();
        String FILENAME = "numbers.csv";
        try {Scanner s = new Scanner(new File(FILENAME));
            while(s.hasNextLine())
            {
                String l = s.nextLine();
                String[] aline = l.split(":");
                for (String str:aline)
                {
                    try{
                        a.arr.add(Integer.valueOf(str));
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
*/
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
        groesederteile = arr.size()-1/chunk;
        //thread1 nimmt 0-> groessederteile, thread 2 0+groessederteile -> groessederteile+groessederteile
        System.out.println("Geben sie den Gewünschten Teiler ein:");
        Scanner console = new Scanner(System.in);
        teiler = Integer.parseInt(console.nextLine());
    }

    public void repeat()
    {
        System.out.println();
        System.out.println("Geben sie die Gewünschte Chunkzahl ein:");
        Scanner schunks = new Scanner(System.in);
        chunk=Integer.parseInt(schunks.nextLine());

        System.out.println("Geben sie den Gewünschten Teiler ein:");
        Scanner console = new Scanner(System.in);
        teiler = Integer.parseInt(console.nextLine());
    }

    @Override
    public void run()
    {
        int test =0;
        int g = groesederteile;
        while(test <= g)
        {
            for (int a:arr)
            {
                if(a%teiler==0)
                {
                    System.out.println(a);
                }
            }
        }
    }
    //checkfordivisability , zb. n%x==0;
}
