/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
import java.util.Scanner;

public class bilanganPrima {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int start = scanner.nextInt();

        System.out.print("Masukkan angka akhir: ");
        int end = scanner.nextInt();

        System.out.println("Bilangan prima dalam rentang " + start + " hingga " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nBilangan bukan prima dalam rentang " + start + " hingga " + end + ":");
        for (int i = start; i <= end; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk mengecek apakah suatu bilangan adalah bilangan prima
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

