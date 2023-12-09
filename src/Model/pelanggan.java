/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Be
 */
public class pelanggan {
    private int id;
    private String nama_pelanggan;
    private String alamat;
    private String no_telp;
    private String no_identitas;

    public pelanggan(int id, String nama_pelanggan, String alamat, String no_telp, String no_identitas) {
        this.id = id;
        this.nama_pelanggan = nama_pelanggan;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.no_identitas = no_identitas;
    }

    public pelanggan() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nama_pelanggan
     */
    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    /**
     * @param nama_pelanggan the nama_pelanggan to set
     */
    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the no_telp
     */
    public String getNo_telp() {
        return no_telp;
    }

    /**
     * @param no_telp the no_telp to set
     */
    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    /**
     * @return the no_identitas
     */
    public String getNo_identitas() {
        return no_identitas;
    }

    /**
     * @param no_identitas the no_identitas to set
     */
    public void setNo_identitas(String no_identitas) {
        this.no_identitas = no_identitas;
    }
    
}
