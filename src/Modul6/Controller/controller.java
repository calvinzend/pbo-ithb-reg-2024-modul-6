package Modul6.Controller;

import javax.swing.JOptionPane;

import Modul6.Model.KTP;
import Modul6.View.Penduduk;

public class controller {
    KTP dataKtp;
    Penduduk penduduk;

    public controller(KTP dataKtp){
        this.dataKtp = dataKtp;
    }

    public void addData(){
        if (KTP.addData(dataKtp)) {
        JOptionPane.showMessageDialog(null,"Data berhasil ditambahkan!");

        } else {
        JOptionPane.showMessageDialog(null,"Gagal menambahkan data.");

        }
    }
}
