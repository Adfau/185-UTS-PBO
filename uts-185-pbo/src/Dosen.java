import java.lang.annotation.Target;

public class Dosen extends Karyawan { //Inheritance
    private String jurusan, nidn;
    private int sks, gajiLebih;

    @Override
    public void hitungGaji() {
        System.out.println("Pendapatan Total Dosen = Rp."+gaji);
    }

    //Overloading
    public void kelebihanMengajar() {
        System.out.println("Pendapatan Lebih = Rp."+gajiLebih);
    }
    public void kelebihanMengajar(int sks, int minggu) {
        gajiLebih = 100000 * sks * minggu;
        gaji += gajiLebih;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
