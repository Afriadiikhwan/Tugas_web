<?php
// variabel nama bulan Bahasa Indonesia
$nama_bulan = [
    1 => "Januari", "Februari", "Maret", "April", "Mei", "Juni",
    "Juli", "Agustus", "September", "Oktober", "November", "Desember"
];

// variabel untuk nama tempat
$nama_tempat = "Padang"; // Ganti dengan nama tempat yang diinginkan

// variabel untuk tanggal dan Waktu Indonesia
date_default_timezone_set("Asia/Jakarta"); // Set zona waktu ke Waktu Indonesia Barat
$tanggal = date("j");
$bulan = $nama_bulan[date("n")];
$tahun = date("Y");
$jam = date("H");
$menit = date("i");
$detik = date("s");

// Gabungkan variabel dan tampilkan data
echo "Tugas Ini dibuat oleh Afriadi ikhwan pada Bulan $bulan Tanggal $tanggal Tahun $tahun di Kota $nama_tempat pada Jam $jam:$menit:$detik";
?>