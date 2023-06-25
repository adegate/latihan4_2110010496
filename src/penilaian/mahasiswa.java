package penilaian;

public class mahasiswa {
    private String nama, npm;

public mahasiswa (String nama, String npm) {
    this.nama = nama;
    this.npm = npm;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNpm(String npm) {
        this.npm = npm;
    }
    public String getNama() {
        return nama;
    }
    public String getNpm() {
        return npm;
    }
}

