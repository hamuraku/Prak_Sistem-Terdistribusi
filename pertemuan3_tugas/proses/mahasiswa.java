package bab3.proses;

import java.io.Serializable;


/**
 * Bismillahirrahmanirrahim.
 * @author Muhammad Ramadhani K
 */
public class mahasiswa implements Serializable{
    
    private int nim;
    private String nama;
    private String asal;
    private String kelas;
    
    public mahasiswa(int nim, String nama, String asal, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.asal = asal;
        this.kelas = kelas;
    }
   
    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getKelas() {
        return kelas;
    }
    
    @Override
    public String toString(){
        return "\nNIM:\t "+Integer.toString(nim)+"\n"
                + "\nNama:\t "+nama
                + "\nAsal:\t "+asal
                + "\nKelas:\t "+kelas;
    }
    
}
