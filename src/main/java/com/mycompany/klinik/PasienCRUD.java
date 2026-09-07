/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinik;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class PasienCRUD {
    private ArrayList<Pasien> ListPasien = new ArrayList<>();
    
    ///tambahkan pasien
    public void tambahPasien(Pasien pasien){
        ListPasien.add(pasien);
        System.out.println("Pasien ditambahkan");
    }
    
    ///tampilkan pasien
    public void tampilkanPasien(){
        if (ListPasien.isEmpty()){
            System.out.println("belum ada data pasien");
        }else{
            System.out.println("===== DAFTAR PASIEN =====");
            System.out.printf("%-10s | %-20s | %-6s | %-15s\n","ID", "Nama", "Umur", "NO Telepon");
        for (Pasien pasien : ListPasien){
            pasien.tampilkanPasien();
        }
        }
        
    }
    ///hapus pasien
    public void hapusPasien(int idPasien){
        Pasien pasienHapus = null;
        for (Pasien pasien : ListPasien){
            if (pasien.getIdPasien() == idPasien){
                pasienHapus = pasien;
                break;
            }
        }
        if (pasienHapus != null){
            ListPasien.remove(pasienHapus);
            System.out.println("pasien berhasil dihapus");
        }else{
            System.out.println("ID pasien tidak ditemukan");
        }
    }
    ///update pasien
    public void updatePasien(int idPasien, String namaBaru, int umurBaru, String noTeleponBaru){
        Pasien pasienDitemukan = null;
        for (Pasien pasien : ListPasien){
            if (pasien.getIdPasien()== idPasien){
                pasienDitemukan = pasien;
                break;
            }
        }
        if (pasienDitemukan != null){
            pasienDitemukan.setNama(namaBaru);
            pasienDitemukan.setUmur(umurBaru);
            pasienDitemukan.setNoTelepon(noTeleponBaru);
            System.out.println("pasien berhasil diupdate");
        }else{
            System.out.println("ID pasien tidak ditemukan");
        }
    }
    ///panggil pasien
    public void panggilPasien(int idPasien){
        Pasien pasienDipanggil = null;
        
        for (Pasien pasien : ListPasien){
            if (pasien.getIdPasien()== idPasien){
                pasienDipanggil = pasien;
                break;
            }
        }
        if (pasienDipanggil != null){
            System.out.println("Panggilan atas nama Pasien "+ pasienDipanggil.getNama() + " Silahkan memasuki ruangan");
            ListPasien.remove(pasienDipanggil);
            
        }else{
            System.out.println("ID pasien tidak ditemukan");
        }
    }
    
}

