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
public class kendaraan {
    private int id;
    private String nama_kendaraan;
    private String no_polisi;
    private String tahun_kendaraan;
    private String biaya_sewa;
    private String status;

    public kendaraan(int id, String nama_kendaraan, String no_polisi, String tahun_kendaraan, String biaya_sewa, String status) {
        this.id = id;
        this.nama_kendaraan = nama_kendaraan;
        this.no_polisi = no_polisi;
        this.tahun_kendaraan = tahun_kendaraan;
        this.biaya_sewa = biaya_sewa;
        this.status = status;
    }
    
    public kendaraan() {
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
     * @return the nama_kendaraan
     */
    public String getNama_kendaraan() {
        return nama_kendaraan;
    }

    /**
     * @param nama_kendaraan the nama_kendaraan to set
     */
    public void setNama_kendaraan(String nama_kendaraan) {
        this.nama_kendaraan = nama_kendaraan;
    }

    /**
     * @return the no_polisi
     */
    public String getNo_polisi() {
        return no_polisi;
    }

    /**
     * @param no_polisi the no_polisi to set
     */
    public void setNo_polisi(String no_polisi) {
        this.no_polisi = no_polisi;
    }

    /**
     * @return the tahun_kendaraan
     */
    public String getTahun_kendaraan() {
        return tahun_kendaraan;
    }

    /**
     * @param tahun_kendaraan the tahun_kendaraan to set
     */
    public void setTahun_kendaraan(String tahun_kendaraan) {
        this.tahun_kendaraan = tahun_kendaraan;
    }

    /**
     * @return the biaya_sewa
     */
    public String getBiaya_sewa() {
        return biaya_sewa;
    }

    /**
     * @param biaya_sewa the biaya_sewa to set
     */
    public void setBiaya_sewa(String biaya_sewa) {
        this.biaya_sewa = biaya_sewa;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
}
