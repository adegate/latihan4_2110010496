
package penilaian;

public class main {
    public static void main(String[] args) {
        nilaiAkhir ade = new nilaiAkhir ("Ade", "2110010496", 90, 80, 85);
        System.out.println("Nama \t: " + ade.getNama());
        System.out.println("NPM \t: " + ade.getNpm());
        System.out.println("Nilai Akhir  : " + ade.hitungNilaiAkhir());
    }
    
}
