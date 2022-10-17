import java.util.Scanner;

public class Soal2 {
    //membuat variabel tinggi_badan, berat_badan dengan tipe data yang sama
    private double tinggi_badan ;
    private double berat_badan;

    //membuat fungsi void bernama input_data
    public void input_data(){
        //Membuat inputan dengan Scanner dengan nama variabel input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Tinggi Badan : ");
        tinggi_badan = input.nextDouble();
        System.out.print("Masukan Berat Badan :  ");
        berat_badan = input.nextDouble();
        //menampilkan output tinggi dan berat badan
        System.out.printf("\nTinggi : %2f Kg", tinggi_badan);
        System.out.printf("\nBerat : %2f m \n", berat_badan);
    }

    //Membuat fungsi HitungBMI
    double HitungBMI(){
        //Mendeklarasikan variabel BMI dengan tipe data double
        double BMI;
        //melakukan perhitungan BMI dimana berat_badan dbagi tinggi_badan pangkat 2
        BMI = this.berat_badan/(this.tinggi_badan*this.tinggi_badan);

        //Membuat kondisi dengan menggunakan if-else dimana jika BMI diantara 18.5 - 22.9 berat badan ideal
        //jika BMI lebih dari sama dengan 22.9 maka berat badan overwegiht
        //jika BMI kurang dari sama dengan 18.9 berat badan underwegiht
        if(BMI >= 18.5 && BMI <= 22.9){
            System.out.println("Berat Badan Ideal");
        } else if (BMI >= 22.9) {
            System.out.println("Berat badan Overwegiht");
        }else{
            System.out.println("Berat badan Underwegiht");
        }
        //mengembalikan nilai BMI
        return BMI;
    }

    public static void main(String[] args) {
        //Membuat objek data agar dapat di panggil di fungsi main dengan class Soal2
        Soal2 data = new Soal2();
        //memanggil objek data di fungsi input_data
        data.input_data();
        //memanggil objek data di fungsi HitungBMI
        data.HitungBMI();

    }
}
