# 🏥 SISTEM MANAJEMEN ANTRIAN KLINIK 💉

## 📖 DESKRIPSI SINGKAT
Sistem Manajemen Antiran Klinik merupakan program berbasis Java yang digunakan untuk mengelola data pasien pada sebuah klinik secara sederhana melalui terminal/console. Program ini memungkinkan pengguna untuk melakukan proses CRUD (Create, Read, Update, Delete) terhadap data pasien, serta menyediakan fitur panggil pasien untuk menghapus pasien yang telah dipanggil dari daftar antrian. Program dibuat dengan menerapkan konsep dasar Pemrograman Berorientasi Objek (PBO) seperti class, object, constructor, access modifier, encapsulation, ArrayList, branching, looping, dan validasi input.

## ⚙️ FITUR PROGRAM

| Menu | Fitur | Fungsi |
|------|-------|--------|
| 1 | Tampilkan Pasien | Menampilkan seluruh data pasien |
| 2 | Tambahkan Pasien | Menambahkan data pasien baru |
| 3 | Update Pasien | Mengubah data pasien berdasarkan ID |
| 4 | Hapus Pasien | Menghapus data pasien berdasarkan ID |
| 5 |Panggil Pasien | Memanggil pasien berdasarkan ID dan menghapusnya dari daftar |
| 6 | Keluar | Mengakhiri program |

### PENJELASAN FITUR
**1. Tampilkan Pasien**

Fitur ini digunakan untuk menampilkan seluruh data pasien yang telah tersimpan di dalam sistem.

Data yang ditampilkan meliputi **ID pasien, nama, umur, dan nomor telepon**. Jika belum terdapat data pasien, sistem akan memberikan informasi bahwa belum ada data pasien.

**2. Tambahkan Pasien**

Fitur ini digunakan untuk menambahkan data pasien baru ke dalam sistem.

Pengguna diminta memasukkan beberapa data, yaitu:

- **ID Pasien**
- **Nama Pasien**
- **Umur**
- **Nomor Telepon**

Data pasien yang telah dimasukkan kemudian disimpan ke dalam `ArrayList`.

**3. Update Pasien**

Fitur ini digunakan untuk mengubah data pasien yang sudah tersimpan. 

Pengguna terlebih dahulu memasukkan **ID pasien** yang ingin diubah. Setelah itu, pengguna dapat memasukkan **nama, umur, dan nomor telepon baru**. Jika ID ditemukan, data pasien akan diperbarui. Jika ID tidak ditemukan, sistem akan menampilkan pesan bahwa data pasien tidak ditemukan.

**4. Hapus Pasien**

Fitur ini digunakan untuk menghapus data pasien dari sistem.

Pengguna memasukkan **ID pasien** yang ingin dihapus. Sistem akan mencari pasien berdasarkan ID tersebut. Jika ditemukan, data pasien akan dihapus dari `ArrayList`.

**5. Panggil Pasien**

Fitur ini digunakan untuk memanggil pasien berdasarkan **ID pasien**.

Ketika pasien berhasil ditemukan, sistem akan menampilkan pesan panggilan atas nama pasien dan kemudian **menghapus pasien dari daftar antrian** karena pasien telah dipanggil untuk memasuki ruangan.

**6. Keluar**

Fitur ini digunakan untuk mengakhiri program.

Ketika pengguna memilih menu keluar, perulangan program akan dihentikan dan sistem menampilkan pesan bahwa program telah selesai.

## ⬆️ ALUR PROGRAM

1. **Memulai Program**  
   Program dijalankan melalui `Main.java` dan sistem menampilkan menu utama.

2. **Memilih Menu**  
   Pengguna memilih salah satu dari enam menu yang tersedia menggunakan input angka.

3. **Menampilkan Data Pasien**  
   Sistem menampilkan seluruh data pasien yang tersimpan di dalam `ArrayList`.

4. **Menambahkan Pasien**  
   Pengguna memasukkan ID, nama, umur, dan nomor telepon. Data pasien kemudian disimpan ke dalam `ArrayList`.

5. **Mengupdate Data Pasien**  
   Pengguna memasukkan ID pasien yang ingin diubah, kemudian memasukkan data baru. Sistem akan memperbarui data jika ID ditemukan.

6. **Menghapus Data Pasien**  
   Pengguna memasukkan ID pasien. Jika ID ditemukan, data pasien akan dihapus dari `ArrayList`.

7. **Memanggil Pasien**  
   Pengguna memasukkan ID pasien yang ingin dipanggil. Sistem menampilkan nama pasien dan menghapusnya dari daftar antrian setelah dipanggil.

8. **Validasi Input**  
   Input yang membutuhkan angka akan diperiksa menggunakan class `ValidasiInput`. Sistem juga memastikan umur pasien lebih dari 0.

9. **Perulangan Program**  
   Setelah menjalankan suatu fitur, sistem kembali ke menu utama sehingga pengguna dapat melakukan proses lainnya.

