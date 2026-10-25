package Belajar.Sesi5.Tugas;
public class Level4b {
    public static void main(String[] args) {
        // DATA CONTOH - ganti sesuai punya dosen
        int[] nilai = {78, 90, 65, 90, 85, 72, 95, 85, 60, 40}; 
        int n = nilai.length;

        
        if (n == 0) {
            System.out.println("Data kosong, tidak ada laporan");
            return;
        }

        
        int[] dataValid = new int[n];
        int nValid = 0;
        for (int v : nilai) {
            if (v >= 0 && v <= 100) { // Poin 5: data tidak valid di-skip
                dataValid[nValid] = v;
                nValid++;
            }
        }

       
        int sum = 0;
        int min = dataValid[0];
        int max = dataValid[0];
        for (int i = 0; i < nValid; i++) {
            sum += dataValid[i];
            if (dataValid[i] < min) min = dataValid[i];
            if (dataValid[i] > max) max = dataValid[i];
        }
        double rataRata = (double) sum / nValid;

        
        int[] urut = new int[nValid];
        for(int i=0; i<nValid; i++) urut[i] = dataValid[i];

        for (int i = 0; i < nValid - 1; i++) {
            for (int j = 0; j < nValid - 1 - i; j++) {
                if (urut[j] > urut[j+1]) {
                    int temp = urut[j];
                    urut[j] = urut[j+1];
                    urut[j+1] = temp;
                }
            }
        }
        double median;
        if (nValid % 2 == 1) {
            median = urut[nValid / 2];
        } else {
            median = (urut[nValid/2 - 1] + urut[nValid/2]) / 2.0;
        }

        System.out.println("--- POIN 1 ---");
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Median: " + median);
        System.out.println("Min: " + min + " Max: " + max);

       
        int lulus = 0, tidakLulus = 0;
        for (int i = 0; i < nValid; i++) {
            if (dataValid[i] >= 60) lulus++;
            else tidakLulus++;
        }
        System.out.println("\n--- POIN 2 ---");
        System.out.println("Lulus: " + lulus + " Tidak Lulus: " + tidakLulus);

       
        int modus = dataValid[0];
        int frekMax = 0;
        for (int i = 0; i < nValid; i++) {
            int frek = 0;
            for (int j = 0; j < nValid; j++) {
                if (dataValid[i] == dataValid[j]) frek++;
            }
            if (frek > frekMax) {
                frekMax = frek;
                modus = dataValid[i];
            }
        }
        System.out.println("\n--- POIN 3 ---");
        System.out.println("Modus: " + modus + " muncul " + frekMax + " kali");


        int countA=0, countB=0, countC=0, countD=0, countE=0;
        for (int i = 0; i < nValid; i++) {
            if (dataValid[i] >= 85) countA++;
            else if (dataValid[i] >= 70) countB++;
            else if (dataValid[i] >= 60) countC++;
            else if (dataValid[i] >= 50) countD++;
            else countE++;
        }
        System.out.println("\n--- POIN 4 ---");
        System.out.println("A (85-100): " + countA);
        System.out.println("B (70-84): " + countB);
        System.out.println("C (60-69): " + countC);
        System.out.println("D (50-59): " + countD);
        System.out.println("E (<50): " + countE);
    }
}

//6. Operasi mana yang bisa 1x traversal?
// Sekali jalan "for" bisa dapat semua ini:
// Rata-rata, Min, Max, Jumlah Lulus, Distribusi A-E. Karena cuma butuh cek 1 per 1. ini O(n) paling efisien

//7. Operasi mana yang butuh pengurutan/struktur tambahan?
// Median dan Modus. Median wajib di sort terlebih dahulu pakai Bubble Sort + temp. Modus butuh struktur tambahan
// (arrqay frekuensi atau HashMap) biar tidak O(n2)

//8. Komplesistas waktu & ruang
//- Satu traversal (rata-rata, min, max, lulus, distribusi): Waktu O(n), Ruang O(1)

//- Dengan sorting untuk median: Waktu O(n2) kalau pakai Bubble Sort, O(n log n) kalau pakai Arrays.sort, Ruang O(1)

//- Solusi lengkap (sort + semua): Waktu O(n2), Ruang O(n)

//9. Jika data 100 jadi 1.000.000, bottleneck dimana?
// Bottleneck = SORTING untuk median dan MODUS pakai double loop.
// Kalau 1.000.000 data, Bubble Sort n2 = 1 Triliun operasi, laptop nge-freeze. Linear O(n) 1 juta masih aman.

//10. Bandingkan dua pendekatan
// Pendekatan A: Sort dulu baru hitung semua

// Pendekatan B: Jangan sort, hitung yang linear terlebih dahulu, sort hanya kalau butuh median