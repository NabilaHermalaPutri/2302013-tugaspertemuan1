package Helloworld;

import java.util.Scanner; 

public class Code { 
    public static void main(String[] args) { 

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine(); 

        System.out.print("Masukkan NIM  : ");
        String nim = input.nextLine(); 

        // Menampilkan output ke layar
        System.out.println("Hallo World " + nama + " dan NIM " + nim); 
        System.out.println("Saya Senang Belajar Java"); 

        // Menutup scanner
        input.close(); 
    }
}
