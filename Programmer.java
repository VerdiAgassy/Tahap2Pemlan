package TAHAP2PEMLAN;

public class Programmer extends Karyawan {
    private double bonus;

    public  Programmer (String nama, int gajiPokok, Perusahaan perusahaan, double bonus){
        super(nama, gajiPokok, perusahaan);
        this.bonus = bonus;
    }

    @Override
    public double hitungGaji(){
        return getGajiPokok() + bonus;
    }
}