10. **Mengakhiri Program**  
    Program berhenti ketika pengguna memilih menu **6. Keluar**.


## 📑 STRUKTUR CLASS

Program terdiri dari tiga class utama di luar entry point dan satu class utama sebagai entry point.

```text
Source Packages
|-- com.mycompany.klinik
    |-- Main.java
    |-- Pasien.java
    |-- PasienCRUD.java
    |-- ValidasiInput.java
```


### 1. `Pasien.java` 

Class `Pasien` digunakan sebagai **model** untuk menyimpan data pasien. Class ini memiliki empat atribut yaitu ID pasien, nama, umur, dan nomor telepon.

```java
package com.mycompany.klinik;

public class Pasien {
    private int idPasien;
    private String nama;
    private int umur;
    private String noTelepon;

    public Pasien(int idPasien, String nama, int umur, String noTelepon){
        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;
        this.noTelepon = noTelepon;
    }

    public void tampilkanPasien() {
        System.out.printf("%-10d | %-20s | %-6d | %-15s\n",
                idPasien, nama, umur, noTelepon);
    }

    public int getIdPasien(){
        return idPasien;
    }

    public void setIdPasien(int idPasien){
        this.idPasien = idPasien;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public String getNoTelepon(){
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon){
        this.noTelepon = noTelepon;
    }
}
```

### 2. `PasienCRUD.java`

Class `PasienCRUD` digunakan untuk mengelola data pasien dan menjalankan proses **Create, Read, Update, Delete (CRUD)**.

Class ini menggunakan `ArrayList` untuk menyimpan kumpulan objek pasien.

```java
package com.mycompany.klinik;

import java.util.ArrayList;

public class PasienCRUD {

    private ArrayList<Pasien> ListPasien = new ArrayList<>();

    // Tambahkan pasien
    public void tambahPasien(Pasien pasien) {
        ListPasien.add(pasien);
        System.out.println("Pasien ditambahkan");
    }

    // Tampilkan pasien
    public void tampilkanPasien() {
        if (ListPasien.isEmpty()) {
            System.out.println("Belum ada data pasien");
        } else {
            System.out.println("===== DAFTAR PASIEN =====");
            System.out.printf("%-10s | %-20s | %-6s | %-15s\n",
                    "ID", "Nama", "Umur", "NO Telepon");

            for (Pasien pasien : ListPasien) {
                pasien.tampilkanPasien();
            }
        }
    }

    // Hapus pasien
    public void hapusPasien(int idPasien) {
        Pasien pasienHapus = null;

        for (Pasien pasien : ListPasien) {
            if (pasien.getIdPasien() == idPasien) {
                pasienHapus = pasien;
                break;
            }
        }

        if (pasienHapus != null) {
            ListPasien.remove(pasienHapus);
            System.out.println("Pasien berhasil dihapus");
        } else {
            System.out.println("ID pasien tidak ditemukan");
        }
    }

    // Update pasien
    public void updatePasien(int idPasien, String namaBaru,
            int umurBaru, String noTeleponBaru) {

        Pasien pasienDitemukan = null;

        for (Pasien pasien : ListPasien) {
            if (pasien.getIdPasien() == idPasien) {
                pasienDitemukan = pasien;
                break;
            }
        }

        if (pasienDitemukan != null) {
            pasienDitemukan.setNama(namaBaru);
            pasienDitemukan.setUmur(umurBaru);
            pasienDitemukan.setNoTelepon(noTeleponBaru);

            System.out.println("Pasien berhasil diupdate");
        } else {
            System.out.println("ID pasien tidak ditemukan");
        }
    }

    // Panggil pasien
    public void panggilPasien(int idPasien) {
        Pasien pasienDipanggil = null;

        for (Pasien pasien : ListPasien) {
            if (pasien.getIdPasien() == idPasien) {
                pasienDipanggil = pasien;
                break;
            }
        }

        if (pasienDipanggil != null) {
            System.out.println("Panggilan atas nama Pasien "
                    + pasienDipanggil.getNama()
                    + " Silahkan memasuki ruangan");

            ListPasien.remove(pasienDipanggil);

        } else {
            System.out.println("ID pasien tidak ditemukan");
        }
    }
}
```

### 3. `ValidasiInput.java`

Class `ValidasiInput` digunakan untuk melakukan **validasi input angka**. Jika pengguna memasukkan input selain angka, sistem akan meminta pengguna memasukkan angka kembali.

```java
package com.mycompany.klinik;

import java.util.Scanner;

public class ValidasiInput {

    public static int inputInteger(Scanner scanner, String pesan){
        System.out.print(pesan);

        while (!scanner.hasNextInt()){
            System.out.println("Input harus berupa angka");
            scanner.nextLine();
            System.out.print(pesan);
        }

        int nilai = scanner.nextInt();
        scanner.nextLine();

        return nilai;
    }
}
```

