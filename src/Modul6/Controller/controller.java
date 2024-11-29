package Modul6.Controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modul6.Model.KTP;
import Modul6.View.MainMenu;
import Modul6.View.Penduduk;
import Modul6.View.Rekap;

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

    public void updateData() {
        if (KTP.updateData(dataKtp)) {
            JOptionPane.showMessageDialog(null, "Data berhasil diUpdate!");

        } else {
            JOptionPane.showMessageDialog(null, "Gagal Update data.");
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
    public static void deleteData(String input){
        if (KTP.deleteData(input)) {
            JOptionPane.showMessageDialog(null, "Data berhasil didelete!");
        }else{
            JOptionPane.showMessageDialog(null, "Data gagal didelete!");
        }
        new MainMenu();
    }

    public static KTP getData(String data){
        return KTP.getData(data);
    }
}
