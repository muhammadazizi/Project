/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Muhammad Azizi
 */
public class barang {
    private Integer Kode_barang;
    private jenis_barang Jenis_barang;
    private String Nama_barang;
    private Integer Harga_barang;
    private Integer Ukuran_barang;
    
    public Integer getKode_barang() {
        return Kode_barang;
    }

    public void setKode_barang(Integer Kode_barang) {
        this.Kode_barang = Kode_barang;
    }

    public jenis_barang getJenis_barang() {
        return Jenis_barang;
    }

    public void setJenis_barang(jenis_barang Jenis_barang) {
        this.Jenis_barang = Jenis_barang;
    }


    public String getNama_barang() {
        return Nama_barang;
    }

    public void setNama_barang(String Nama_barang) {
        this.Nama_barang = Nama_barang;
    }

    public Integer getHarga_barang() {
        return Harga_barang;
    }

    public void setHarga_barang(Integer Harga_barang) {
        this.Harga_barang = Harga_barang;
    }

    public Integer getUkuran_barang() {
        return Ukuran_barang;
    }

    public void setUkuran_barang(Integer Ukuran_barang) {
        this.Ukuran_barang = Ukuran_barang;
    }
}
