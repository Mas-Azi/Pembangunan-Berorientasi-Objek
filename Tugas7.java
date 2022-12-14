import java.util.Scanner;

class golongan1 extends Tugas7{
    //membuat fungsi di golongan 1
    public double golongan1(int gajipokok, int tunjangan) {
        gajipokok = 1486500;
        tunjangan = 250000;

        // perhitungan gaji dengan menggunakan double agar terdapat koma dalam perkaliannya
        double gajikotor = gajipokok + tunjangan;
        double gajitotal = gajikotor * 0.005;
        double gaji = gajikotor - gajitotal;
        return gaji;
    }
}

class golongan2 extends Tugas7{
    //fungsi golongan 2
    public double golongan2(int gajipokok, int tunjangan) {
        gajipokok = 1926000;
        tunjangan = 300000;

        // menghitung gaji dengan tipe data double
        double gajikotor = gajipokok + tunjangan;
        double gajitotal = gajikotor * 0.005;
        double gaji = gajikotor - gajitotal;
        return gaji;
    }

}

class golongan3 extends Tugas7{
    public double golongan3(int gajipokok, int tunjangan){
        gajipokok = 2456700;
        tunjangan = 350000;

        int gajikotor = gajipokok+tunjangan;

        double gajitotal = gajikotor * 0.005;
        double gaji = gajikotor - gajitotal;

        return gaji;
    }
}
class golongan4 extends Tugas7{
    public double golongan4(int gajipokok, int tunjangan){
        gajipokok = 2899500;
        tunjangan = 400000;

        int gajikotor = gajipokok+tunjangan;

        double gajitotal = gajikotor * 0.005;
        double gaji = gajikotor - gajitotal;

        return gaji;

    }

}
public class Tugas7 {
    // membuat varibel gajipokok, tunjangan dan jam
    private int gajipokok;
    private int tunjangan;
    private int jam;

    // set dam get jam untuk menginput lamanya bekerja dan menampilkan lamanya bekerja
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    public static void main(String[] args) {
        Tugas7 gaji = new Tugas7();
        //membuat Scanner untuk input jam
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan lama Waktu kerja : ");
        gaji.setJam(input.nextInt());
        //memanggil get.jam
        System.out.println("Jam kerja Karyawan adalah " +gaji.getJam());

        // Membuat objek baru baru yaitu gaji sesuai golongan
        int lembur = gaji.getJam();
        golongan1 gol1 = new golongan1();
        golongan2 gol2 = new golongan2();
        golongan3 gol3 = new golongan3();
        golongan4 gol4 = new golongan4();

        // Membuat if else condition untuk membedakan gaji sesui dengan jam kerja
        if(lembur>173){
            int jamlembur = lembur - 173;
            System.out.println("Jamlembur = "+ jamlembur);
            // membuat variabel untuk menghitung bayaran yang diterima saat lembur
            int hargalembur = jamlembur * 20000;
            System.out.println("Total jam kerja = "+ gaji.getJam());
            // Memanggil hasil perhitungan gaji golongan di class yang telah dibuat
            System.out.println("Total gaji golongan 1 = Rp. " + (gol1.golongan1(gaji.gajipokok, gaji.tunjangan)+hargalembur));
            System.out.println("Total gaji golongan 2 = Rp. " + (gol2.golongan2(gaji.gajipokok, gaji.tunjangan)+hargalembur));
            System.out.println("Total gaji golongan 3 = Rp. " + (gol3.golongan3(gaji.gajipokok, gaji.tunjangan)+hargalembur));
            System.out.println("Total gaji golongan 4 = Rp. " + (gol4.golongan4(gaji.gajipokok, gaji.tunjangan)+hargalembur));

        }else if(lembur == 173){
            int jamlembur =0;
            System.out.println("Jamlembur = "+jamlembur);
            // memanggil hasil perhitungan gaji golongan di class yang telah dibuat
            System.out.println("Total jam kerja = "+ lembur);
            System.out.println("Total gaji golongan 1 = Rp. " + gol1.golongan1(gaji.gajipokok, gaji.tunjangan));
            System.out.println("Total gaji golongan 2 = Rp. " + gol2.golongan2(gaji.gajipokok, gaji.tunjangan));
            System.out.println("Total gaji golongan 3 = Rp. " + gol3.golongan3(gaji.gajipokok, gaji.tunjangan));
            System.out.println("Total gaji golongan 4 = Rp. " + gol4.golongan4(gaji.gajipokok, gaji.tunjangan));
        }
    }
}
