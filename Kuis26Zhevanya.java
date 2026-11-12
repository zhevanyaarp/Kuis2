import java.util.Scanner;

public class Kuis26Zhevanya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porsi;
        int total = 0;
        int jumlahTransaksi = 0;
        int totalPorsi = 0;
        int nim2 = 98;
        int k = (nim2 % 3) + 3;

        System.out.print("Jumlah porsi (0 = selesai): ");
        porsi = sc.nextInt();
        jumlahTransaksi++;

        while (porsi != 0) {
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi
            int biaya = 15000 + (porsi - 1) * 12000;
            porsi++;
            
            if (porsi < 1 || porsi >= 10) {
                System.out.println("Input tidak valid.");
            }


            total = 0;
            total += biaya;
            System.out.println("Biaya: Rp " + biaya);

            System.out.print("Jumlah porsi (0 = selesai): ");
            
            break;
        }

        totalPorsi = porsi * jumlahTransaksi;

        int porsiTerbanyak = totalPorsi;

        if (jumlahTransaksi == 1) {
            porsiTerbanyak = totalPorsi;
        } else {
            porsiTerbanyak = Math.max(porsiTerbanyak, totalPorsi);
        }

        int diskon = jumlahTransaksi * nim2 * 1000;
        
        System.out.println("Jumlah valid transaksi: " + jumlahTransaksi);

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Porsi terbanyak dalam satu transaksi: " + porsiTerbanyak);
        System.out.println("Total diskon: Rp " + diskon);

        sc.close();
    }
}