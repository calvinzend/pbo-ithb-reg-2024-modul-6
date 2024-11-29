package Modul6.View;

import com.toedter.calendar.JDateChooser;

import Modul6.Controller.controller;
import Modul6.Model.Databases;
import Modul6.Model.KTP;

import java.sql.Date;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Penduduk {
    static JButton submit = new JButton("Submit");
    static JButton backButton = new JButton("Kembali");

    public JButton getBackButton() {
        return backButton; 
    }
    public JButton getSumbitButton() {
        return submit; 
    }

    static class Frame extends JFrame {

        public Frame() {
            super("Input Data Penduduk");
            setSize(700, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
 
            JPanel inputPage = createInputPage();

            add(inputPage);
            setVisible(true);
        }

        private JPanel createInputPage() {
            JPanel inputPanel = new JPanel(new BorderLayout());
            JPanel frame = new JPanel(new GridLayout(0, 4, 5, 5));
            frame.setBackground(new Color(255, 255,255)); 

            JLabel NIK = new JLabel(" NIK  :  ");
            JTextField NIKValue = new JTextField(10);
            JLabel nama = new JLabel(" NAMA  :  ");
            JTextField namaValue = new JTextField(10);
            JLabel tempatL = new JLabel(" Tempat Lahir  :  ");
            JTextField tempatLValue = new JTextField(10);
            JLabel tanggalLahir = new JLabel(" Tanggal Lahir  :  ");
            JDateChooser ttlValue = new JDateChooser();
            
            JLabel jenisKelamin = new JLabel("Pilih Jenis Kelamin:");
            JRadioButton priaButton = new JRadioButton("Pria");
            JRadioButton wanitaButton = new JRadioButton("Wanita");

            JLabel golonganDarah = new JLabel("Pilih Gol Darah:");
            JRadioButton golA = new JRadioButton("A");
            JRadioButton golB = new JRadioButton("B");
            JRadioButton golO = new JRadioButton("O");
            JRadioButton golAB = new JRadioButton("AB");

            JLabel alamat = new JLabel(" Alamat  :  ");
            JTextField alamatValue = new JTextField(10);
            JLabel RTRW = new JLabel(" RT/RW  :  ");
            JTextField RTRWValue = new JTextField(10);

            JLabel KelDesa= new JLabel("Kel/Desa : ");
            JTextField KelDesaValue = new JTextField(10);
            JLabel kecamatan= new JLabel("Kecamatan : ");
            JTextField kecamatanValue = new JTextField(10);

            JLabel agama = new JLabel("Pilih Agama: ");
            String[] agamaList = {"Islam", "Kristen", "Katholik", "Hindu", "Buddha", "Konghucu"};
            JComboBox<String> agamaComboBox = new JComboBox<>(agamaList);

            JLabel status = new JLabel("Status Perkawinan:");
            String[] statusList = {"Belum Menikah", "Menikah","Janda","Duda"};
            JComboBox<String> statusBox = new JComboBox<>(statusList);

            JLabel pekeerjaan = new JLabel("Pilih pekerjaan: ");
            JCheckBox karyawanSwasta = new JCheckBox("Karyawan Swasta");
            JCheckBox PNS = new JCheckBox("PNS");
            JCheckBox wiraswasta = new JCheckBox("Wiraswasta");
            JCheckBox akademisi = new JCheckBox("Akademisi");
            JCheckBox pengangguran = new JCheckBox("Pengangguran");

            JLabel negara = new JLabel("Pilih Kewarganegaraan: ");
            JRadioButton WNI = new JRadioButton("WNI");
            JRadioButton WNA = new JRadioButton("WNA");
            JTextField negaraWNA = new JTextField(20);
            negaraWNA.setEnabled(false);

            JLabel fotoLabel = new JLabel("Foto: ");
            JButton foto = new JButton("Foto");
            JTextField fotoValue = new JTextField(20);
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));

            JLabel tandaTanganLabel = new JLabel("tandaTangan: ");
            JButton tandaTangan = new JButton("Tanda Tangan");
            JTextField tandaTanganValue = new JTextField(20);
            JFileChooser tandaTanganChooser = new JFileChooser();
            tandaTanganChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));

            JLabel berlakuHingga = new JLabel("Berlaku hingga: ");
            JTextField berlakuHinggaValue = new JTextField(10);

            JLabel kotaPembuatan = new JLabel("Kota Pembuatan: ");
            JTextField kotaPembuatanValue = new JTextField(10);

            JLabel tanggalPembuatan = new JLabel("Tanggal:");
            JDateChooser tanggalPembuatanChooser = new JDateChooser();
            tanggalPembuatanChooser.setDateFormatString("dd-MM-yyyy");

            JLabel kosong =  new JLabel("\n");
            JLabel kosong2 =  new JLabel("\n");
            JLabel kosong3 =  new JLabel("\n");
            JLabel kosong4 =  new JLabel("\n");
            
           

            ButtonGroup kelamin = new ButtonGroup();
            kelamin.add(priaButton);
            kelamin.add(wanitaButton);

            ButtonGroup golDarah = new ButtonGroup();
            golDarah.add(golA);
            golDarah.add(golO);
            golDarah.add(golB);
            golDarah.add(golAB);

            ButtonGroup kenegaraan = new ButtonGroup();
            kenegaraan.add(WNI);
            kenegaraan.add(WNA);

            //NIK
            frame.add(NIK);
            frame.add(NIKValue);
            //Nama
            frame.add(nama);
            frame.add(namaValue);
            //Tempat Tanggal lahir
            frame.add(tempatL);
            frame.add(tempatLValue);
            //Tanggal Lahir
            frame.add(tanggalLahir);
            frame.add(ttlValue);
            //Jenis Kelamain
            frame.add(jenisKelamin);
            frame.add(priaButton);
            frame.add(wanitaButton);
            frame.add(kosong);
            //Golongan Darah
            frame.add(golonganDarah);
            frame.add(kosong2);
            frame.add(new JLabel());
            frame.add(new JLabel());
            frame.add(golA);
            frame.add(golB);
            frame.add(golO);
            frame.add(golAB);
            //Alamat
            frame.add(alamat);
            frame.add(alamatValue);
            //RT/RW
            frame.add(RTRW);
            frame.add(RTRWValue);
            //Kel/Desa
            frame.add(KelDesa);
            frame.add(KelDesaValue);
            //Kecamatan
            frame.add(kecamatan);
            frame.add(kecamatanValue);
            //Agama
            frame.add(agama);
            frame.add(agamaComboBox);
            //Status Perkawinan
            frame.add(status);
            frame.add(statusBox);
            //Pekerjaan
            frame.add(pekeerjaan);
            frame.add(new JLabel());
            frame.add(new JLabel());
            frame.add(karyawanSwasta);
            frame.add(PNS);
            frame.add(wiraswasta);
            frame.add(akademisi);
            frame.add(pengangguran);
            //Kewarganegaraan
            frame.add(negara);
            frame.add(WNI);
            frame.add(WNA);
            frame.add(negaraWNA);
            //Foto
            frame.add(fotoLabel);
            frame.add(foto);
            frame.add(fotoValue);
            frame.add(new JLabel());

            //tandaTangan
            frame.add(tandaTanganLabel);
            frame.add(tandaTangan);
            frame.add(tandaTanganValue);
            frame.add(new JLabel());
            //Berlaku hingga
            frame.add(berlakuHingga);
            frame.add(berlakuHinggaValue);
            //Kota Pembuatan
            frame.add(kotaPembuatan);
            frame.add(kotaPembuatanValue);
            //tanggalPembuatan KTP
            frame.add(tanggalPembuatan);
            frame.add(tanggalPembuatanChooser);


            inputPanel.add(frame, BorderLayout.CENTER);
            inputPanel.add(submit, BorderLayout.SOUTH);
            JLabel imageLabel = new JLabel();

            tandaTangan.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int returnValue = fileChooser.showOpenDialog(inputPanel);
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        java.io.File selectedFile = fileChooser.getSelectedFile();
                        tandaTanganValue.setText(selectedFile.getAbsolutePath());
                        
                        ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            
                        Image image = imageIcon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
                        imageIcon = new ImageIcon(image);
            
                        imageLabel.setIcon(imageIcon); 
                    }
                }
            });
            foto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int returnValue = fileChooser.showOpenDialog(inputPanel);
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        java.io.File selectedFile = fileChooser.getSelectedFile();
                        fotoValue.setText(selectedFile.getAbsolutePath());
                        
                        ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            
                        Image image = imageIcon.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
                        imageIcon = new ImageIcon(image);
            
                        imageLabel.setIcon(imageIcon); 
                    }
                }
            });
            
            WNA.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    negaraWNA.setEnabled(WNA.isSelected());
                }
            });

            pengangguran.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean isPengangguranChecked = pengangguran.isSelected();
                    karyawanSwasta.setEnabled(!isPengangguranChecked);
                    PNS.setEnabled(!isPengangguranChecked);
                    wiraswasta.setEnabled(!isPengangguranChecked);
                    akademisi.setEnabled(!isPengangguranChecked);
                }
            });

            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nik = NIKValue.getText().trim();
                    String nama = namaValue.getText().trim();
                    String tempat = tempatLValue.getText().trim();
                    
                    java.util.Date utilDate = ttlValue.getDate();  
                    java.sql.Date tanggal = (utilDate != null) ? new java.sql.Date(utilDate.getTime()) : null; 
                    
                    String jenisKelamin = null;
                    String golonganDarah = null;
                    String alamat = alamatValue.getText();
                    String RT_RW = RTRWValue.getText();
                    String kelDesa = KelDesaValue.getText();
                    String kecamatan = kecamatanValue.getText();
                    String agama = (String) agamaComboBox.getSelectedItem();
                    String status = (String) statusBox.getSelectedItem();
                    String negara = WNI.getText();
                    String berlakuHingga = berlakuHinggaValue.getText();
                    String kotaPembuatan = kotaPembuatanValue.getText();
                    
                    java.util.Date utilTanggalPembuatan = tanggalPembuatanChooser.getDate();  // Get java.util.Date
                    java.sql.Date tanggalPembuatan = (utilTanggalPembuatan != null) ? new java.sql.Date(utilTanggalPembuatan.getTime()) : null;  // Convert to java.sql.Date
            
                    if (priaButton.isSelected()) {
                        jenisKelamin = priaButton.getText();
                    } else if (wanitaButton.isSelected()) {
                        jenisKelamin = wanitaButton.getText();
                    }
            
                    if (golA.isSelected()) {
                        golonganDarah = golA.getText();
                    } else if (golB.isSelected()) {
                        golonganDarah = golB.getText();
                    } else if (golO.isSelected()) {
                        golonganDarah = golO.getText();
                    } else if (golAB.isSelected()) {
                        golonganDarah = golAB.getText();
                    }
            
                    StringBuilder pekerjaan = new StringBuilder();
                    if (pengangguran.isSelected()) {
                        pekerjaan.append("Pengangguran");
                    } else {
                        if (karyawanSwasta.isSelected()) pekerjaan.append(karyawanSwasta.getText() + ", ");
                        if (PNS.isSelected()) pekerjaan.append(PNS.getText() + ", ");
                        if (wiraswasta.isSelected()) pekerjaan.append(wiraswasta.getText() + ", ");
                        if (akademisi.isSelected()) pekerjaan.append(akademisi.getText() + ", ");
                        if (pekerjaan.length() > 0) {
                            pekerjaan.setLength(pekerjaan.length() - 2); // Remove the last comma
                        }
                    }
            
                    if (WNA.isSelected()) {
                        negara = negaraWNA.getText();
                    }
            
                    if (nik.isEmpty() || nama.isEmpty() || tempat.isEmpty() || tanggal == null ||
                        jenisKelamin == null || golonganDarah == null || alamat.isEmpty() || RT_RW.isEmpty() ||
                        kelDesa.isEmpty() || kecamatan.isEmpty() || agama == null || status == null ||
                        pekerjaan.isEmpty() || negara.isEmpty() || berlakuHingga.isEmpty() ||
                        kotaPembuatan.isEmpty() || tanggalPembuatan == null) {
                        JOptionPane.showMessageDialog(inputPanel, "Mohon isi semua field!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else {
            
                        String fotoPath = fotoValue.getText().trim();
                        String tandaTanganPath = tandaTanganValue.getText().trim();
            
                        KTP hasiKtp = new KTP(nik, nama, tempat,  tanggal, jenisKelamin, golonganDarah, alamat, RT_RW, kelDesa, kecamatan, agama, status, pekerjaan.toString(), negara, berlakuHingga, kotaPembuatan, tanggalPembuatan, fotoPath, tandaTanganPath);
            
                        controller simpan = new controller(hasiKtp);
                        simpan.addData();
                        Result resultFrame = new Result(hasiKtp);
                        dispose();
                        resultFrame.setVisible(true);
            
                        ((JFrame) SwingUtilities.getWindowAncestor(inputPanel)).dispose();
                    }
                }
            });

            return inputPanel;
        }

 
    }

    public static void main(String[] args) {
        new Frame();
    }
}