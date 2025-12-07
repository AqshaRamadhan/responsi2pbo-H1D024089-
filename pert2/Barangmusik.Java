public class Barangmusik {
    String kodeBarang;
    String namaBarang;
    double harga;
    int stok;

    public Barangmusik(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = 0.0;
        this.stok = 0;
    }

    public Barangmusik(String kodeBarang, String namaBarang, double harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = 0;
    }

    public Barangmusik(String kodeBarang, String namaBarang, double harga, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }

    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }

    void tambahStok(int jumlah) {
        this.stok = this.stok + jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik " + namaBarang + " | Kode: " + kodeBarang + " | Harga: Rp " + harga + " | Stok: " + stok + " unit");
    }
}