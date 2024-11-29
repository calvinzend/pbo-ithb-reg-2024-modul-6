package Modul6.Controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modul6.Model.KTP;
import Modul6.View.Penduduk;
import Modul6.View.Rekap;
import Modul6.View.Result;

public class controller {
    KTP dataKtp;
    Penduduk penduduk;

    public controller(KTP dataKtp) {
        this.dataKtp = dataKtp;
    }

    public controller() {

    }

    public void addData() {
        if (KTP.addData(dataKtp)) {
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");

        } else {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan data.");
        }
    }

    public boolean showData(String input) {
        ArrayList<KTP> data = KTP.ambilData(input);
        if (data.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input tidak ditemukan!!!");
            return false;

        } else {
            for (KTP ktp : data) {
                new Rekap(ktp);
            }
            return true;
        }
    }
}
