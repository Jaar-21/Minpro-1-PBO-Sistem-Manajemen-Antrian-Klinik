    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.klinik;

/**
 *
 * @author Asus
 */
public class Pasien {
    private int idPasien;
    private String nama;
    private int umur;
    private String noTelepon;
    
    public Pasien(int idPasien, String nama, int umur, String noTelepon){
        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;
        this.noTelepon = noTelepon;
    }
    public void tampilkanPasien() {
    System.out.printf("%-10d | %-20s | %-6d | %-15s\n", idPasien, nama, umur, noTelepon);
    }
    
    public int getIdPasien(){
        return idPasien;
    }
    public void setIdPasien(int idPasien){
        this.idPasien = idPasien;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
    public String getNoTelepon(){
        return noTelepon;
    }
    public void setNoTelepon(String noTelepom){
        this.noTelepon = noTelepom;
    }
    
    
}
