/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

public class abjad {

    public static void main(String[] args) {
        // Menggunakan perulangan do-while
        System.out.println("Huruf Z - A (do-while):");
        char currentChar = 'Z';
        do {
            System.out.print(currentChar + " ");
            currentChar--;
        } while (currentChar >= 'A');
    }
}
