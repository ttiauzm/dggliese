def konversiDollarUS(nominal):
    amount = nominal * 16400
    print(f"Nilai uang anda adalah: Rp {amount}")

def konversiRinggit(nominal):
    amount = nominal * 3800
    print(f"Nilai uang anda adalah: Rp {amount}")

def konversiEuro(nominal):
    amount = nominal * 18600
    print(f"Nilai uang anda adalah: Rp {amount}")

konversi = {
    1: konversiDollarUS,
    2: konversiRinggit,
    3: konversiEuro
}

while True:
    print("\n1. Konversi Dolar US ke Rupiah")
    print("2. Konversi Ringgit Malaysia ke Rupiah")
    print("3. Konversi Euro ke Rupiah")
    print("4. Keluar")
    pilihan = int(input("Pilih jenis konversi (1/2/3): "))
    
    if pilihan in konversi:
        nominal = float(input("Masukkan nilai uang yang akan dikonversi: "))
        konversi[pilihan](nominal)
    elif pilihan == 4:
        break
    else:
        print("Pilihan tidak valid.")