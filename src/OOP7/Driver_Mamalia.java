/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP7;

/**
 *
 * @author AMD KOMPUTER
 */
public class Driver_Mamalia {
    public static void main(String[]args){
        Mamalia kucing = new Mamalia();
        System.out.println("nama hewan = "+ kucing.nama);
        System.out.println("berat hewan = "+ kucing.berat);
        System.out.println("tinggi hewan ="+ kucing.tinggi);
        System.out.println("bernafas menggunakan=" + kucing.bernafas());
    } 
}
