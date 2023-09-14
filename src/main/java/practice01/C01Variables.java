package practice01;

public class C01Variables {

    public static void main(String[] args) {

        int yas =30;
        System.out.println(yas);

        byte yas1 =15;
        Integer yas2= (int) yas1;

      int benimYasim =yas;

      String isim = "MUHAMMED CAN ALİ";
        System.out.println("isim = " + isim);
        String onunIsmi= isim;

        isim ="onur";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        isim ="ahmet";
        System.out.println("isim = " + isim);

        //auto widening örneği;
        short x=868;
        int y=x;

        //explicit narrowing
        int a=32767;
        short b= (short) a;
        System.out.println(b);

        int c=Integer.MAX_VALUE;
        System.out.println(c);

    }

}

//(int) bir variable(yas)  olustur ve yazdır
//(int) bir variable(sayi)  olustur ve yazdır
//konsola sayi = 50 seklinde yazdır
//yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala
//String bir variable olusturalım (isim)
//isim variable ını etiketıyle yazdır
//onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala
//onunIsmi variable'ını etiketiyle yazdır
//isim variable'ının degerini guncelle
//isim ve onunIsmi variable'larını yazdır