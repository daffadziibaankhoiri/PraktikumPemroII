package module02.problem03;

public class Main {
    public static void main(String[] args) {
        Employee p1 = new Employee();
//        p1.nama = "Roi"
        // kurang semicolon di akhir setelah assignmet nama yang menyebabkan error
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        // menambah assignment umur walau ini tidak disarankan karena mengakses langsung nilai variabel tanpa menggunakan setter
        p1.umur = 17;
        p1.setJabatan("Assasin");
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
        // menambahkan kata tahun di belakang umur
    }
}
