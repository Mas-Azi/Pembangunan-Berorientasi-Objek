import java.util.Scanner;

public class soal1 {
    // mendeklerasikan variabel dengan tipe data integer dan bersifat privat
    private int jam_awal, menit_awal, detik_awal;
    private int jam_akhir, menit_akhir, detik_akhir;
    private int lamapercakapan;

    // Membuat Suatu Fungsi dengan nama inputwaktu
    public void inputwaktu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jam Awal : ");
        jam_awal = input.nextInt();
        System.out.print("Masukan Menit Awal : ");
        menit_awal = input.nextInt();
        System.out.print("Masukan Detik Awal : ");
        detik_awal = input.nextInt();
        System.out.print("Masukan Jam Akhir : ");
        jam_akhir = input.nextInt();
        System.out.print("Masukan Menit Akhir : ");
        menit_akhir = input.nextInt();
        System.out.print("Masukan Detik Akhir : ");
        detik_akhir = input.nextInt();
        //menampilkan output waktu awal dan waktu akhir menggunakan printf
        System.out.printf("\nWaktu Awal : %d : %d : %d ", jam_awal, menit_awal, detik_awal);
        System.out.printf("\nWaktu Akhir : %d : %d : %d \n", jam_akhir, menit_akhir, detik_akhir);
    }
    //Membuat fungsi untuk menghitung lama percakapan Smartphone
    public void LamaPercakapan(){
        //Melakukan perhitungan lama percakapan
        lamapercakapan = (jam_akhir-jam_awal)*3600 + (menit_akhir-menit_awal)*60 + (detik_akhir-detik_awal);
        //Menghitung jumlah_jam, jumlah_menit, dan jumlah_detik
        int jumlah_jam = lamapercakapan/3600;
        int jumlah_menit = (lamapercakapan % 3600)/60;
        int jumlah_detik = lamapercakapan % 3600 % 60;
        //menampilkan output hasil dari perhitungan lama percakapan
        System.out.println("Lama Percakapan: " +jumlah_jam +" Jam " +jumlah_menit +" Menit "  +jumlah_detik +" Detik");

    }

    //Membuat Fungsi void dengan variabel BiayaPercakapan
    public void BiayaPercakapan(){
        // biaya percakapan itu hasil dari lamanyapercakapan dibagi 5 baru dikali Rp150
        double biaya_percakapan = (lamapercakapan / 5) *150;
        System.out.println("Biaya Percakapan : " +biaya_percakapan);
    }

    public static void main(String[] args) {
        //Membuat objek agar dapat di panggil di fungsi main dengan class soal1
        soal1 data = new soal1();
        //Memanggil objek data pada fungsi inputwaktu
        data.inputwaktu();
        //Memanggil objek data pada fungsi lamapercakapan
        data.LamaPercakapan();
        //memanggil objek data pada fungsi Biaya percakapan
        data.BiayaPercakapan();
    }
}
