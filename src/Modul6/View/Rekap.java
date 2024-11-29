package Modul6.View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;

import Modul6.Model.KTP;

public class Rekap extends JFrame {
    JButton backButton;
    KTP data;

    public Rekap(KTP data) {
        this.data = data;
        initializeFrame();
    }

    private void initializeFrame() {
        super.setTitle("Rekap Data Penduduk");
        setSize(700, 700);
        setLayout(new BorderLayout());

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String tanggalFormatted = sdf.format(data.getTanggalLahir());

        String hasil = "<html>" +
            "<h1>“Republik Harapan Bangsa”</h1>" +
            "<b>NIK:</b> " + data.getNIK() + "<br>" +
            "<b>Nama:</b> " + data.getNama() + "<br>" +
            "<b>Tempat, Tanggal Lahir:</b> " + data.getTempatLahir() + ", " + tanggalFormatted + "<br>" +
            "<b>Jenis Kelamin:</b> " + data.getJenisKelamin() + "<br>" +
            "<b>Golongan Darah:</b> " + data.getGolonganDarah() + "<br>" +
            "<b>Alamat:</b> " + data.getAlamat() + "<br>" +
            "<b>RT/RW:</b> " + data.getRT_RW() + "<br>" +
            "<b>Kel/Desa:</b> " + data.getKelDesa() + "<br>" +
            "<b>Kecamatan:</b> " + data.getKecamatan() + "<br>" +
            "<b>Agama:</b> " + data.getAgama() + "<br>" +
            "<b>Status Perkawinan:</b> " + data.getStatusPerkawinan() + "<br>" +
            "<b>Pekerjaan:</b> " + data.getPekerjaan() + "<br>" +
            "<b>Kewarganegaraan:</b> " + data.getKewarganegaraan() + "<br>" +
            "<b>Berlaku Hingga:</b> " + data.getBerlakuHingga() + "<br>" +
            "</html>";

        JPanel RekapPanel = new JPanel(new BorderLayout());
        JLabel RekapLabel = new JLabel(hasil, SwingConstants.CENTER);
        RekapPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        RekapPanel.setBackground(new Color(173, 216, 230));

        JPanel imagePanel = new JPanel(new GridLayout(4, 1, 0, 3));
        imagePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        imagePanel.setBackground(new Color(173, 216, 230));

        ImageIcon userPhotoIcon = new ImageIcon(data.getFotoPath());
        ImageIcon resizedPhotoIcon = new ImageIcon(userPhotoIcon.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH));
        JLabel userPhotoLabel = new JLabel(resizedPhotoIcon);

        ImageIcon signatureIcon = new ImageIcon(data.getTandaTanganPath());
        ImageIcon resizedSignatureIcon = new ImageIcon(signatureIcon.getImage().getScaledInstance(150, 50, Image.SCALE_SMOOTH));
        JLabel signatureLabel = new JLabel(resizedSignatureIcon);

        JLabel kotaPembuatanLabel = new JLabel(data.getKotaPembuatan());
        JLabel tanggalPembuatanLabel = new JLabel(sdf.format(data.getTanggalPembuatan()));

        JPanel button = new JPanel();
        button.setBackground(new Color(173, 216, 230));

        JButton update = new JButton("Update");
        JButton delete = new JButton("Delete");
        backButton = new JButton("Kembali");

        button.add(update);
        button.add(delete);
        button.add(backButton);
        
        imagePanel.add(userPhotoLabel);
        imagePanel.add(kotaPembuatanLabel);
        imagePanel.add(tanggalPembuatanLabel);
        imagePanel.add(signatureLabel);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                dispose(); 
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });

        RekapPanel.add(RekapLabel, BorderLayout.CENTER);
        add(RekapPanel, BorderLayout.CENTER);
        add(imagePanel, BorderLayout.EAST);
        add(button,BorderLayout.SOUTH);
        
        setVisible(true);
    }
}
