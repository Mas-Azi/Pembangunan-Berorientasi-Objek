import java.util.Scanner;

public class soal1 {
    private int jam_awal, menit_awal, detik_awal;
    private int jam_akhir, menit_akhir, detik_akhir;
    private int lamapercakapan;

    public void inputwaktu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jam Awal : ");
        jam_awal = input.nextInt();
        System.out.print("Masukan Menit Awal : ");
        menit_akhir = input.nextInt();
        System.out.print("Masukan Detik Awal : ");
        detik_akhir = input.nextInt();
        System.out.print("Masukan Jam Akhir : ");
        jam_akhir = input.nextInt();
        System.out.print("Masukan Menit Akhir : ");
        menit_akhir = input.nextInt();
        System.out.print("Masukan Detik Akhir : ");
        detik_akhir = input.nextInt();
    }
    public void LamaPercakapan(){
        lamapercakapan = (jam_akhir-jam_awal)*3600 + (menit_akhir-menit_awal)*60 + (detik_akhir-detik_awal);
        int jumlah_jam = lamapercakapan/3600;
        int jumlah_menit = (lamapercakapan % 3600)/60;
        int jumlah_detik = lamapercakapan % 3600 % 60;

        System.out.println("Lama Percakapan: " +jumlah_jam +" Jam " +jumlah_menit +" Menit "  +jumlah_detik +" Detik");

    }

    public void BiayaPercakapan(){
        double biaya_percakapan = (lamapercakapan / 5) *150;
        System.out.println("Biaya Percakapan : " +biaya_percakapan);
    }

    public static void main(String[] args) {
        soal1 data = new soal1();
        data.inputwaktu();
        data.LamaPercakapan();
        data.BiayaPercakapan();
    }
}
