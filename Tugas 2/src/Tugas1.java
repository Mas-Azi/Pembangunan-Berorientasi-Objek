import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        do{
            int nilai;
            System.out.print("Menginput nilai 0-10 : ");
            nilai = masukan.nextInt();
            if (nilai >= 1 && nilai <= 10){
                System.out.println("Inputan yang kamu masukan benar");
                break;
            } else {
                System.out.println("Inputan yang ada masukan salah silahkan ulangi");
            }
        } while(true);
    }
}
