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
public class jenis_barang {
    private Integer Id_jenis_barang;
    private String Kualitas_jenis_barang;
    
    public Integer getId_jenis_barang() {
        return Id_jenis_barang;
    }

    public void setId_jenis_barang(Integer Id_jenis_barang) {
        this.Id_jenis_barang = Id_jenis_barang;
    }

    public String getKualitas_jenis_barang() {
        return Kualitas_jenis_barang;
    }

    public void setKualitas_jenis_barang(String Kualitas_jenis_barang) {
        this.Kualitas_jenis_barang = Kualitas_jenis_barang;
    }
}
