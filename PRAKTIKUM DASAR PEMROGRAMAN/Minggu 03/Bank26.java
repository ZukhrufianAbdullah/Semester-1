import java.util.Scanner;

public class Bank26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_tabungan_awal, lama_menabung;
        double persentase_bunga =0.02, bunga, jml_tabungan_akhir;

        System.out.println("Masukkan jumlah tabungan awal anda: ");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung: ");
        lama_menabung = input.nextInt();

        bunga = jml_tabungan_awal*persentase_bunga*lama_menabung;

        jml_tabungan_akhir = bunga+jml_tabungan_awal;

        System.out.println("Bunga adalah: "+ bunga);
        System.out.println("Jumlah tabungan akhir anda adalah: "+ jml_tabungan_akhir);
    }
}