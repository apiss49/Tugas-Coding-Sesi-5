package Belajar.Sesi5.Tugas;
import java.util.Scanner;
public class Level3b {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);

       int balance = 1000000;
       int[] transaksi = new int[5];
       int jumlahTransaksiBerhasil = 0;

       int totalMasuk = 0;
       int totalKeluar = 0;

       System.out.println("Saldo awal: " + balance);

       for (int i=0; i<5; i++) {
        System.out.println("\nTransaksi ke-" + (i+1));
        System.out.print("Ketik 1 untuk SETOR, Ketik 2 untuk TARIK: ");
        int pilihan = inputan.nextInt();
        System.out.print("Masukan jumlah: ");
        int jumlah = inputan.nextInt();

        if (pilihan == 1) {
            balance = balance + jumlah;
            transaksi[jumlahTransaksiBerhasil] = jumlah;
            totalMasuk += jumlah;
            jumlahTransaksiBerhasil++;
            System.out.println("Setor berhasil. Saldo sekarang: " + balance);
        } else if (pilihan == 2) {
            if (jumlah > balance) {
            System.out.println("GAGAL! Saldo tidak mencukupi. Saldo kamu: " + balance);
            } else {
                balance = balance - jumlah;
                transaksi[jumlahTransaksiBerhasil] = -jumlah;
                totalKeluar += jumlah;
                jumlahTransaksiBerhasil++;
                System.out.println("Tarik berhasil. Saldo saat ini: " + balance);
            }
        }
       }
       System.out.println("\n--- LAPORAN AKHIR ---");
       System.out.println("Saldo AKhir: " + balance);
       System.out.println("Total Uang Masuk: " + totalMasuk);
       System.out.println("Total Uang Keluar: " + totalKeluar);
       System.out.print("Riwayat (Berhasil): ");
       for (int j=0; j<jumlahTransaksiBerhasil; j++) {
        System.out.print(transaksi[j] + " ");
       }
       inputan.close();
    }
}
