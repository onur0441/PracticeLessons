package practice03;

import java.util.*;

public class GenelTekrar {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen ilerlemek istediğiniz harfi giriniz");
        char harf =input.next().charAt(0);

        for (int i = 'a'; i <=harf; i++) {
            for (int j = 'a'; j <=i ; j++) {
                System.out.print((char) j+" ");

            }
            System.out.println();
            
        }








        }


        }







