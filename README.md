# Eksplorasi-Materi-Graphical-User-Interface-pada-Java
# Form Input Pemula (PBO)

Aplikasi GUI sederhana berbasis **Java Swing** untuk latihan Pemrograman Berorientasi Objek (PBO). Pengguna mengisi nama, memilih program studi, mencentang persetujuan, lalu menekan tombol **Simpan** untuk menampilkan hasil input dalam dialog.

## Identitas

- Nama: Rayyan Habibi
- NIM: F1D02510140

## Fitur

- Input **Nama** (`JTextField`)
- Pilihan **Program Studi** (`JComboBox`): Informatika, Sipil, Elektro, Mesin
- **Checkbox persetujuan** ("Saya mengisi data dengan benar")
- Tombol **Simpan** dengan validasi:
  1. Jika checkbox belum dicentang, muncul peringatan "Harap centang persetujuan terlebih dahulu!"
  2. Jika nama kosong, muncul peringatan "Nama tidak boleh kosong!"
  3. Jika valid, muncul dialog informasi berisi nama dan prodi yang dipilih

## Struktur File

| File | Keterangan |
|------|------------|
| `FormPemula.java` | Source code utama |
| `FormPemula.class` | Hasil kompilasi kelas utama |
| `FormPemula$1.class` | Hasil kompilasi *anonymous inner class* (`ActionListener` tombol Simpan) |

> **Catatan:** file `FormPemula1.class` yang terlampir sebenarnya adalah `FormPemula$1.class`. Tanda `$` sering hilang saat file diunggah atau diganti nama. Jika dijalankan dari `.class`, namanya harus dikembalikan menjadi `FormPemula$1.class`. Cara paling aman adalah mengompilasi ulang dari `.java`.

## Konsep PBO yang Digunakan

- **Inheritansi**: `FormPemula extends JFrame`
- **Enkapsulasi**: atribut komponen GUI bersifat `private`
- **Konstruktor**: inisialisasi tampilan GUI dan pemanggilan `super("...")` untuk judul frame
- **Anonymous inner class**: `ActionListener` untuk event handling tombol
- **Polimorfisme / `@Override`**: `actionPerformed(ActionEvent e)`
- **Container GUI**: `JFrame` (top-level), `JPanel` dengan `FlowLayout` (intermediate), komponen atomic (`JLabel`, `JTextField`, `JComboBox`, `JCheckBox`, `JButton`)
- **Event Dispatch Thread**: GUI dijalankan lewat `SwingUtilities.invokeLater`

## Prasyarat

- **JDK** terpasang. File `.class` terlampir dikompilasi dengan class file version 69, yaitu **Java 25**. Untuk menjalankan `.class` tersebut dibutuhkan JRE/JDK 25 atau lebih baru. Jika memakai JDK lebih lama, kompilasi ulang dari source.
- Lingkungan desktop dengan tampilan grafis (Swing tidak bisa berjalan di terminal tanpa GUI).

Cek versi Java:

```bash
java -version
javac -version
```

## Cara Menjalankan

### Opsi 1: Kompilasi dari source (disarankan)

```bash
javac FormPemula.java
java FormPemula
```

### Opsi 2: Langsung dari file .class

Pastikan `FormPemula.class` dan `FormPemula$1.class` berada di folder yang sama, lalu:

```bash
java FormPemula
```

### Lewat IDE (NetBeans / IntelliJ / Eclipse / VS Code)

1. Buat project Java baru.
2. Salin `FormPemula.java` ke folder source.
3. Jalankan kelas `FormPemula` (memiliki method `main`).

## Cara Penggunaan

1. Ketik nama pada kolom **Nama**.
2. Pilih **Program Studi** dari dropdown.
3. Centang **"Saya mengisi data dengan benar"**.
4. Klik **Simpan**.
5. Dialog akan menampilkan:

   ```
   Data Disimpan!
   Nama: <nama yang diisi>
   Prodi: <prodi yang dipilih>
   ```

## Catatan

- Data hanya ditampilkan di dialog dan **tidak disimpan** ke file atau database.
- Ukuran jendela 360 x 240 piksel dan muncul di tengah layar.
- Menutup jendela akan menghentikan program (`EXIT_ON_CLOSE`).
