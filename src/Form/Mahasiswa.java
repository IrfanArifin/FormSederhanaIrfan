package Form;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String devisi;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim, String devisi) {
        this.nama = nama;
        this.nim = nim;
        this.devisi = devisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getDevisi() {
        return devisi;
    }

    public void setDevisi(String devisi) {
        this.devisi = devisi;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", devisi='" + devisi + '\'' +
                '}';
    }
}
