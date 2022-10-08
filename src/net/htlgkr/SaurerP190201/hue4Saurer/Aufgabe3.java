package net.htlgkr.SaurerP190201.hue4Saurer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Aufgabe3
{
    List<String> arr = new ArrayList<>();
    public static void main(String[] args)
    {
        Aufgabe3 a = new Aufgabe3();
        a.arr.add("hello");
        a.arr.add("dad");
        a.arr.add("family");
        a.arr.add("test");
        a.arr.add("no");
        a.arr.add(" ");
    }

    private static int getCountEmptyString(List<String> strings)
    {
        int i = (int) strings.stream().map(x -> Objects.equals(x, " ")).count();
        return i;
    }

    private static int getCountLength3(List<String> strings)
    {
        int i = (int) strings.stream().map(x -> x.length()>=3).count();
        return i;
    }

    private static List<String> deleteEmptyStrings(List<String> strings)
    {
        strings.removeIf(x -> x.equals(" "));
        return strings;
    }

    private static String getMergedString(List<String> strings, String separator)
    {
        String s = strings.stream().collect(Collectors.joining(separator));
        return s;
    }

    private static List<Integer> getSquares(List<Integer> numbers)
    {
        numbers.stream().map(x -> Math.pow(x,2));
        return numbers;
    }

    private static int getMax(List<Integer> numbers)
    {
        int max = numbers.stream().max(Comparator.comparing(x -> x));
    }

    private static int getMin(List<Integer> numbers)
    {

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
