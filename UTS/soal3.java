import java.util.Scanner;

public class soal3 {
    private int bilangan;
    private int jumlah=0;


    public void inputdata(){
        for(int i = 0; i<10; i++){
            Scanner input = new Scanner(System.in);
            System.out.printf("Masukan bilangan %d : ", i+1);
            bilangan = input.nextInt();
            jumlah = jumlah + bilangan;
        }
    }

    public int hasildata(){
        int hasil = (jumlah);
        return hasil;

    }


    public static void main(String[] args) {
        soal3 data = new soal3();
        data.inputdata();
        System.out.println("Hasil : " +data.hasildata());
    }
}
