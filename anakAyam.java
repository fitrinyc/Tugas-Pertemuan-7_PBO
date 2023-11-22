/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
import java.util.Scanner;

public class anakAyam {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah anak ayam (N): ");
        int totalAnakAyam = scanner.nextInt();

        // Menggunakan perulangan while
        System.out.println("Lagu Anak Ayam Turun " + totalAnakAyam + " (while):");
        int i = totalAnakAyam;
        while (i > 0) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            i--;
        }
    }
}


