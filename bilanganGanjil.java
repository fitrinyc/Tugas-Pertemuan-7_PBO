/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
import java.util.Scanner;

public class  bilanganGanjil{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int start = scanner.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int end = scanner.nextInt();

        // Deret bilangan ganjil
        System.out.println("Deret bilangan ganjil (while):");
        int oddNumber = start;
        while (oddNumber <= end) {
            if (oddNumber % 2 != 0) {
                System.out.print(oddNumber + " ");
            }
            oddNumber++;
        }

        // Deret bilangan genap
        System.out.println("\nDeret bilangan genap (while):");
        int evenNumber = start;
        while (evenNumber <= end) {
            if (evenNumber % 2 == 0) {
                System.out.print(evenNumber + " ");
            }
            evenNumber++;
        }
    }
}

