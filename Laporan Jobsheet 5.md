# Laporan Praktikum Algoritma dan Struktur Data
<h4>Nama  : Haidhar Annabigh I.</h4>
<h4>NIM   : 254107020103</h4>
<h4>Kelas : TI-1E</h4>


## Percobaan 1
<img width="607" height="509" alt="image" src="https://github.com/user-attachments/assets/71fe01ba-553f-43eb-89c6-e76e51e57ecd" />
<img width="715" height="445" alt="image" src="https://github.com/user-attachments/assets/a1711620-333e-4682-b39b-3eb15777685d" />
<img width="357" height="68" alt="image" src="https://github.com/user-attachments/assets/1e22a8aa-f829-40bb-a452-81dc70c6f695" />


### Pertanyaan
1. Bagian if berfungsi sebagai base case yang menentukan kapan proses rekursi harus berhenti. Bagian else berfungsi sebagai kondisi rekursif yang dijalankan ketika nilai tidak memenuhi kondisi if. 
2. Ya, sebagai bukti jika kita menggantinya dengan menggunakan while, selama kondisi 1 <= n terpenuhi, perulangan akan terus berjalan.
   Buktinya sebagai berikut:
   
  public int faktorialBF(int n) {
    int fakto = 1;
    int i = 1;
    while (i <= n) {
        fakto = fakto * i;
        i++;
    }
    return fakto;
}


3. Perintah fakto *= i; biasanya digunakan pada metode faktorial dengan pendekatan Brute Force atau iteratif yang menggunakan perulangan seperti for atau while. Sedangkan perintah int fakto = n * faktorialDC(n-1); digunakan pada metode faktorial dengan pendekatan Divide and Conquer (rekursi).
4. Perbedaannya terletak pada cara kerjanya dalam menghitung nilai faktorial. method faktorialBF() menggunakan pendekatan brute force, sedangkan Method faktorialDC() menggunakan pendekatan Divide Conquer.

   
## Percobaan 2
<img width="807" height="766" alt="image" src="https://github.com/user-attachments/assets/f909d34a-8e35-4afe-bfcb-b7a408cf92fb" />
<img width="1062" height="742" alt="image" src="https://github.com/user-attachments/assets/0039083f-cce2-44fd-8629-523e711168fd" />
<img width="403" height="332" alt="image" src="https://github.com/user-attachments/assets/aa4890b5-e542-41b4-b270-82789a74875d" />

### Pertanyaan
1. Method pangkatBF() menggunakan pendekatan Brute Force dengan memanfaatkan perulangan. Sedangkan method pangkatDC() menggunakan pendekatan Divide and Conquer dengan membagi masalah menjadi bagian yang lebih kecil sampai mencapai kondisi dasar.
2. Ya, tahap combine terlihat pada bagian

return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);


dan 


return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));


3. Menurut saya, method pangkatBF() sebenarnya tidak harus memiliki parameter, karena pada class Pangkat sudah terdapat atribut nilai dan pangkat yang dapat langsung digunakan dalam perhitungan. Contoh method pangkatBF() tanpa parameter adalah sebagai berikut

int pangkatBF() {
    int hasil = 1;
    for (int i = 0; i < pangkat; i++) {
        hasil = hasil * nilai;
    }
    return hasil;
}


4. Method pangkatBF() bekerja menggunakan perulangan dengan cara mengalikan nilai basis secara berulang sebanyak nilai pangkat yang diminta hingga perulangan selesai. Proses ini dilakukan langkah demi langkah dalam satu method. Sedangkan method pangkatDC() bekerja menggunakan konsep Divide and Conquer. Method ini memecah perhitungan pangkat menjadi masalah yang lebih kecil dengan memanggil method yang sama menggunakan nilai pangkat yang lebih kecil. Setelah itu, hasil dari pemanggilan tersebut digabungkan kembali melalui proses perkalian untuk mendapatkan hasil akhir.
## Percobaan 3
<img width="676" height="691" alt="image" src="https://github.com/user-attachments/assets/20349650-dcc5-40e5-a058-dbbf3fde59ba" />
<img width="1264" height="458" alt="image" src="https://github.com/user-attachments/assets/bba576c8-5ea4-4be7-9757-5f44f5f38f0b" />
<img width="490" height="183" alt="image" src="https://github.com/user-attachments/assets/724a594b-d1ff-4c29-b8ec-4a089fd82a74" />

### Pertanyaan
1. Untuk membagi array menjadi dua bagian, yaitu bagian kiri dan bagian kanan.
2. Untuk menghitung total nilai pada dua bagian array yang telah dibagi, yaitu bagian kiri dan bagian kanan. Baris pertama memanggil kembali method totalDC() untuk menghitung jumlah elemen dari indeks l sampai mid (bagian kiri array) dan menyimpannya ke dalam variabel lsum. Sedangkan baris kedua memanggil method totalDC() untuk menghitung jumlah elemen dari indeks mid+1 sampai r (bagian kanan array) dan menyimpannya ke dalam variabel rsum.
3. karena pada algoritma Divide and Conquer data telah dibagi menjadi dua bagian, yaitu bagian kiri dan bagian kanan. Dengan menjumlahkan lsum dan rsum, method dapat menghasilkan total keseluruhan nilai yang ada dalam array keuntungan.
4.  if (l == r) {
    return arr[l];
}
5. method totalDC() bekerja dengan cara membagi array menjadi dua bagian secara rekursif hingga mencapai kondisi dasar saat hanya tersisa satu elemen. Setelah itu, hasil dari bagian kiri dan kanan dijumlahkan kembali untuk mendapatkan total seluruh elemen array.
## Tugas
### Tugas 1
<img width="655" height="889" alt="image" src="https://github.com/user-attachments/assets/0277e792-6a35-40a5-9658-d2c8242e8972" />
<img width="810" height="578" alt="image" src="https://github.com/user-attachments/assets/4b2e3040-7dd9-4a3a-b3d9-6894dc27ef92" />
<img width="431" height="85" alt="image" src="https://github.com/user-attachments/assets/34d37604-e790-40e8-a203-9ded5f8bf9ef" />
