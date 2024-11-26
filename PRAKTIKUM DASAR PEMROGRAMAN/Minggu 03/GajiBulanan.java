import java.util.Scanner;

public class GajiBulanan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi
        double totalGaji, gajiBersih, persenBonus = 0.1, persenPajak = 0.05, jamKerja, upahPerJam;

        // input
        System.out.print("Masukkan jam kerja anda: ");
        jamKerja = input.nextDouble();
        System.out.print("Masukkan upah per Jam: ");
        upahPerJam = input.nextDouble();

        // perhitungan
        totalGaji = jamKerja * upahPerJam;
        double bonus = totalGaji * persenBonus;
        double pajak = persenPajak * (totalGaji+bonus);
        gajiBersih = totalGaji + bonus - pajak;

        System.out.printf("Total Gaji selama satu bulan %s \n", totalGaji);
        System.out.printf("Total Bonus: %s \n", bonus);
        System.out.printf("Total Pajak: %s \n", pajak);
        System.out.printf("Total Gaaji Bersih yang di dapat Rp.%s", gajiBersih);

    input.close();
    }
    
}
