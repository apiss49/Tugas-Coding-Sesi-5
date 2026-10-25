package Belajar.Sesi5.Tugas;

public class Level1a {
      public static void main(String[] args) throws Exception {
        int[] nilai = {80, 75, 90, 65, 85};
        System.out.println("=== Daftar nilai mahasiswa ===");
        
        for (int i=0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilai[i]);
        }
        System.out.println("\nNilai pada indeks ke-2 adalah: " + nilai[2]);

        //Perbedaan indeks array dengan urutan mahasiswa adalah urutan bilangan nya. Dalam Java indeks array dimulai dari 0, 
        //sedangkan di dunia nyata dimulai dari 1. Jadi untuk mengakses mahasiswa ke-3, kita harus pakai indeks ke-2.
        //Rumusnya: Urutan = Indeks + 1
      }
}
