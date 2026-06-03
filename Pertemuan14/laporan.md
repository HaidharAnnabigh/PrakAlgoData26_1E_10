# Laporan Praktikum Algoritma dan Struktur Data
<h4>Nama  : Haidhar Annabigh I.</h4>
<h4>NIM   : 254107020103</h4>
<h4>Kelas : TI-1E</h4>

## Percobaan 1
<img width="710" height="485" alt="image" src="https://github.com/user-attachments/assets/3cf08122-19fa-420a-af5b-a2b32521ca1a" />
<img width="519" height="319" alt="image" src="https://github.com/user-attachments/assets/0fcb37b9-9fc1-455b-8d2a-1e9a344b9d4b" />
<img width="728" height="948" alt="image" src="https://github.com/user-attachments/assets/38006669-3df4-470c-852f-a7471705ee90" />
<img width="689" height="911" alt="image" src="https://github.com/user-attachments/assets/69fffe5f-fc15-4123-981d-27595774763e" />
<img width="709" height="560" alt="image" src="https://github.com/user-attachments/assets/df1dcf76-f1f0-4fdf-99b9-70e96a4c9c75" />
<img width="841" height="923" alt="image" src="https://github.com/user-attachments/assets/75d3302b-124e-40e9-abb3-39b220e8e98c" />
<img width="619" height="897" alt="image" src="https://github.com/user-attachments/assets/8f13511f-d252-4e09-832a-bbd9d67ff512" />

### Pertanyaan
1. Karena pada Binary Tree setiap node memiliki aturan bahwa nilai di subtree kiri lebih kecil dari node induk dan nilai di subtree kanan lebih besar dari node induk.
2. left digunakan untuk menyimpan referensi atau alamat anak kiri dari suatu node. right digunakan untuk menyimpan referensi atau alamat anak kanan dari suatu node.
3. berfungsi sebagai penunjuk node paling atas dari tree.
4. Node baru akan langsung dijadikan root karena belum ada node lain dalam tree.
5. digunakan untuk menentukan posisi node baru berdasarkan aturan Binary Search Tree. Jika IPK yang akan ditambahkan lebih kecil dari IPK node saat ini, pencarian posisi dilanjutkan ke subtree kiri. Jika IPK lebih besar, pencarian posisi dilanjutkan ke subtree kanan.
6. Cari node yang akan dihapus, karena node memiliki dua anak, node tidak dapat langsung dihapus. Cari node pengganti, yaitu node dengan nilai terkecil pada subtree kanan. Method getSuccessor() digunakan untuk menemukan node pengganti tersebut. Data successor menggantikan posisi node yang dihapus. Hubungan child kiri dan kanan diperbarui agar struktur BST tetap benar. Node lama kemudian dihapus.

## Percobaan 2
<img width="577" height="528" alt="image" src="https://github.com/user-attachments/assets/c5a5209d-a565-4088-b3f4-69a3cffb5f41" />
<img width="851" height="476" alt="image" src="https://github.com/user-attachments/assets/1183a6ec-660e-4997-9b8d-6d7150238479" />
<img width="428" height="196" alt="image" src="https://github.com/user-attachments/assets/2a56546d-78ac-4de1-bcdf-7c5d543ab079" />

### Pertanyaan
1. data digunakan untuk menyimpan node-node tree dalam bentuk array. idxLast digunakan untuk menyimpan indeks terakhir yang terisi pada array.
2. untuk mengisi array tree dengan data yang telah dibuat dari method main sehingga tree dapat digunakan untuk proses traversal.
3. untuk menampilkan isi tree dengan urutan Left, Root, Right.
4. Left Child berada pada indeks 5 dan Right Child berada pada indeks 6.
5. menunjukkan bahwa indeks terakhir yang berisi data pada array tree adalah indeks ke-6.
6. Karena pada representasi binary tree menggunakan array berlaku aturan Anak kiri berada pada indeks 2 * i + 1, Anak kanan berada pada indeks 2 * i + 2.
