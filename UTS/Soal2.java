import java.util.Scanner;

public class Soal2 {
    private double tinggi_badan ;
    private double berat_badan;

    public void input_data(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Tinggi Badan : ");
        tinggi_badan = input.nextDouble();
        System.out.print("Masukan Berat Badan :  ");
        berat_badan = input.nextDouble();
    }

    double HitungBMI(){
        double BMI;
        BMI = this.berat_badan/(this.tinggi_badan*this.tinggi_badan);


        if(BMI >= 18.5 && BMI <= 22.9){
            System.out.println("Berat Badan Ideal");
        } else if (BMI >= 22.9) {
            System.out.println("Berat badan Overwegiht");
        }else{
            System.out.println("Berat badan Underwegiht");
        }
        return BMI;
    }

    public static void main(String[] args) {
        Soal2 data = new Soal2();
        data.input_data();
        data.HitungBMI();

    }
}
