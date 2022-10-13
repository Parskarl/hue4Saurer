package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Aufgabe2
{
    int weite;
    int wievielethreads;
    int sum;

    public static void main(String[] args)
    {
        Aufgabe2 a = new Aufgabe2();
        Scanner s = new Scanner(System.in);
        System.out.println("Wieweit wollen sie berechnen:");
        a.weite = Integer.parseInt(s.nextLine());


    }
}
