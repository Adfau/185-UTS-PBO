public class Karyawan {
    //Enkapsulasi
    protected String nip, nama, alamat, tgllahir, jk, thnmasuk;
    protected int gaji;

    public Karyawan() {
        this.gaji = 2000000; //Gaji standar
    }
    public void hitungGaji() {
        System.out.println("Pendapatan Total = Rp."+gaji);
    }

    //Enkapsulasi
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(String tgllahir) {
        this.tgllahir = tgllahir;
    }

    public String getThnmasuk() {
        return thnmasuk;
    }

    public void setThnmasuk(String thnmasuk) {
        this.thnmasuk = thnmasuk;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }
}
