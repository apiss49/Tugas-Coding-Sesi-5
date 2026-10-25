package Belajar.Sesi5.Tugas;

public class Level2a {
    public static void main(String[] args) throws Exception {
        int[] data = {2, 4, 6, 8, 10, 12};

        for (int x : data) System.out.print(x + " ");

        int kiri = 0;
        int kanan = data.length - 1;

        while (kiri < kanan) {
            int temp = data[kiri];
            data[kiri] = data[kanan];
            data[kanan] = temp;

            kiri++;
            kanan--;
        }
        System.out.print("\nArray setelah di balik: ");
        for (int x : data) {
            System.out.print(x + " ");
        }
        //3. Bagaimana perukaran pertama dan terakhir dilakukan?

        //Dilakukan dengan teknik swap 3 langkah menggunakan variabel bantuan temp:
        //temp = data[0] -> data[0] = data[5] -> data[5] = temp. Jadi 2 dan 12 bertukar tempat.

        //4. kenapa tidak ada yang hilang?

        //Karena sebelum data[kiri] ditimpa oleh data[kanan], nilainya sudah disimpan dulu di temp. 
        // Kalau langsung data[kiri] = data[kanan] tanpa temp, maka nilai 2 akan hilang selamanya
    }
}
