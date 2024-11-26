import java.util.Scanner;

public class TarifListrik26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean cekStatus;
        double tagihanListrik,pemakaianKwh, hargaKwh= 1500, batasKwh=500;

        System.out.print("Masukkan pemakaian Kwh anda: ");
        pemakaianKwh = input.nextDouble();

        tagihanListrik = pemakaianKwh * hargaKwh;
        
        cekStatus = pemakaianKwh > batasKwh;

        System.out.println("-----------------------------------------------------");
        System.out.println("------------- CEK TAGIHAN LISTRIK LNP ---------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("Tagihan listrik anda adalah Rp." + tagihanListrik);
        System.out.println("Jumlah pemakain listrik: " + pemakaianKwh);
        System.out.println("Pemakaian listrik anda melebihi 500Kwh: " + cekStatus);

        input.close();
    }
    
}
