/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author AMD KOMPUTER
 */
public class main {
  public static void main(String[] args) {
        kendaraan mobil = new kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama Kendaraan = " + mobil.nama);
        System.out.println("Warna Kendaraan = " + mobil.warna);
        System.out.println("Merk Kendaraan = " + mobil.merk);
        System.out.println("Jumlah Roda = " + mobil.jmlRoda(4) + "\n");
        System.out.println("Cara Bergerak = ");
        System.out.println("Saat Maju = ");
        mobil.kendaraanMaju();
        System.out.println("Saat Mundur = ");
        mobil.kendaraanMundur();
        System.out.println("Saat Berhenti = ");
        mobil.kendaraanBerhenti();
    }  
}
