package DATA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMD KOMPUTER
 */
public class Mhaswa extends Data implements MK{
   private String aslab;
     String himpunan;
 
    public void dataHimpunan(String Himpunan){
        this.himpunan = himpunan;
    }
    public String cetakHimpunan(){
        return himpunan;
    }

    public String getAslab() {
        return aslab;
    }

    public void setAslab(String aslab) {
        this.aslab = aslab;
    }
   @Override
        public String Absensi(){
       
        return "ASLAB Wajib Melakukan Absensi Setelah Melakukan Kegiatan Mengajar";
    }
    public String tes(){
        return null;
    }
    @Override
    public String Mk(){
        return "ÖOP";
    }
}