package DATA;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMD KOMPUTER
 */
public class UKM extends Data implements MK {
   private String tempatlat;
    String jenisukm;


public void datajenisUKM(String jenisukm)
{
this.jenisukm = jenisukm;
}


public String cetakjenisUKM()
{
return jenisukm;
}

    public String getTempatlat() {
        return tempatlat;
    }

    public void setTempatlat(String tempatlat) {
        this.tempatlat = tempatlat;
    }
    
    
   @Override
   public String Absensi(){
        
        return "Mahasiswa Wajib Melakukan Absensi Setelah Melakukan Kegiatan ";
    }
 public String tes(){
        return null;
    }
     @Override
    public String Mk(){
        return "ÖOP";
    }
}