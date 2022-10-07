package Soal2;

import java.util.Scanner;

public class luassegitiga {
    private int alas;
    private int tinggi;

    public luassegitiga(int a, int t) {
        this.alas = a;
        this.tinggi = t;

    }

    public double luas(){
        double luas;
        luas = 0.5 * this.alas*this.tinggi;
        return luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan alas Segitiga : ");
        int alas = input.nextInt();
        System.out.println("masukan tinggi segitiga : ");
        int tinggi = input.nextInt();
        luassegitiga segitiga = new luassegitiga(alas, tinggi);
        System.out.println("Luas Segitiga : "+segitiga.luas());
    }

}
