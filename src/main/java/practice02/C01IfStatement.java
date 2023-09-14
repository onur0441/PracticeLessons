package practice02;

import java.util.Scanner;

public class C01IfStatement {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner input =new Scanner(System.in);
        System.out.println("please enter two number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 >0 && num2 > 0){
            System.out.println("Toplam ="+(num1+num2));
        } else if (num1 <0 && num2 <0) {
            System.out.println("Çarpım ="+(num1*num2));

        } else if ((num1 >0 && num2 <0) || (num1<0 && num2 >0) ) {
            System.out.println("Farklı işaretli sayılarla işlem yapamayız");
        } else {
            System.out.println("Sıfır çarpmaya göre yutan elemandır");
        }
    }
}