### 4. `Main.java`

Class `Main` merupakan class utama yang digunakan untuk menjalankan program. Class ini menampilkan menu, menerima input pengguna, menggunakan percabangan `switch`, serta menggunakan perulangan `while` agar program terus berjalan sampai pengguna memilih keluar.

```java
package com.mycompany.klinik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PasienCRUD crud = new PasienCRUD();
        Scanner scanner = new Scanner(System.in);
        boolean berjalan = true;

        while (berjalan){

            System.out.println("\n==========================================");
            System.out.println("      SISTEM MANAJEMEN PASIEN KLINIK");
            System.out.println("==========================================");
            System.out.println("1. Tampilkan Pasien");
            System.out.println("2. Tambahkan Pasien");
            System.out.println("3. Update Pasien");
            System.out.println("4. Menghapus Pasien");
            System.out.println("5. Panggil Pasien");
            System.out.println("6. Keluar");

            int pilihan = ValidasiInput.inputInteger(
                    scanner, "Pilih menu 1-6 : ");

            switch (pilihan){

                case 1:
                    crud.tampilkanPasien();
                    break;

                case 2:
                    crud.tampilkanPasien();
                    System.out.println("=====TAMBAH PASIEN=====");

                    int id = ValidasiInput.inputInteger(
                            scanner, "Masukkan ID Pasien : ");

                    System.out.print("masukkan nama pasien : ");
                    String nama = scanner.nextLine();

                    int umur = ValidasiInput.inputInteger(
                            scanner, "Masukkan umur pasien : ");

                    if (umur <= 0) {
                        System.out.println("Umur harus lebih dari 0");
                        break;
                    }

                    System.out.print("masukkan no telepon : ");
                    String noTelepon = scanner.nextLine();

                    Pasien pasienBaru =
                            new Pasien(id, nama, umur, noTelepon);

                    crud.tambahPasien(pasienBaru);
                    break;

                case 3:
                    crud.tampilkanPasien();
                    System.out.println("=====UPDATE PASIEN=====");

                    int idUpdate = ValidasiInput.inputInteger(
                            scanner, "Masukkan ID Pasien : ");

                    System.out.print("Nama baru : ");
                    String namaBaru = scanner.nextLine();

                    int umurBaru = ValidasiInput.inputInteger(
                            scanner, "Masukkan umur pasien : ");

                    if (umurBaru <= 0){
                        System.out.println("Umur harus lebih dari 0");
                        break;
                    }

                    System.out.print("NO telepon baru : ");
                    String noTeleponBaru = scanner.nextLine();

                    crud.updatePasien(
                            idUpdate,
                            namaBaru,
                            umurBaru,
                            noTeleponBaru
                    );
                    break;

                case 4:
                    crud.tampilkanPasien();
                    System.out.println("=====HAPUS DATA PASIEN=====");

                    int idHapus = ValidasiInput.inputInteger(
                            scanner,
                            "Masukkan ID Pasien yang ingin dihapus : ");

                    crud.hapusPasien(idHapus);
                    break;

                case 5:
                    crud.tampilkanPasien();
                    System.out.println("=====PANGGIL PASIEN=====");

                    int idPanggil = ValidasiInput.inputInteger(
                            scanner, "Masukkan ID Pasien : ");

                    crud.panggilPasien(idPanggil);
                    break;

                case 6:
                    berjalan = false;
                    System.out.println("program selesai");
                    break;

                default:
                    System.out.println("pilihan tidak valid");
            }
        }

        scanner.close();
    }
}
```
## ➕ Penerapan Nilai Tambah

Program ini juga menerapkan beberapa nilai tambah dalam Pemrograman Berorientasi Objek.

### Access Modifier
Access modifier `private` digunakan pada atribut class `Pasien` agar data pasien tidak dapat diakses atau diubah secara langsung dari luar class.

```java
private int idPasien;
private String nama;
private int umur;
private String noTelepon;
```

### Encapsulation
Encapsulation digunakan untuk **membungkus dan melindungi data di dalam class** agar tidak dapat diakses atau diubah secara langsung dari luar class. Pada program ini, atribut pada class `Pasien` dibuat `private`, sehingga untuk mengambil atau mengubah data digunakan **getter dan setter**.


```java
public String getNama(){
    return nama;
}

public void setNama(String nama){
    this.nama = nama;
}
```

### Input Validation
Validasi input digunakan untuk mencegah kesalahan ketika pengguna memasukkan data. Pada program ini, validasi digunakan untuk memastikan input yang membutuhkan angka benar-benar berupa angka.

```java
while (!scanner.hasNextInt()){
    System.out.println("Input harus berupa angka");
    scanner.nextLine();
}
```

Selain itu, umur pasien divalidasi agar memiliki nilai lebih dari 0.

```java
if (umur <= 0) {
    System.out.println("Umur harus lebih dari 0");
}
```
