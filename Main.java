package TAHAP2PEMLAN;

public class Main {
    public static void main(String[] args) {
        Perusahaan prshn = new Perusahaan();
        Karyawan Verdi = new Karyawan("Verdi", 100000000, prshn);
        Programmer Lola = new Programmer("Lola", 8000000, prshn, 1500000);
        Manajer Zack = new Manajer("Zack",6000000, prshn, 1200000);
        
        Verdi.infoGaji();
        Lola.infoGaji();
        Zack.infoGaji();
        
        
    }
    
}
