package module02.problem03;

public class Employee {
    public String nama;
//    public char asal;
    public String asal;
    // Mengubah tipe data asal menjadi String karena input yang diberikan tidak hanya 1 char jadi diubah menggunakan String
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
//    public void setJabatan() {
//        this.jabatan = ja;
//    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    //error yang terjadi adalah Cannot resolve symbol 'ja'
    // Menambahkan parameter String jabatan dan melengkapi variabel jabatan yang penulisannya kurang lengkap
}

