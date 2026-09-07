/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinik;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        PasienCRUD crud = new PasienCRUD();
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;
        
        while (berjalan){
            System.out.println("==========================================");
            System.out.println("      SISTEM MANAJEMEN PASIEN KLINIK");
            System.out.println("==========================================");            
            System.out.println("1. Tampilkan Pasien");
            System.out.println("2. Tambahkan Pasien");
            System.out.println("3. Update Pasien");
            System.out.println("4. Menghapus Pasien");
            System.out.println("5. Panggil Pasien");
            System.out.println("6. Keluar");

            int pilihan = ValidasiInput.inputInteger(scanner, "Pilih menu 1-6 : ");
            
            switch (pilihan){
                
                case 1:
                crud.tampilkanPasien();
                break;
                
                case 2:
                    crud.tampilkanPasien();
                    System.out.println("=====TAMBAH PASIEN=====");
                    
                    int id = ValidasiInput.inputInteger(scanner, "Masukkan ID Pasien : ");
                    
                    System.out.print("masukkan nama pasien : ");
                    String nama = scanner.nextLine();
                    
                    int umur = ValidasiInput.inputInteger(scanner, "Masukkan umur pasien : ");
                    if (umur <= 0) {
                    System.out.println("Umur harus lebih dari 0");
                    break;}
                    
                    System.out.print("masukkan no telepon : ");
                    String noTelepon = scanner.nextLine();
                    
                    Pasien pasienBaru = new Pasien(id, nama, umur, noTelepon);
                    crud.tambahPasien(pasienBaru);
                    break;
               
                case 3:
                    crud.tampilkanPasien();
                    System.out.println("=====UPDATE PASIEN=====");
                  
                    int idUpdate = ValidasiInput.inputInteger(scanner, "Masukkan ID Pasien : ");
                    
                    System.out.print("Nama baru : ");
                    String namaBaru = scanner.nextLine();
                    
                    int umurBaru = ValidasiInput.inputInteger(scanner, "Masukkan umur pasien : ");
                    if (umurBaru <=0){
                    System.out.println("Umur harus lebih dari 0");
                    break;}
                    
                    System.out.print("NO telepon baru : ");
                    String noTeleponBaru = scanner.nextLine();
                    
                    crud.updatePasien(idUpdate, namaBaru, umurBaru, noTeleponBaru);
                    break;
                    
                case 4:
                    crud.tampilkanPasien();
                    System.out.println("=====HAPUS DATA PASIEN=====");
                    
                    int idHapus = ValidasiInput.inputInteger(scanner, "Masukkan ID Pasien yang ingin dihapus : ");
                    
                    crud.hapusPasien(idHapus);
                    break;
                    
                case 5:
                    crud.tampilkanPasien();
                    System.out.println("=====PANGGIL PASIEN=====");
                    int idPanggil = ValidasiInput.inputInteger(scanner, "Masukkan ID Pasien : ");
                    
                    crud.panggilPasien(idPanggil);
                    break;
                    
                case 6:
                    berjalan = false;
                    System.out.println("program selesai");
                    break;
                    
                default:
                    System.out.println("pilihan tidak valid");
                                 
            }
        }
            
       scanner.close();
    }
}