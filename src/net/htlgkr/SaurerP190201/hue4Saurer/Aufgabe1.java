package net.htlgkr.SaurerP190201.hue4Saurer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe1
{
    public static void main(String[] args)
    {
        String FILENAME = "numbers.csv";
        try {Scanner s = new Scanner(new File(FILENAME));
            ArrayList<Integer> arr = new ArrayList<>();
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
        System.out.println("Geben sie die Gewünschte Chunkzahl ein:");
        Scanner schunks = new Scanner(System.in);
        int chunks = Integer.parseInt(schunks.nextLine());
        System.out.println("Geben sie den Gewünschten Teiler ein:");
        Scanner console = new Scanner(System.in);
        int teiler = Integer.parseInt(console.nextLine());


    }
}
