package practice01;

import java.util.Scanner;

public class C04Concatenation {
    public static void main(String[] args) {
      String str1="java";
      String str2="Güzel";
      int sayi1=5;
      int sayi2=3;
        System.out.println(str1+sayi1+str2);
        System.out.println(sayi1+sayi2+str1);
        System.out.println(str1+(sayi1+sayi2)+str2);
        System.out.println((sayi1-sayi2)+str2+(sayi1*sayi2));
        System.out.println(str1+(sayi1*sayi1-sayi2));
        System.out.println(""+sayi1+sayi2+str2);


        int g=2;
        int h=3;
        String i="java";
      System.out.println(""+(g*h)+(h-g)+i+(g-h));

      Scanner scan =new Scanner(System.in);









    }
}
     /*2 tane string, 2 tane int data turunde variable olusturun
        String str1="Java";
        String str2="Güzel";
        int sayi1=5;
        int sayi2=3;
        Java5Güzel yazdırın
        8Java yazdırın
        Java8Guzel yazdırın
        2Güzel15 yazdırın
        Java22 yazdırın
        53Güzel yazdırın


         */