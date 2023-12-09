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
public class transaksi {
    private int id_transaksi;
    private String peminjam;
    private String nopol;
    private String harga;
    private int tgl_pinjaman;
    private int tgl_kembali;
    private String lama;
    private String total;

    public transaksi(int id_transaksi, String peminjam, String nopol, String harga, int tgl_pinjaman, int tgl_kembali, String lama, String total) {
        this.id_transaksi = id_transaksi;
        this.peminjam = peminjam;
        this.nopol = nopol;
        this.harga = harga;
        this.tgl_pinjaman = tgl_pinjaman;
        this.tgl_kembali = tgl_kembali;
        this.lama = lama;
        this.total = total;
    }

    public transaksi() {
    }

    /**
     * @return the id_transaksi
     */
    public int getId_transaksi() {
        return id_transaksi;
    }

    /**
     * @param id_transaksi the id_transaksi to set
     */
    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    /**
     * @return the peminjam
     */
    public String getPeminjam() {
        return peminjam;
    }

    /**
     * @param peminjam the peminjam to set
     */
    public void setPeminjam(String peminjam) {
        this.peminjam = peminjam;
    }

    /**
     * @return the nopol
     */
    public String getNopol() {
        return nopol;
    }

    /**
     * @param nopol the nopol to set
     */
    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    /**
     * @return the harga
     */
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(String harga) {
        this.harga = harga;
    }

    /**
     * @return the tgl_pinjaman
     */
    public int getTgl_pinjaman() {
        return tgl_pinjaman;
    }

    /**
     * @param tgl_pinjaman the tgl_pinjaman to set
     */
    public void setTgl_pinjaman(int tgl_pinjaman) {
        this.tgl_pinjaman = tgl_pinjaman;
    }

    /**
     * @return the tgl_kembali
     */
    public int getTgl_kembali() {
        return tgl_kembali;
    }

    /**
     * @param tgl_kembali the tgl_kembali to set
     */
    public void setTgl_kembali(int tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    /**
     * @return the lama
     */
    public String getLama() {
        return lama;
    }

    /**
     * @param lama the lama to set
     */
    public void setLama(String lama) {
        this.lama = lama;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }
    
}
