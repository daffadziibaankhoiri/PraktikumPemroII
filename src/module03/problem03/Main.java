package module03.problem03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa Berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            int option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String name = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();

                    boolean doesIdAlreadyExist = false;
                    for (Student student : students) {
                        if (student.getNim().equals(nim)) {
                            doesIdAlreadyExist = true;
                            break;
                        }
                    }

                    if (doesIdAlreadyExist) {
                        System.out.println("NIM " + nim + " sudah terdaftar.");
                    } else {
                        students.add(new Student(name, nim));
                        System.out.println("Mahasiswa " + name + " ditambahkan.");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nim = input.nextLine();

                    boolean isIdFound = false;
                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).getNim().equals(nim)) {
                            isIdFound = true;
                            students.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                            break;
                        }
                    }

                    if (!isIdFound) {
                        System.out.println("NIM " + nim + " tidak ditemukan.");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = input.nextLine();

                    boolean isIdFound = false;
                    for (Student student : students) {
                        if (student.getNim().equals(nim)) {
                            isIdFound = true;
                            System.out.println("NIM: " + student.getNim()
                                    + ", Nama: " + student.getName());
                            break;
                        }
                    }

                    if (!isIdFound) {
                        System.out.println("NIM " + nim + " tidak ditemukan.");
                    }
                    break;
                }

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Student student : students) {
                        System.out.println("NIM: " + student.getNim()
                                + ", Nama: " + student.getName());
                    }
                    break;

                case 0:
                    students.clear();
                    System.out.println("Terima kasih!");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}