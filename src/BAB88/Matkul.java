/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB88;
/**
 *
 * @author Computer 8
 */
public class Matkul {
    String kode_mk, nama_mk, dosen_pengampu;
    int jml_sks;


    public String getKode_mk() {
        return kode_mk;
    }

    public String getNama_mk() {
        return nama_mk;
    }

    public String getDosen_pengampu() {
        return dosen_pengampu;
    }

    public int getJml_sks() {
        return jml_sks;
    }

    public void setNama_mk(String nama_mk) {
        this.nama_mk = nama_mk;
    }

    public void setKode_mk(String kode_mk) {
        this.kode_mk = kode_mk;
    }

    public void setDosen_pengampu(String dosen_pengampu) {
        this.dosen_pengampu = dosen_pengampu;
    }

    public void setJml_sks(int jml_sks) {
        this.jml_sks = jml_sks;
    }
}
