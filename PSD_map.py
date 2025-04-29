#program untuk menghitung nilai berdasarkan jumlah benar (max-score = 100)
jumlahBenar = [30, 25, 27, 20, 18, 24, 29]

def nilai (x):
    return (x/3)*10

nilaiAkhir = map(nilai, jumlahBenar)
listNilai = list(nilaiAkhir)
print(listNilai)

#program untuk mengecek data pasien
import pandas as pd
dataPasien = [("Andy", 36.5), ("Ben", 37.8), ("Cindy", 39.0), ("Dean", 36.8)]

def cekSuhu(pasien):
    nama, suhu = pasien
    if suhu < 37.5:
        status = "Boleh Pulang"
        print(nama, status)
    else:
        status = "Dirawat"
        print(nama, status)
    return(nama, suhu, status)

hasil = list(map(cekSuhu, dataPasien))

df = pd.DataFrame(hasil, columns=["Nama", "Suhu Tubuh", "Status"])
print(df)