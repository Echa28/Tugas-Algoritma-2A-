import model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4,6,0);


        System.out.println("----------");
        System.out.println("Hasil pertambahan :");
        int hasiltambahnya = s.hsltmbh(17, 4);
        System.out.println(hasiltambahnya);



        System.out.println("----------");
        System.out.println("Hasil Perkalian :");
        int hasilkalinya = s.hslkli(30, 20);
        System.out.println(hasilkalinya);  
    }
    
}
