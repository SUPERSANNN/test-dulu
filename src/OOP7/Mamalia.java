/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP7;

/**
 *
 * @author AMD KOMPUTER
 */
public  class Mamalia extends MakhlukHidup {
    public Mamalia(){
        nama = "kucing";
        tinggi = 20;
        berat = 3;
    }

    @Override
    String bernafas(){
    return "bernafas menggunakan paru-paru";
    }
}
