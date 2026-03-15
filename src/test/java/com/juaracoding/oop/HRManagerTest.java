package com.juaracoding.oop;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HRManagerTest {

    @Test
    public void testHitungGajiManager() {
        // Menggunakan Karyawan2
        Karyawan2 manager = new Karyawan2("Andi", "Manager", 10000000);
        Assert.assertEquals(manager.hitungGajiTotal(), 15000000.0);
    }

    @Test
    public void testUpdateGaji() {
        // Menggunakan Karyawan2
        Karyawan2 staff = new Karyawan2("Budi", "Staff", 5000000);
        staff.updateGaji(10); 
        Assert.assertEquals(staff.getGajiPokok(), 5500000.0);
    }

    @Test
    public void testTambahKaryawanKeDivisi() {
        // Menggunakan Divisi2 dan Karyawan2
        Divisi2 itDiv = new Divisi2("IT");
        itDiv.tambahKaryawan(new Karyawan2("Cici", "Staff", 6000000));
        itDiv.tambahKaryawan(new Karyawan2("Didi", "Staff", 6000000));
        
        Assert.assertEquals(itDiv.getJumlahKaryawan(), 2);
    }
}
