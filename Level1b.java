package Belajar.Sesi5.Tugas;


public class Level1b {
    public static void main(String[] args) throws Exception {
        int[] stock = {12, 8, 15, 6};

       System.out.println("Stok Barang Pertama: " + stock[0]);
       System.out.println("Stok Barang Terakhir: " + stock[stock.length - 1]);

       stock[1] = 10;
       System.out.println("\nStok produk kedua di ubah menjadi: " + stock[1]);

       System.out.println("\n=== Stok Setelah Perubahan ===");
       for (int i=0; i<stock.length; i++) {
        System.out.println("Produk ke-" + (i+1) + ": " + stock[i]);
       }
       //Jika Program mengakses stock[4] akan terjadi error, karna Array stock hanya punya 4 elemen,
       //indeks yang valid adalah 0, 1, 2, 3. Indeks 4 tidak ada/di luar batas array.
    }
}
