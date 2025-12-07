public class EWalletPayment implements PaymentMethod {
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldo;

    public EWalletPayment(String namaLayanan, double nominalPembayaran, double saldo) {
        this.namaLayanan = namaLayanan;
        this.nominalPembayaran = nominalPembayaran;
        this.saldo = saldo;
    }

    @Override
    public double getTransactionFee() {
        return 2000.0;
    }

    @Override
    public String processPayment() {
        double totalBayar = nominalPembayaran + getTransactionFee();
        if (saldo >= totalBayar) {
            saldo -= totalBayar;
            return "Pembayaran berhasil!";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.";
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + namaLayanan;
    }

    @Override
    public double getBalance() {
        return saldo;
    }

    public double getNominalPembayaran() {
        return nominalPembayaran;
    }
}