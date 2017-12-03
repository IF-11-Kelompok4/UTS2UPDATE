/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import view.ViewRegGym;

/**
 *
 * @author Kelompok 4 IF-11
 */
public class ModelRegGym {

    private String noKtp, nama, jenkel = "", cabang,
            handuk = "", paket = "";
    private double biaya = 0;

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getHanduk() {
        return handuk;
    }

    public void setHanduk(String handuk) {
        this.handuk = handuk;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public void biayaPaket() {
        switch (paket) {
            case "Reguler":
                biaya = 450000;
                break;
            case "Mahasiswa":
                biaya = 300000;
                break;
            case "Private":
                biaya = 750000;
                break;
            case "Premium":
                biaya = 1000000;
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {
        new ViewRegGym().setVisible(true);
    }

}
