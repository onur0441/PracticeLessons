package practice04;

import java.util.ArrayList;
import java.util.Scanner;
public class Mentor_Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("pazartesi");
        gunler.add("sali");
        gunler.add("carşamba");
        gunler.add("perşembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();
        int i = 0;
        while (i < gunler.size()) {
            System.out.print("lütfen " +gunler.get(i) + " gününün kazancini giriniz = ");
            double kazanc = input.nextDouble();
            gunlukKazanclar.add(i, kazanc);
            i++;
        }
        double ortalama = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("haftalık ortalama kazanc = " + ortalama);
        System.out.println("ortalamanin üstünde olan kazanc günleri : " + getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalama));
        System.out.println("ortalamanin altında olan kazanc günleri : " + getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalama));
    }

    private static double getOrtalamaKazanc(ArrayList<Double> gunlukKazanclar) {
        double sum = 0;
        for (double w : gunlukKazanclar) {
            sum += w;
        }
        return sum / gunlukKazanclar.size();
    }

    private static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalama) {
        ArrayList<String> ortalamaUstGunler = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) > ortalama) {
                ortalamaUstGunler.add(gunler.get(i));
            }
        }
        return ortalamaUstGunler;
    }

    private static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalama) {
        ArrayList<String> ortalamaAltGunler = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            if (gunlukKazanclar.get(i) < ortalama) {
                ortalamaAltGunler.add(gunler.get(i));
            }
        }
        return ortalamaAltGunler;
    }
}