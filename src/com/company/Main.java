package com.company;
import java.sql.Array;
import java.time.Year;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] Array=new int [10];
        for(int i=0;i<10;i++) {
            System.out.print("Nr. "+(i+1)+":");
            Array[i]=input.nextInt();
        }
        System.out.print("Последнее введеное число пользователем: "+ Array[Array.length-1]+"\n");
        int max=0;
        for(int i=0;i<10;i++) {
            if(Array[i]>max)
                max=Array[i];}
        System.out.print("max:"+max+"\n");
    }
}
