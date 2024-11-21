// Kelas utama MainMakhlukHidup
public class MainMakhlukHidup {
    // Method untuk cek makhluk hidup
    public void cekMakhlukHidup(MakhlukHidup mHidup) {
        mHidup.berdiri();
        mHidup.oksigen();
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        MainMakhlukHidup tMakhlukHidup = new MainMakhlukHidup();        
        
        // Mengecek objek Manusia
        tMakhlukHidup.cekMakhlukHidup(new Manusia("Dua Kaki"));       
        System.out.println("-----------------------------------------"); 
        
        // Mengecek objek Hewan
        tMakhlukHidup.cekMakhlukHidup(new Hewan("Empat Kaki", "Dua Kaki"));
        System.out.println("-----------------------------------------");        
        
        // Mengecek objek Tumbuhan
        tMakhlukHidup.cekMakhlukHidup(new Tumbuhan("Akar"));
    }
}
