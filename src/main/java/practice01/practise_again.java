package practice01;

import java.util.Scanner;

public class practise_again {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int sayi1 ,sayi2 ;
        System.out.println("lütfen işlem seçiniz");
       String secenekler = "1.Toplama \n2.Çıkarma \n3.Bölme \n4.Bölme";
        System.out.println(secenekler);
        byte islemNum = input.nextByte();
        switch (islemNum){
            case 1:
                System.out.println("birinci sayıyı giriniz");
                 sayi1 =input.nextInt();
                System.out.println("lütfen ikinci sayıyı giriniz");
                sayi2 = input.nextInt();
                System.out.println("Toplam = "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("birinci sayıyı giriniz");
                 sayi1 =input.nextInt();
                System.out.println("lütfen ikinci sayıyı giriniz");
                 sayi2 = input.nextInt();
                System.out.println("Çıkarma = "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("birinci sayıyı giriniz");
                sayi1 =input.nextInt();
                System.out.println("lütfen ikinci sayıyı giriniz");
                 sayi2 = input.nextInt();
                System.out.println("Çarpma = "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("birinci sayıyı giriniz");
                sayi1 =input.nextInt();
                System.out.println("lütfen ikinci sayıyı giriniz");
                sayi2 = input.nextInt();
                System.out.println("Bölme = "+((float)sayi1/sayi2));
                break;
            default:
                System.out.println("lütfen doğru seçim yapınız");



        }
    }
}


