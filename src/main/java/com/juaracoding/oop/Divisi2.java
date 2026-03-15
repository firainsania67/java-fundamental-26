package com.juaracoding.oop;

import java.util.ArrayList;
import java.util.List;

public class Divisi2 {
    private String namaDivisi;
    private List<Karyawan2> daftarKaryawan;

    public Divisi2(String namaDivisi) {
        this.namaDivisi = namaDivisi;
        this.daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan2 karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public int getJumlahKaryawan() {
        return daftarKaryawan.size();
    }
}