/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Muhammad Azizi
 */
public class Transaksi {
    private Integer Id_transaksi;
    private barang Barang;
    private Integer Bayar;
    private Integer Kembali;
    private Integer Total;
    private Date Tanggal_transaksi;
    
    public Integer getId_transaksi() {
        return Id_transaksi;
    }

    public void setId_transaksi(Integer Id_transaksi) {
        this.Id_transaksi = Id_transaksi;
    }

    public barang getBarang() {
        return Barang;
    }

    public void setBarang(barang Barang) {
        this.Barang = Barang;
    }


    public Integer getBayar() {
        return Bayar;
    }

    public void setBayar(Integer Bayar) {
        this.Bayar = Bayar;
    }

    public Integer getKembali() {
        return Kembali;
    }

    public void setKembali(Integer Kembali) {
        this.Kembali = Kembali;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer Total) {
        this.Total = Total;
    }
    public Date getTanggal_transaksi() {
        return Tanggal_transaksi;
    }

    public void setTanggal_transaksi(Date Tanggal_transaksi) {
        this.Tanggal_transaksi = Tanggal_transaksi;
    }
}
