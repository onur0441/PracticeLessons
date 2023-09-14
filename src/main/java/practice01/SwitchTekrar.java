package practice01;

import java.util.Scanner;

public class SwitchTekrar {
    public static void main(String[] args) {

        String dayName = "WEDnesday";
        switch (dayName.toUpperCase()){
            case "sunday" :
                System.out.println(1);
                break;
            case "monday" :
                System.out.println(2);
                break;
            case "tuesday" :
                System.out.println(3);
                break;
            case "wednesday" :
                System.out.println(4);
                break;
            case "thursday" :
                System.out.println(5);
                break;
            case "friday" :
                System.out.println(6);
                break;
            case "saturday" :
                System.out.println(7);
                break;
            default:
                System.out.println("Lutfen gecerli gun ismi giriniz..");
        }


    }
}
