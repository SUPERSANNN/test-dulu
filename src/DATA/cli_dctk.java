package DATA;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AMD KOMPUTER
 */
public class cli_dctk {
        public static void main(String[] args) {
 Data dt = new Mhaswa(); 
 dt.setNim("2218125");
 dt.dataNama("SANDYEKA");
 dt.dataKelas("C");
 dt.dataUmur("19");
 dt.dataJenisKelamin("LAKI-LAKI");
 dt.dataprodi("TEKNIK INFORMATIKA");
 dt.dataAlamat("PASURUAN");
 System.out.println("DATA-DATA MAHASISWA");
 System.out.println("========================");
 System.out.println("NIM   :"+dt.getNim());
 System.out.println("NAMA  :"+dt.cetakNama());
 System.out.println("KELAS :"+dt.cetakKelas());
 System.out.println("UMUR  :"+dt.cetakumur());
 System.out.println("JENIS KELAMIN:"+dt.cetakJenisKelamin());
 System.out.println("PRODI:"+dt.cetakprodi());
 System.out.println("ALAMAT:"+dt.cetakAlamat());
 dt.Absensi();
         }
}