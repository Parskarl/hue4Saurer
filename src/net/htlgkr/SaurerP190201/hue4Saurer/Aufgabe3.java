package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.*;
import java.util.stream.Collectors;

public class Aufgabe3
{

    public static void main(String[] args)
    {
        List<String> arr = new ArrayList<>();
        arr.add("hello");
        arr.add("dad");
        arr.add("family");
        arr.add("test");
        arr.add("no");
        arr.add("");

        System.out.println(getCountEmptyString(arr));
        System.out.println(getCountLength3(arr));
        System.out.println(deleteEmptyStrings(arr));
        System.out.println(getMergedString(arr,"/"));

        List<Integer> arri = new ArrayList<>();
        arri.add(1);
        arri.add(2);
        arri.add(3);
        arri.add(4);

        System.out.println(getSquares(arri));
        System.out.println(getMax(arri));
        System.out.println(getMin(arri));
        System.out.println(getSum(arri));
        System.out.println(getAverage(arri));
    }

    private static int getCountEmptyString(List<String> strings)
    {
        int ces = (int) strings.stream().filter(x1 -> x1=="").count();
        return ces;
    }

    private static int getCountLength3(List<String> strings)
    {
        int ces = Math.toIntExact(strings.stream().filter(x -> x.length()>=3).count());
        return ces;
    }

    private static List<String> deleteEmptyStrings(List<String> strings)
    {
        strings.removeIf(x -> x.equals(""));
        return strings;
    }

    private static String getMergedString(List<String> strings, String separator)
    {
        String s = strings.stream().collect(Collectors.joining(separator));
        return s;
    }

    private static List<Integer> getSquares(List<Integer> numbers)
    {
        List<Integer> results = numbers.stream().map(p -> p = Math.toIntExact(Math.round(Math.pow(p, 2)))).collect(Collectors.toList());
        return results;
    }

    private static int getMax(List<Integer> numbers)
    {
        int max = numbers.stream().max(Comparator.comparing(x -> x)).get();
        return max;
    }

    private static int getMin(List<Integer> numbers)
    {
        int max = numbers.stream().min(Comparator.comparing(x -> x)).get();
        return max;
    }

    private static int getSum(List<Integer> numbers)
    {
        int sum = numbers.stream().reduce(0,(x1,x2)-> x1+x2);
        return sum;
    }

    private static int getAverage(List<Integer> numbers)
    {
        int sum = numbers.stream().reduce(0,(x1,x2)-> x1+x2);
        return sum/numbers.size();
    }
}
