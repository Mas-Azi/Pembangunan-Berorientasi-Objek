package Soal1;

import java.util.Scanner;

public class Mahasiswa {
    //atribut
    private double nilai;
    private String grade;

    public Mahasiswa(double nilai) {
        this.nilai = nilai;
        if (nilai >= 90){
            grade = "A";
        } else if (nilai >=80) {
            grade = "A-";
        } else if (nilai >= 75) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "B-";
        }else if (nilai >= 60) {
            grade = "C+";
        }else if (nilai >= 55) {
            grade = "C";
        }else if (nilai >= 50) {
            grade = "C-";
        }else if (nilai >= 40) {
            grade = "D";
        }else {
            grade = "E";
        }
    }

    public double getNilai() {
        return nilai;
    }

    public String getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Total Nilai : ");
        double angka = input.nextDouble();
        Mahasiswa nilai = new Mahasiswa(angka);

        System.out.println("Hasil :");
        System.out.println("Nilai Angka = " +nilai.getNilai());
        System.out.println("Nilai Huruf = " +nilai.getGrade());

    }



}
