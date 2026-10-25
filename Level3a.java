package Belajar.Sesi5.Tugas;


public class Level3a {
    public static void main(String[] args) throws Exception {
        int[] nilai = {78, 90, 65, 90, 85, 72, 95, 85};
        int n =nilai.length;

        int[] urut = nilai.clone();
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (urut[j] < urut[j+1]) {
                    int temp = urut[j];
                    urut[j] = urut[j+1];
                    urut[j+1] = temp;
                }
            }
        }
        System.out.print(" Nilai terurut (tinggi-rendah: ");
        for (int x : urut) System.out.print(x + " ");
        System.out.println();

        int[] unik = new int[n];
        int jumlahUnik = 0;

        for (int i=0; i<n; i++) {
            boolean sudahAda = false;
            for (int k=0; k<jumlahUnik; k++) {
                if (urut[i]==unik[k]){
                    sudahAda = true;
                    break;
                }
            }
            if (!sudahAda) {
                unik[jumlahUnik] = urut[i];
                jumlahUnik++;
            }
        }
        System.out.print("Tiga nilai tertinggi berbeda: ");
        for (int i=0; i<3 && i<jumlahUnik; i++) {
            System.out.print(unik[i] + " ");
        }
        System.out.println("\n");

        System.out.println("--- Peringkat Mahasiswa ---");
        for (int i=0; i<n; i++) {
            int peringkat = 0;

            for (int k =0; k<jumlahUnik; k++) {
                if (nilai[i] == unik[k]) {
                    peringkat = k + 1;
                    break;
                }
            }
            System.out.println("Mahasiswa " + i + " | Nilai: " + nilai[i] + " | Peringkat: " + peringkat);
        }
    }
}
