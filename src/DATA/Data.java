package DATA;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author AMD KOMPUTER
 */
public abstract class Data {
    private  String nim;
    public String nama,kelas,umur,JenisKelamin,prodi,alamat,absen;//JenisKelamin
          
    public void dataNama(String nama){
        this.nama = nama;
    }
    public void dataKelas(String kelas){
        this.kelas = kelas;
    }
    public void dataUmur(String umur){
    this.umur = umur;
    }
    public void dataJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }  
    
    public void dataprodi(String prodi){
        this.prodi= prodi;
    }
    public void dataAlamat(String alamat){
        this.alamat = alamat;
    }  
    public String cetakNama(){
        return nama;
    }
    public String cetakKelas(){
        return kelas;
    }
    public String cetakumur(){
        return umur;
    }
    public String cetakJenisKelamin(){
        return JenisKelamin;
    }
    
    public String cetakJenisKelamin(JenKelAbsensi obj){
        return JenisKelamin;
    }

    public String cetakprodi(){
        return prodi;
    }
    public String cetakAlamat(){
        return alamat;
    }
    public abstract String Absensi();

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    //Overload
    public List cetakdata(){
        List list= new ArrayList<>();
        list.add(nim);
        list.add(nama);
        list.add(kelas);
        list.add(umur);
        list.add(JenisKelamin);
        list.add(prodi);
        list.add(alamat);
      
        return list;
    }
    public List cetakdata(String minat){
        List list= new ArrayList<>();
        list.add(nim);
        list.add(nama);
        list.add(kelas);
        list.add(umur);
        list.add(JenisKelamin);
        list.add(prodi);
        list.add(alamat);
        list.add(minat);
        return list;
    }
}