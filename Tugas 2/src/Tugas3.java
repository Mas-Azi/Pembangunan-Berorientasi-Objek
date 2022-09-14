import java.util.Random;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        String pilihanKomputer, pilihanManusia;
        int pointKomputer = 0, pointManusia = 0;
        String[] opsi = {"jempol", "telunjuk", "kelingking"};
        Scanner input = new Scanner(System.in);
        String pilihanLanjut;

        while (true) {
            pilihanKomputer = opsi[new Random().nextInt(opsi.length)];
            while (true) {
                System.out.print("Masukan pilihan: ");
                pilihanManusia = input.nextLine();
                if (pilihanManusia.equals(opsi[0]) || pilihanManusia.equals(opsi[1]) || pilihanManusia.equals(opsi[2])) {
                    break;
                } else {
                    System.out.println("Pilihan tidak valid");

                }
            }

            System.out.println("Komputer memilih: " + pilihanKomputer);
            System.out.println("Anda memilih: " + pilihanManusia);

            if (pilihanManusia.equals(pilihanKomputer)) {
                System.out.println("Seri!");
            } else if (pilihanManusia.equals("jempol") && pilihanKomputer.equals("telunjuk")) {
                System.out.println("Menang!");
                pointManusia++;
            } else if (pilihanManusia.equals("telunjuk") && pilihanKomputer.equals("kelingking")) {
                System.out.println("Menang!");
                pointManusia++;
            } else if (pilihanManusia.equals("kelingking") && pilihanKomputer.equals("jempol")) {
                System.out.println("Menang");
                pointManusia++;
            } else {
                System.out.println("Kalah!");
                pointKomputer++;
            }

            System.out.printf("Komputer: %d, Anda: %d\n\n", pointKomputer, pointManusia);

            while (true) {
                System.out.print("Main lagi? [y/t]: ");
                pilihanLanjut = input.nextLine();

                if (pilihanLanjut.equals("y") || pilihanLanjut.equals("t")) {
                    break;
                } else {
                    System.out.println("Pilihan tidak valid");
                }
            }

            if (pilihanLanjut.equals("y")) {
                continue;
            } else {
                break;
            }
        }
    }
}
