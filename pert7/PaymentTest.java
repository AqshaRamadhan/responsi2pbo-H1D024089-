public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment ovo = new EWalletPayment("OVO", 50000, 150000);

        System.out.println("Saldo awal: " + (int)ovo.getBalance());
        System.out.println("Memproses pembayaran sebesar " + (int)ovo.getNominalPembayaran() + "...");

        System.out.println(ovo.processPayment());
        System.out.println("Sisa saldo: " + (int)ovo.getBalance());
        System.out.println("Detail Transaksi: " + ovo.getPaymentDetails());
    }
}