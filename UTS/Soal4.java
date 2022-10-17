import java.util.Scanner;

//Membuat sebuah class dengan nama Lingkaran
class Lingkaran{
    //membuat variabel r bertipe data integer dan phi =314 bertipe data double
    private int r;
    private double phi = 3.14;
    //menggunakan set dan get untuk memasukan data dan menampilkan data
    public void setR(int r){

        this.r = r;
    }

    public int getR(){

        return r;
    }

    public double getPhi(){

        return phi;
    }
}
//KelilingLingkaran adalah bagian dari class lingkaran
class KelilingLingkaran extends Lingkaran{
    //Membuat fungsi double untuk melakukan perhitungan keliling
    public double keliling(int r, double phi){
        double Kel = 2*phi*r;
        return Kel;
    }
}
//LuasLingkaran adalah bagian dari class lingkaran
class LuasLingkaran extends Lingkaran{
    //Membuat fungsi double untuk menghitung luas
    public double Luas(int r, double phi){
        double luas = phi*r*r;
        return luas;
    }
}

public class Soal4 {
    public static void main(String[] args) {
        //Membuat inputan dengan library Scanner
        Scanner input = new Scanner(System.in);
        //Membuat object bernama lingkaran agar dapat dipangil dalam fungsi main
        Lingkaran lingkaran = new Lingkaran();

        //Membuat input nilai jari-jari atau r
        System.out.println("Masukan nilai jari-jari : ");
        //memanggil objek dan fungsi setR untuk input jari jari
        lingkaran.setR(input.nextInt());

        //Membuat objek keliling agar dapat dipanggil didalam fungsi main dari class KelililingLingkaran
        KelilingLingkaran keliling = new KelilingLingkaran();
        //Membuat output keliling
        System.out.println("Keliling dari Lingkaran adalah " +keliling.keliling(lingkaran.getR(), lingkaran.getPhi()));
        //Membuat objek luas agar dapat dipanggil dalam fungsi main dari class LuasLingkaran
        LuasLingkaran luas = new LuasLingkaran();
        //membuat output dari luas
        System.out.println("Luas Lingkaran adalah " +luas.Luas(lingkaran.getR(), lingkaran.getPhi()));


    }
}
