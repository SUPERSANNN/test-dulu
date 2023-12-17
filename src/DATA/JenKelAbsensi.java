/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATA;

/**
 *
 * @author AMD KOMPUTER
 */
public class JenKelAbsensi extends Data  {
    String lakilaki, perempuan;
    public JenKelAbsensi(){
        this.lakilaki = lakilaki;
        this.perempuan = perempuan;
    }
//    public JenKelAbsensi(){
//    A = "laki";
//    B = "Peremepuan";
//    }
    @Override
    public String Absensi(){
        if (JenisKelamin == lakilaki) {
            System.out.println("penggunaan stamina lebih besar tetapi jarang berfikir ");
        } else {
            System.out.println("penggunaan stamina kecil tetapi lebih berfikir otaknya");
        }
        return Absensi();
    }

    void Stamina() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
