package TAHAP2PEMLAN;

public class Karyawan {
    private String nama;
    private int gajiPokok;
    public Perusahaan perusahaan;

    public Karyawan(String nama, int gajiPokok, Perusahaan perusahaan){
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }


    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama) {
        if (nama != null && nama.length() >= 4) {
            this.nama = nama;
        }
    }

    public double getGajiPokok(){
        return this.gajiPokok;
    }

    public double hitungGaji(){
        return getGajiPokok();
    }

    public void infoGaji(){
        System.out.println("-----------------INFO KARYAWAN-----------------");
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Gaji Pokok \t: " + gajiPokok);
        System.out.println("Gaji Total \t: " + hitungGaji());
        System.out.println("Perusahaan \t: " + perusahaan.getnamaPerushaan() );
    }
}
