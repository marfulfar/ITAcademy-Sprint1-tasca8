package main;

import interfaces.PiValue;
import interfaces.Reverse;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String[] list = {"hola","que","tal","comes","va","totals"};

//Exercise1
        System.out.println("***Exercise1***");
        System.out.println("printing filtered string for character 'o'");
        System.out.println(Arrays.stream(list)
                .filter(s->s.contains("o"))
                .toList());

//Exercise2
        System.out.println("***Exercise2***");
        System.out.println("printing filtered string for character 'o' and length bigger than 5 ");
        System.out.println(Arrays.stream(list).filter(s -> s.contains("o") && s.length()>=5).toList());

//Exercise3
        System.out.println("***Exercise3***");
        String[] months ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Printing all year's months");
        Arrays.stream(months).forEach(month-> System.out.println(month));

//Exercise4
        System.out.println("***Exercise4***");
        System.out.println("Printing all year's months with method reference");
        Arrays.stream(months).forEach(System.out::println);

//Exercise5
        System.out.println("***Exercise5***");
        PiValue pv = () -> 3.1415;
        System.out.println("Printing value of 3.1415 from Functional Interface PiValue");
        System.out.println(pv.getPiValue());

//Exercise6
        System.out.println("***Exercise6***");
        System.out.println("Printing list of String and int ordered by length");
        Object[] textChain = {"dlih","ouirn","dbdoie","hd","jhrt",568,89,23};
        System.out.println(Arrays.stream(textChain).sorted(Comparator.comparingInt(s -> s.toString().length())).toList());
        //System.out.println(Arrays.stream(textChain).sorted((s1,s2) -> Integer.compare(s1.toString().length() , s2.toString().length())).toList());
        //System.out.println(Arrays.stream(textChain).sorted(Comparator.comparingInt((Object)toString().length())).toList());

//Exercise7
        System.out.println("***Exercise7***");
        System.out.println("Printing same list but reversed");
        System.out.println(Arrays.stream(textChain).sorted(Comparator.comparingInt(s->s.toString().length()).reversed()).toList());


//Exercise8
        System.out.println("***Exercise8***");

        Reverse rev1 = (s)-> new StringBuilder(s).reverse().toString();
        System.out.println("Printing reverse String (example:hello) setting method inside a lambda on a Functional Interface");
        System.out.println(rev1.reverse("hello"));


    }//closes main



}//closes class