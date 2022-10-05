import java.util.Scanner;

public class BangunDatar {
    private int alas;
    private int tinggi;


    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        double luas;
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    private int r;
    public void setjarijari(int r) {

        this.r = r;
    }

    public double luas(){
        double luas;
        double phi = 3.14;
        luas = phi*r*r;
        return luas;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunDatar segitiga = new BangunDatar();

        System.out.print("Masukan alas Segitiga : ");
        segitiga.setAlas(input.nextInt());
        System.out.print("Masukan tinggi Segitiga : ");
        segitiga.setTinggi(input.nextInt());

        System.out.println("Alas Segitiga   : " +segitiga.alas);
        System.out.println("Tinggi Segitiga : " +segitiga.tinggi);
        System.out.println("Luas Segitiga : " +segitiga.hitungLuas());

        BangunDatar lingkaran = new BangunDatar();
        System.out.print("Masukan jari-jari : ");
        lingkaran.setjarijari(input.nextInt());

        System.out.println("Jari-Jari Lingkaran : " +lingkaran.r);
        System.out.println("Luas Lingkaran : " +lingkaran.luas());
    }
}
