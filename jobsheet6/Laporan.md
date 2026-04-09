# Laporan Praktikum Algoritma dan Struktur Data
<h4>Nama  : Haidhar Annabigh I.</h4>
<h4>NIM   : 254107020103</h4>
<h4>Kelas : TI-1E</h4>

## Percobaan 1
<img width="825" height="597" alt="image" src="https://github.com/user-attachments/assets/97d9d0e9-82f4-49a5-8168-110f8754c08c" />
<img width="843" height="867" alt="image" src="https://github.com/user-attachments/assets/c9aa15ed-a9a5-482a-96c8-9ed174df0186" />
<img width="502" height="544" alt="image" src="https://github.com/user-attachments/assets/0da67046-45d2-42b7-8271-4a826f2ab59a" />
<img width="555" height="657" alt="image" src="https://github.com/user-attachments/assets/9dc103b6-6ae6-443c-958e-52e8792ba313" />

### Pertanyaan
1. tampilPosisi digunakan untuk hanya menampilkan posisi atau indeks dari data mahasiswa yang dicari dalam array. Sedangkan tampilDataSearch digunakan untuk menampilkan detail lengkap dari mahasiswa yang ditemukan, seperti NIM, nama, kelas, dan IPK.
2. Untuk menghentikan perulangan secara langsung ketika data yang dicari sudah ditemukan.
3. Untuk menyimpan posisi data yang ditemukan dalam array saat proses sequential search berlangsung.
4. Program akan menampilkan data pertama yang ditemukan karena saat kondisi if terpenuhi, program langsung menyimpan posisi lalu menjalankan break tanpa mencari lagi data dengan nilai yang sama.
5. Perulangan akan tetap berjalan sampai seluruh data dalam array selesai dicek dan akhirnya menyimpan indeks dari data terakhir yang ditemukan, bukan yang pertama.

   
## Percobaan 2
<img width="589" height="313" alt="image" src="https://github.com/user-attachments/assets/7990ad9c-277f-4514-9f96-5ea72f62c224" />
<img width="670" height="318" alt="image" src="https://github.com/user-attachments/assets/f06e6b07-60ee-4c6c-b55b-8f5e229b228c" />
<img width="518" height="533" alt="image" src="https://github.com/user-attachments/assets/6be8eabe-b04e-46a6-ab3a-5295ea0da663" />
<img width="564" height="695" alt="image" src="https://github.com/user-attachments/assets/68589d9c-0dce-4da2-9b12-2cf41f024e04" />

### Pertanyaan
1. mid = (left + right) / 2;
2. return findBinarySearch(cari, left, mid - 1);
   return findBinarySearch(cari, mid + 1, right);
3. left menunjukkan batas kiri, right menunjukkan batas kanan, mid menunjukkan indeks tengah yang digunakan untuk membandingkan nilai.
4. Program tidak akan bekerja dengan benar, karena binary search wajib menggunakan data yang sudah terurut. Jika tidak, hasil pencarian bisa salah atau tidak ketemu.
5. hasil bisa salah, berikut kode program binary seach agar hasilnya sesuai
   <img width="432" height="153" alt="image" src="https://github.com/user-attachments/assets/bedf1885-574a-454d-98bd-888b481f21ee" />
6. Saat kondisi if (right < left) terpenuhi, maka return -1; Artinya seluruh kemungkinan sudah dicek dan data tidak ada.
7.    

  
   <img width="539" height="174" alt="image" src="https://github.com/user-attachments/assets/171eae1e-d17f-4a94-b54b-e92db8a67c56" />
   <img width="520" height="663" alt="image" src="https://github.com/user-attachments/assets/6f55f729-f420-466a-933e-9c19ace12b10" />
