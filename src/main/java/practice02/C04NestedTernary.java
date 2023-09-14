package practice02;

import java.util.Scanner;

public class C04NestedTernary {
    public static void main(String[] args) {
           /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 2 sayı giriniz");
        int sayi1= input.nextInt();
        int sayi2 = input.nextInt();
        Object result =  sayi1 == sayi2 ?"Sayılar bir birine eşit" : (sayi1 >sayi2 ? sayi1 : sayi2) ;
        System.out.println(result);
    }
}
