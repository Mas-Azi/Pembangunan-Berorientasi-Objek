import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        boolean isFound;
        String kalimat = "Indonesia adalah negara maritim dimana terdapat berbagai macam pulau-pulau dan budaya yang sangat beragam";
        String kata;
        System.out.println("Kalimat: " + kalimat);
        do {
            System.out.print("Masukan kata yang ingin anda cari di dalam kalimat: ");
            kata = masukan.nextLine();
            isFound = kalimat.contains(kata);
            if (!isFound) {
                System.out.println("Kata tidak ditemukan");
            } else {
                System.out.println("Kata ditemukan.");
            }
        } while (!isFound);
    }
}
