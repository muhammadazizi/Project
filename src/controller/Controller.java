/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.text.*;
import model.*;
import database.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Controller {
    
    Koneksi koneksi;
    ArrayList<barang> arrBarang;
    ArrayList<jenis_barang> arrJenis_Barang;
    ArrayList<Transaksi> arrTransaksi;

    public Controller() throws SQLException {
        this.koneksi = new Koneksi();
        this.arrBarang = new ArrayList<>();
        this.arrJenis_Barang = new ArrayList<>();
        this.arrTransaksi = new ArrayList<>();
    }
    public ArrayList<barang> getDataBarang() throws SQLException {
        arrBarang.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM BARANG JOIN JENIS_BARANG ON BARANG.ID_JENIS_BARANG = JENIS_BARANG.ID_JENIS_BARANG");
            while(rs.next()) {
                jenis_barang jenis_barang = new jenis_barang();
                jenis_barang.setId_jenis_barang(rs.getInt("ID_JENIS_BARANG"));
                jenis_barang.setKualitas_jenis_barang(rs.getString("KUALITAS_JENIS_BARANG"));
                
                barang barang = new barang();
                barang.setKode_barang(rs.getInt("KODE_BARANG"));
                barang.setJenis_barang(jenis_barang);
                barang.setNama_barang(rs.getString("NAMA_BARANG"));
                barang.setHarga_barang(rs.getInt("HARGA_BARANG"));
                barang.setUkuran_barang(rs.getInt("UKURAN_BARANG"));
                
                arrBarang.add(barang);
            }
        return arrBarang;
    }
    public ArrayList<jenis_barang> getDataJenisBarang() throws SQLException {
        arrJenis_Barang.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM JENIS_BARANG");
            while(rs.next()) {
                jenis_barang jenis_barang = new jenis_barang();
                jenis_barang.setId_jenis_barang(rs.getInt("ID_JENIS_BARANG"));
                jenis_barang.setKualitas_jenis_barang(rs.getString("KUALITAS_JENIS_BARANG"));
                
                arrJenis_Barang.add(jenis_barang);
            }
        return arrJenis_Barang;
    }
    public ArrayList<Transaksi> getDataTransaksi() throws SQLException {
        arrTransaksi.clear();
        ResultSet rs = koneksi.GetData("SELECT * FROM TRANSAKSI JOIN BARANG ON TRANSAKSI.KODE_BARANG = BARANG.KODE_BARANG");
            while(rs.next()) {
                
                barang barang = new barang();
                barang.setKode_barang(rs.getInt("KODE_BARANG"));
                barang.setNama_barang(rs.getString("NAMA_BARANG"));
                barang.setHarga_barang(rs.getInt("HARGA_BARANG"));
                barang.setUkuran_barang(rs.getInt("UKURAN_BARANG"));
                
                Transaksi transaksi = new Transaksi();
                transaksi.setId_transaksi(rs.getInt("ID_TRANSAKSI"));
                transaksi.setBarang(barang);
                transaksi.setBayar(rs.getInt("BAYAR_06984"));
                transaksi.setKembali(rs.getInt("KEMBALI"));
                transaksi.setTotal(rs.getInt("TOTAL"));
                transaksi.setTanggal_transaksi(rs.getDate("TANGGAL_TRANSAKSI"));
            arrTransaksi.add(transaksi);
            }    
        return arrTransaksi;
    }
    public void insertTransaksi(Transaksi transaksi) {
        try {
            koneksi.ManipulasiData("INSERT INTO transaksi VALUES (ID_TRANSAKSI.NEXTVAL, " + transaksi.getBarang()+ "," + transaksi.getBayar()+ ","+ transaksi.getKembali()+ "," + transaksi.getTotal()+ "," +transaksi.getTanggal_transaksi() + ")");
            ResultSet rs = koneksi.GetData("SELECT ID_TRANSAKSI.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public void insertJenisBarang(jenis_barang jenis_Barang) {
        try {
            koneksi.ManipulasiData("INSERT INTO JENIS_BARANG VALUES (ID_JENIS_BARANG.NEXTVAL, '" + jenis_Barang.getKualitas_jenis_barang()+ "')");
            ResultSet rs = koneksi.GetData("SELECT ID_JENIS_BARANG.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    public void deleteJenisBarang(jenis_barang jenis_Barang) {
        koneksi.ManipulasiData("DELETE FROM JENIS_BARANG WHERE ID_JENIS_BARANG = " + jenis_Barang.getId_jenis_barang());
    }
     public void insertBarang(barang barang) {
        try {
            koneksi.ManipulasiData("INSERT INTO barang VALUES (KODE_BARANG.NEXTVAL, " +barang.getJenis_barang().getId_jenis_barang()+ ",'" + barang.getNama_barang()+ "'," + barang.getHarga_barang()+ "," + barang.getUkuran_barang()+ ")");
            ResultSet rs = koneksi.GetData("SELECT KODE_BARANG.CURRVAL FROM DUAL");
            System.out.println(rs);
            rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateBarang(barang barang, int Harga_barang, int Ukuran_barang) {
        koneksi.ManipulasiData("UPDATE barang SET HARGA_BARANG = " + Harga_barang + ",UKURAN_BARANG = " + Ukuran_barang + "WHERE KODE_BARANG = " + barang.getKode_barang());
    }
    public void deleteBarang(barang barang) {
        koneksi.ManipulasiData("DELETE FROM barang WHERE KODE_BARANG = " + barang.getKode_barang());
    }

}
