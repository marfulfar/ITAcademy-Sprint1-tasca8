package main;

import comparator.CustomComparator;
import interfaces.Operacio;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.replaceAll;

public class Main {
    public static void main(String[] args) {

//Exercise1
        System.out.println("***Exercise1***");
        String[] names = {"Mary","Michael","Allison","Richard","Candace","Julia","James","Ane","Aly"};
        System.out.println(Arrays.stream(names).filter(s->s.startsWith("A") && s.length()==3).toList());

//Exercise2
        System.out.println("***Exercise2***");
        ArrayList<Integer> oddOrEven = new ArrayList<>();
        oddOrEven.add(2);
        oddOrEven.add(852);
        oddOrEven.add(123);
        oddOrEven.add(87);
        oddOrEven.add(63);
        ArrayList<String> newList = new ArrayList<>();
        oddOrEven.forEach(n->{
             if (n%2==0){
                 newList.add("e"+String.valueOf(n));
             }else{
                 newList.add("o"+String.valueOf(n));
             }
         });
        System.out.println(newList);

//Exercise3
        System.out.println("***Exercise3***");
        Operacio opAdd = (i,j)->{
            double result = i+j;
            return result;
        };
        Operacio opSubtract = (i,j)->{
            double result = i-j;
            return result;
        };
        Operacio opMultiply = (i,j)->{
            double result = i*j;
            return result;
        };
        Operacio opDivide = (i,j)->{
            double result = i/j;
            return result;
        };

        System.out.println(opAdd.operacio(7,9));
        System.out.println(opSubtract.operacio(4,7));
        System.out.println(opMultiply.operacio(2,6));
        System.out.println(opDivide.operacio(5,3));

//"Mary","Michael","Allison","Esther",565,963,123,47,9
//Exercise4
        System.out.println("***Exercise4***");
        List<Object> wordsAndNum = new ArrayList<>();
        wordsAndNum.add("esther");
        wordsAndNum.add("michael");
        wordsAndNum.add("allison");
        wordsAndNum.add(56);
        wordsAndNum.add(9);
        wordsAndNum.add(123);


//Exercise A
        System.out.println("**Numerical and Alphabetical**");

        wordsAndNum.sort((s,t) -> {
            int c = s.toString().charAt(0) - t.toString().charAt(0);
            return c;
        });
        for (Object o:wordsAndNum) {System.out.println("   "+o.toString());}


//Exercise B
        System.out.println("\n**Strings containing in 'e' first**");
        //System.out.println(wordsAndNum.stream().sorted(new CustomComparator()).collect(Collectors.toList()));Custom comparator method
        System.out.println(wordsAndNum.stream().sorted((s,t) -> {
            int c=0;
            if (s.toString().contains("e")){c=-1;}
            return c;
        }).collect(Collectors.toList()));

//Exercise C
        System.out.println("\n**Strings containing 'a' changed for a 4**");
        wordsAndNum.stream().forEach(s-> {
           if (s.toString().contains("a") || s.toString().contains("A")){
               String newWord = s.toString().replaceAll("a","4");
               System.out.println(newWord);
           }else {
               System.out.println(s);
           }
        });

//Exercise D
        System.out.println("\n**Print only numbers**");
        wordsAndNum.stream().forEach(s->{
            if(s instanceof Integer){System.out.println("   "+s);}
        });

    }//closes main


}//closes class