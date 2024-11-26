import java.util.Scanner;

public class Kuis26 {
    public static void main(String[] args) {
       //Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        //Deklrasi Variable
        double keuntunganDriver, keuntunganMerchant, resikoKeterlambatan, jarakPerjalanan, komisiPerusahaan, resikoKerusakanBarang, totalKeuntunganSemuaMitra, ratarataKeuntunganSemuaTransaksi, persentaseKontribusiDriver, persentaseKontribusiMerchant, jumlahTotalTransaksi, hargaJualMakanan, biayaMakanan;
        int tarifDasar, biayaBahanBakar, jumlahTransaksi;

        //Input dari user
        System.out.println("---Program keuntungan mitra---");
        System.out.print("Masukkan tarif driver: Rp ");
        tarifDasar = input.nextInt();
        System.out.print("Masukkan jarak perjalanan: Km ");
        jarakPerjalanan = input.nextDouble();
        System.out.print("Masukkan biaya bahan bakar: Rp ");
        biayaBahanBakar = input.nextInt();
        System.out.print("Masukkan komisi perusahaan: % ");
        komisiPerusahaan = input.nextDouble();
        System.out.print("Masukkan resiko keterlambatan: % ");
        resikoKeterlambatan = input.nextDouble();
        System.out.print("Masukkan jumlah transaksi: ");
        jumlahTransaksi = input.nextInt();
        System.out.print("Masukkan harga jual makanan: Rp ");
        hargaJualMakanan = input.nextDouble();
        System.out.print("Masukkan biaya makanan: Rp ");
        biayaMakanan = input.nextDouble();
        System.out.print("Masukkan resiko kerusakan barang: % ");
        resikoKerusakanBarang = input.nextDouble();
        System.out.print("Masukkan jumlah total transaksi: ");
        jumlahTotalTransaksi = input.nextDouble();




        //HitungKeuntunganDriver
        keuntunganDriver = (tarifDasar*jarakPerjalanan-biayaBahanBakar*jarakPerjalanan)*(1-komisiPerusahaan/100)*(1-resikoKeterlambatan/100)*jumlahTransaksi;

        //HitungKeuntunganMerchant
        keuntunganMerchant = (hargaJualMakanan-biayaMakanan)*(1-komisiPerusahaan/100)*(1-resikoKerusakanBarang/100)*jumlahTransaksi;

        //Hitung total keuntungan semua mitra
        totalKeuntunganSemuaMitra = keuntunganDriver + keuntunganMerchant;

        //Hitung rata rata keuntungan dari semua transaksi
        ratarataKeuntunganSemuaTransaksi = (totalKeuntunganSemuaMitra / jumlahTotalTransaksi);

        //Persentase kontribusi dari masing masing mitra
        //Kontribusi Driver
        persentaseKontribusiDriver = (keuntunganDriver / totalKeuntunganSemuaMitra) * 100;

        //KontribusiMerchant
        persentaseKontribusiMerchant = (keuntunganMerchant / totalKeuntunganSemuaMitra) * 100;

        System.out.println("Keuntungan driver\t: Rp " + keuntunganDriver);
        System.out.println("Keuntungan merchant\t: Rp " + keuntunganMerchant);
        System.out.println("Total keuntungan semua mitra\t: Rp " + totalKeuntunganSemuaMitra);
        System.out.println("Rata rata dari keuntungan semua transaksi: Rp " + ratarataKeuntunganSemuaTransaksi);
        System.out.println("Persentase kontribusi driver " + persentaseKontribusiDriver + " %");
        System.out.println("Persentase kontribusi merchant: Rp " + persentaseKontribusiMerchant + " %");
    }
}