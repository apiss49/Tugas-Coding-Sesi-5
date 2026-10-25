package Belajar.Sesi5.Tugas;
import java.util.Scanner;
public class Level2b {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
        int[] kode = {101, 105, 110, 115, 120, 125};

        System.out.print("Masukan kode produk yang dicari: ");
        int cari = inputan.nextInt();

        boolean ketemu = false;
        int indeksKetemu = -1;
        int JumlahCek = 0;

        for (int i=0; i<kode.length; i++) {
            JumlahCek++;
            if (kode[i] == cari) {
                ketemu = true;
                indeksKetemu = i;
                inputan.close();
            }
        }
        if (ketemu) {
            System.out.print("Kode " + cari + " di temukan di indeks ke-" + indeksKetemu);
        } else {
            System.out.print("Produk dengan kode " + cari + " tidak tersedia.");
        }
        System.out.print(" Jumlah elemen yang diperiksa: " + JumlahCek);
    }
    
}
