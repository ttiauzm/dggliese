from collections import deque

antrian = deque()

def tambahCustomerReguler ():
    nama = input("Masukkan nama anda: ")
    antrian.append(nama)
    print(f"{nama} berhasil ditambahkan ke antrean")

def tambahCustomerPrioritas ():
    nama = input("Masukkan nama anda: ")
    antrian.appendleft(nama)
    print(f"{nama} berhasil ditambahkan ke dalam antrean")

def melayani ():
    nama = antrian.popleft()
    if antrian:
        print(f"pesanan atas nama {nama} telah selesai")
    else:
        print("Tidak ada pelanggan dalam antrean")

while True:
    print("\n=== Selamat datang di sistem antrean layanan bank ===")
    print("1. Tambah antrean")
    print("2. Layani pelanggan")
    print("3. Keluar")
    pilihan = int(input("Masukkan pilihan anda: "))

    if pilihan == 1:
        print("\n1. Antrean reguler \n2. Antrean prioritas")
        sub_pil = int(input("Masukkan pilihan anda: "))
        if sub_pil == 1:
            tambahCustomerReguler()
        elif sub_pil == 2:
            tambahCustomerPrioritas()
        else:
            print("Pilihan tidak valid")
    if pilihan == 2:
        melayani()
    elif pilihan == 3:
        print("Terima kasih telah menggunakan sistem ini")
        break
    else:
        print("Pilihan tidak valid")