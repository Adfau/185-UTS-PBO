public class Tendik extends Karyawan { //Inheritance
    private int lembur;
    @Override
    public void hitungGaji() {
        System.out.println("Pendapatan Total Tendik = Rp."+gaji);
    }

    //Overloading
    public void lamaLembur() {
        System.out.println("Pendapatan Lembur = Rp."+lembur);
    }
    public void lamaLembur(int jam) {
        lembur = 50000 * jam;
        gaji += lembur;
    }
}
