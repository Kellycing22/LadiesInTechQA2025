package sesi2;

public class contohifelse {
    public static void main(String[] args) {
        double gpa = 2;
        boolean aktifOrganisasi = true;
        double income = 3500000;

        String kategori;

        if (gpa >= 3.8 && income <= 4000000) {
            kategori = "Beasiswa Unggulan"; // nilai tinggi dan ekonomi menengah ke bawah
        } else if (gpa >= 3.5 && aktifOrganisasi && income <= 6000000) {
            kategori = "Beasiswa Berprestasi"; // nilai bagus + aktif organisasi
        } else if (gpa >= 3.0 && income <= 5000000) {
            kategori = "Beasiswa Reguler"; // cukup bagus dan ekonomi menengah ke bawah
        } else if (gpa < 2.5) {
            kategori = "Tidak memenuhi syarat (IPK terlalu rendah)";
        } else {
            kategori = "Belum memenuhi syarat untuk beasiswa";
        }

        System.out.println("IPK Anda: " + gpa);
        System.out.println("Aktif organisasi: " + aktifOrganisasi);
        System.out.println("Penghasilan orang tua: Rp " + income);
        System.out.println("Kategori beasiswa: " + kategori);
    }
}
