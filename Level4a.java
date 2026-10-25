package Belajar.Sesi5.Tugas;

public class Level4a {
    public static int linearSearch(int[] arr, int target) {
        int cek = 0;
        for (int i=0; i <arr.length; i++) {
            cek++;
            if (arr[i] == target) {
                System.out.println("Linear ketemu setelah " + cek + " cek");
                return i;
            }
        }
        System.out.println("Linear tidak ketemu setelah " + cek + " cek");
        return -1;
    }
    public static int binarySearch(int[] arr, int target) {
        int kiri = 0, kanan = arr.length -1;
        int cek = 0;
        while (kiri <= kanan) {
            cek++;
            int tengah = (kiri + kanan) / 2;
            if (arr[tengah] == target) {
                System.out.println("Binary ktemu setelah " + cek + " cek");
                return tengah;
            } else if (arr[tengah] < target) {
                kiri = tengah + 1;
            } else {
                kanan = tengah -1;
            }
        }
        System.out.println("Binary tidak ketemu setelah " + cek + " cek");
        return -1;
    }
    public static void main(String[] args) {
        int[] data = new int[10000];
        for(int i=0; i<10000; i++) data[i] = i;

        linearSearch(data, 75);
        binarySearch(data, 75);
    }
}
//1. Cara kerja kedua algoritma
// Algoritma A adalah Linear Search yang bekerja dengan memeriksa setiap elemen dari indeks pertama hingga terakhir
// secara berurutan sampai menemukan angka 75. Algoritma B adalah Binary Search yang bekkerja dengan membagi array
// yang sudah terurut menjadi dua bagian, memeriksa nilai tengah, lalu membuang setengah bagian yang tidak mungkin berisi target

//2. Perbandingan kompleksitas Big-O
// Algoritma A memiliki komplesitas O(n) karena waktu eksekusinya bertambah linear sesuai jumlah data. Algoritma B memiliki
// komplesitas O(log n) karena setiap iterasi memotong setengah data, sehingga jauh lebih efisien untuk data besar.

//3. Berapa cek maksimum Linear di 10.000
// Maksimum 10.000 kali pemeriksaan pada kasus terburuk, yaitu ketika angka 75 berada pada indeks terakhir atau tidak di temukan

//4. Kenapa binnary tidak bisa di array acak
// Karena binary search memutuskan arah pencarian (kiri/kanan) berdasarkan perbandingan nilai tengah. Jika array belum terurut,
// keputusan tersebut menjadi salah dan dapat melewatkan target yang sebenarnya ada.

//5. Kapan linear lebih masuk akal
// Ketika data berjumlah kecil (di bawah 100), ketika data belum terurut dan hanya perlu dicari sekali sehingga biaya sorting
// lebih mahal daripada pencarian linear itu sendiri, dan ketika data sangat dinamis atau sering berubah.