package com.ironhack.w1.d2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ARRAYS
        String[] days={"Saturday","sunday","monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.println(days[2]);
        System.out.println(Arrays.toString(days));
        Arrays.sort(days);
        System.out.println(Arrays.toString(days));

        //receive the array from the methods.
        String[] subArray=createSubjectsArray();
        System.out.println(subArray[2]);
        System.out.println(subArray.length);

        //FOR LOOPS
        for(int i=0; i<subArray.length;i++){
            if(subArray[i].equals("sub2")) continue;
            if(subArray[i].equals("sub3"))break;
            System.out.println(i+" : "+subArray[i]);
        }

        int[] evenNumber=new int[51];
        int j=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                evenNumber[j]=i;
                j++;
            }

        }
        System.out.println(Arrays.toString(evenNumber));

        //FOR-EACH LOOP
        for(int number: evenNumber){
            System.out.print(number+" ");
        }
        System.out.println();


        //WHILE LOOP
        int counter=0;
        while(counter < evenNumber.length){
            counter++;
        }
        System.out.println("counter: "+counter);

        //DO WHILE LOOP
        counter=0;
        do{
            counter++;
        }while(counter<evenNumber.length);
        System.out.println(counter);

        //ARRAYLIST
        List<String> countries=new ArrayList<>();
        countries.add("France");
        countries.add("Saudi Arabia");
        countries.add("Spania");
        System.out.println(countries);
        System.out.println(countries.get(0));
        System.out.println(countries.set(1,"China"));
        System.out.println(countries.size());
        System.out.println(countries.remove(1));
        System.out.println(countries);

        for(int i=0; i<countries.size();i++){
            System.out.println(countries.get(i));
        }

        //ADD ELEMENT TO ARRAY
//        int[] numbers={0,1,2,3,4};
////        numbers[6]=9; this is an error: we are out of the bound
////        we need to create new array to add new value
//        int[] newArray=new int[6];
//        for(int i=0; i<numbers.length;i++){
//            newArray[i]=numbers[i];
//        }
//        numbers[5]=10;

        //MATH CLASS
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(2,5));
        System.out.println((int)Math.pow(2,5));
    }

    public static String[] createSubjectsArray(){
        String[] subjects=new String[5];
        subjects[0]="sub1";
        subjects[1]="sub2";
        subjects[2]="sub3";
        subjects[3]="sub4";
        subjects[4]="sub5";
        return subjects;
    }
}