package Modul6.Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class KTP {
    private String NIK;
    private String nama;
    private String tempatLahir;
    private Date tanggalLahir;
    private String jenisKelamin;
    private String golonganDarah;
    private String alamat;
    private String RT_RW;
    private String kelDesa;
    private String kecamatan;
    private String agama;
    private String statusPerkawinan;
    private String pekerjaan;
    private String kewarganegaraan;
    private String berlakuHingga;
    private String kotaPembuatan;
    private Date tanggalPembuatan;
    private String fotoPath;
    private String tandaTanganPath;

    public KTP(String nIK, String nama, String tempatLahir, Date tanggalLahir, String jenisKelamin,
            String golonganDarah, String alamat, String rT_RW, String kelDesa, String kecamatan, String agama,
            String statusPerkawinan, String pekerjaan, String kewarganegaraan, String berlakuHingga,
            String kotaPembuatan, Date tanggalPembuatan, String fotoPath, String tandaTanganPath) {
        this.NIK = nIK;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.golonganDarah = golonganDarah;
        this.alamat = alamat;
        this.RT_RW = rT_RW;
        this.kelDesa = kelDesa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statusPerkawinan = statusPerkawinan;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.berlakuHingga = berlakuHingga;
        this.kotaPembuatan = kotaPembuatan;
        this.tanggalPembuatan = tanggalPembuatan;
        this.fotoPath = fotoPath;
        this.tandaTanganPath = tandaTanganPath;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String nIK) {
        this.NIK = nIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRT_RW() {
        return RT_RW;
    }

    public void setRT_RW(String rT_RW) {
        this.RT_RW = rT_RW;
    }

    public String getKelDesa() {
        return kelDesa;
    }

    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatusPerkawinan() {
        return statusPerkawinan;
    }

    public void setStatusPerkawinan(String statusPerkawinan) {
        this.statusPerkawinan = statusPerkawinan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getBerlakuHingga() {
        return berlakuHingga;
    }

    public void setBerlakuHingga(String berlakuHingga) {
        this.berlakuHingga = berlakuHingga;
    }

    public String getKotaPembuatan() {
        return kotaPembuatan;
    }

    public void setKotaPembuatan(String kotaPembuatan) {
        this.kotaPembuatan = kotaPembuatan;
    }

    public Date getTanggalPembuatan() {
        return tanggalPembuatan;
    }

    public void setTanggalPembuatan(Date tanggalPembuatan) {
        this.tanggalPembuatan = tanggalPembuatan;
    }

    public String getFotoPath() {
        return fotoPath;
    }

    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }

    public String getTandaTanganPath() {
        return tandaTanganPath;
    }

    public void setTandaTanganPath(String tandaTanganPath) {
        this.tandaTanganPath = tandaTanganPath;
    }

    public static ArrayList<KTP> ambilData(String input) {
        ArrayList<KTP> data = new ArrayList<>();
        String query = "SELECT * FROM KTP WHERE NIK = ?";

        try (Connection con = ConnectionManager.getConnection();
                PreparedStatement st = con.prepareStatement(query)) {

            st.setString(1, input);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    KTP ktp = new KTP(
                            rs.getString("NIK"),
                            rs.getString("nama"),
                            rs.getString("tempatLahir"),
                            rs.getDate("tanggalLahir"),
                            rs.getString("jenisKelamin"),
                            rs.getString("golonganDarah"),
                            rs.getString("alamat"),
                            rs.getString("RT_RW"),
                            rs.getString("kelDesa"),
                            rs.getString("kecamatan"),
                            rs.getString("agama"),
                            rs.getString("statusPerkawinan"),
                            rs.getString("pekerjaan"),
                            rs.getString("kewarganegaraan"),
                            rs.getString("berlakuHingga"),
                            rs.getString("kotaPembuatan"),
                            rs.getDate("tanggalPembuatan"),
                            rs.getString("fotoPath"),
                            rs.getString("tandaTanganPath"));
                    data.add(ktp);
                }
            }

        } catch (SQLException e) {
            System.err.println("Error fetching data: " + e.getMessage());
        }
        return data;
    }

    public static boolean addData(KTP penduduk) {
        String query = "INSERT INTO KTP VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = ConnectionManager.getConnection().prepareStatement(query);

            st.setString(1, penduduk.getNIK());
            st.setString(2, penduduk.getNama());
            st.setString(3, penduduk.getTempatLahir());
            st.setDate(4, penduduk.getTanggalLahir());
            st.setString(5, penduduk.getJenisKelamin());
            st.setString(6, penduduk.getGolonganDarah());
            st.setString(7, penduduk.getAlamat());
            st.setString(8, penduduk.getRT_RW());
            st.setString(9, penduduk.getKelDesa());
            st.setString(10, penduduk.getKecamatan());
            st.setString(11, penduduk.getAgama());
            st.setString(12, penduduk.getStatusPerkawinan());
            st.setString(13, penduduk.getPekerjaan());
            st.setString(14, penduduk.getKewarganegaraan());
            st.setString(15, penduduk.getBerlakuHingga());
            st.setString(16, penduduk.getKotaPembuatan());
            st.setDate(17, penduduk.getTanggalPembuatan());
            st.setString(18, penduduk.getFotoPath());
            st.setString(19, penduduk.getTandaTanganPath());

            st.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateData(KTP penduduk) {
        String query = "UPDATE KTP SET nama = ?, tempatLahir = ?, tanggalLahir = ?, jenisKelamin = ?, "
                + "golonganDarah = ?, alamat = ?, RT_RW = ?, kelDesa = ?, kecamatan = ?, agama = ?, "
                + "statusPerkawinan = ?, pekerjaan = ?, kewarganegaraan = ?, berlakuHingga = ?, "
                + "kotaPembuatan = ?, tanggalPembuatan = ?, fotoPath = ?, tandaTanganPath = ? WHERE NIK = ?";
        try {
            PreparedStatement st = ConnectionManager.getConnection().prepareStatement(query);
            st.setString(1, penduduk.getNama());
            st.setString(2, penduduk.getTempatLahir());
            st.setDate(3, penduduk.getTanggalLahir());
            st.setString(4, penduduk.getJenisKelamin());
            st.setString(5, penduduk.getGolonganDarah());
            st.setString(6, penduduk.getAlamat());
            st.setString(7, penduduk.getRT_RW());
            st.setString(8, penduduk.getKelDesa());
            st.setString(9, penduduk.getKecamatan());
            st.setString(10, penduduk.getAgama());
            st.setString(11, penduduk.getStatusPerkawinan());
            st.setString(12, penduduk.getPekerjaan());
            st.setString(13, penduduk.getKewarganegaraan());
            st.setString(14, penduduk.getBerlakuHingga());
            st.setString(15, penduduk.getKotaPembuatan());
            st.setDate(16, penduduk.getTanggalPembuatan());
            st.setString(17, penduduk.getFotoPath());
            st.setString(18, penduduk.getTandaTanganPath());
            st.setString(19, penduduk.getNIK());

            st.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deleteData(String nik) {
        String query = "DELETE FROM KTP WHERE NIK = ?";
        try (Connection con = ConnectionManager.getConnection();
             PreparedStatement st = con.prepareStatement(query)) {
    
            st.setString(1, nik);
            int rowsDeleted = st.executeUpdate();
            return rowsDeleted > 0; 
        } catch (SQLException e) {
            System.err.println("Error deleting data: " + e.getMessage());
            return false;
        }
    }
    public static KTP getData(String nik) {
        KTP dataKTP = null;
        String query = "SELECT * FROM KTP WHERE NIK = ?";

        try (Connection con = ConnectionManager.getConnection();
                PreparedStatement st = con.prepareStatement(query)) {

            st.setString(1, nik);
            try (ResultSet rs = st.executeQuery()) {
                while (rs.next()) {
                    dataKTP = new KTP(
                            rs.getString("NIK"),
                            rs.getString("nama"),
                            rs.getString("tempatLahir"),
                            rs.getDate("tanggalLahir"),
                            rs.getString("jenisKelamin"),
                            rs.getString("golonganDarah"),
                            rs.getString("alamat"),
                            rs.getString("RT_RW"),
                            rs.getString("kelDesa"),
                            rs.getString("kecamatan"),
                            rs.getString("agama"),
                            rs.getString("statusPerkawinan"),
                            rs.getString("pekerjaan"),
                            rs.getString("kewarganegaraan"),
                            rs.getString("berlakuHingga"),
                            rs.getString("kotaPembuatan"),
                            rs.getDate("tanggalPembuatan"),
                            rs.getString("fotoPath"),
                            rs.getString("tandaTanganPath"));
                }
            }

        } catch (SQLException e) {
            System.err.println("Error fetching data: " + e.getMessage());
        }
        return dataKTP;
    }
    

}