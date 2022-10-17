import java.util.Scanner;

public class soal3 {
    //Mendeklarasikan variabel bilangan dan jumlah dengan tipe data integer
    private int bilangan;
    private int jumlah=0;

    //membuat fungsi inputdata
    public void inputdata(){
        //membuat inputan data di dalam perulangan dimana perulangan akan berhenti
        //jika sudah sampai 10 kali. perulangan ini saya menggunakna for
        //menggunakan librari scanner untuk inputan dari keyboard
        for(int i = 0; i<10; i++){
            Scanner input = new Scanner(System.in);
            System.out.printf("Masukan bilangan %d : ", i+1);
            bilangan = input.nextInt();
            //melakukan perhitungan jumlah bilangan
            jumlah = jumlah + bilangan;
        }
    }

    //membuat fungsi hasildata dengan tipe data integer
    public int hasildata(){
        // memanggil hasil dari jumlah
        int hasil = (jumlah);
        //mengembalikan nilai hasil
        return hasil;

    }


    public static void main(String[] args) {
        //Membuat objek agar dapat di panggil di fungsi main dengan class soal3
        soal3 data = new soal3();
        //memanggil objek data yang ada didalam fungsi inputdata untuk ditampilkan
        data.inputdata();
        //menampilkan output hasil perhitungan jumlah data
        System.out.println("Hasil : " +data.hasildata());
    }
}
