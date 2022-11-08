import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Dosen d1 = new Dosen();
        Tendik t1 = new Tendik();

        d1.setNama("Satu Pertama");
        d1.setNidn("012345");
        d1.setNip("231452");
        d1.setJk("Laki-Laki");
        d1.setThnmasuk("2002");
        d1.setTgllahir("1980-11-08");
        d1.setJurusan("Informatika");
        d1.setAlamat("Jl Mawar");

        d1.kelebihanMengajar(6, 1);

        t1.setNama("Dua Kedua");
        t1.setNip("212412");
        t1.setJk("Perempuan");
        t1.setThnmasuk("2005");
        t1.setTgllahir("1981-12-01");
        t1.setAlamat("Jl Rose");

        t1.lamaLembur(20);

        System.out.println("NIP Dosen       : "+d1.getNip());
        System.out.println("NIDN            : "+d1.getNidn());
        System.out.println("Nama Dosen      : "+d1.getNama());
        System.out.println("Jenis Kelamin   : "+d1.getJk());
        System.out.println("Tgl Lahir       : "+d1.getTgllahir());
        System.out.println("Alamat          : "+d1.getAlamat());
        System.out.println("Jurusan         : "+d1.getJurusan());
        System.out.println("Tahun Masuk     : "+d1.getThnmasuk());
        d1.kelebihanMengajar();
        d1.hitungGaji();

        System.out.println("");
        System.out.println("NIP Tendik     : "+t1.getNip());
        System.out.println("Nama Tendik    : "+t1.getNama());
        System.out.println("Jenis Kelamin  : "+t1.getJk());
        System.out.println("Tgl Lahir      : "+t1.getTgllahir());
        System.out.println("Alamat         : "+t1.getAlamat());
        System.out.println("Tahun Masuk    : "+t1.getThnmasuk());
        t1.lamaLembur();
        t1.hitungGaji();




    }
}