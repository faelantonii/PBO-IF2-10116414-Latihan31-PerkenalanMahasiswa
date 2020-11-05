/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan31_PerkenalanMahasiswa;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan data perkenalan mahasiswa
 */
public class PBO_IF2_10116414_PerkenalanMahasiswa {
    public static void main(String[] args) {
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        System.out.println("Hallo Everyone");
        mahasiswa1.nim = "10116414";
        mahasiswa1.nama = "Fael Antoni Wijaya";
        mahasiswa1.perkenalkanDiri();
        System.out.println("\n");
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        System.out.println("Hallo Everyone");
        mahasiswa2.nim = "10112345";
        mahasiswa2.nama = "Antoni Wijaya Fael";
        mahasiswa2.perkenalkanDiri();
        System.out.println("\n");
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        System.out.println("Hallo Everyone");
        mahasiswa3.nim = "10114321";
        mahasiswa3.nama = "Wijaya Antoni Fael";
        mahasiswa3.perkenalkanDiri();
        System.out.println("\n");
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        System.out.println("Hallo Everyone");
        mahasiswa4.nim = "1011223344";
        mahasiswa4.nama = "Antoni Wijaya";
        mahasiswa4.perkenalkanDiri();
    }
}
