/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATA;

/**
 *
 * @author AMD KOMPUTER
 */
public class Data1 {
    private  String nim;
    public String nama,kelas,umur,JenisKelamin,prodi,alamat,absen;
          
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

    public String cetakprodi(){
        return prodi;
    }
    public String cetakAlamat(){
        return alamat;
    }
    public String Absensi(){
        System.out.println("Mahasiswa Wajib Melakukan Absensi Setelah Menyelesaikan Kelas Mata Kuliah");
        return absen;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
