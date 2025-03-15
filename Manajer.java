package TAHAP2PEMLAN;

public class Manajer extends Karyawan {
    private double insentif;

    public  Manajer (String nama, int gajiPokok, Perusahaan perusahaan, double insentif){
        super(nama, gajiPokok, perusahaan);
        this.insentif = insentif;
    }

    @Override
    public double hitungGaji(){
        return getGajiPokok() + insentif;
    }
}
