package practice02;

import java.util.Scanner;

public class C06Switch {
    public static void main(String[] args) {
        /*
       Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
       Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


       NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
            4, 6, 9, 11. aylar 30 gun çeker
            2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen yıl no giriniz");
        int yil = input.nextInt();
        System.out.println("lütfen 0-12 ay numarası giriniz");
        int ay = input.nextInt();

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girdiğiniz ay 31 gün çeker");break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girdiğiniz ay 30 gün çeker");break;
            case 2:
                if(yil % 4==0){
                    System.out.println("Girfiğiniz ay 29 çeker");
                }else {
                    System.out.println("Girdiğiniz ay 28 gün çeker");
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz");

        }

    }
}
