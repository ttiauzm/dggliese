# Hash Table untuk menyimpan username dan password
user_table = {}

# Fungsi registrasi pengguna baru
def register(username, password):
    if username in user_table:
        print("Username sudah terdaftar!")
    else:
        user_table[username] = hash(password)
        print("Registrasi berhasil!")

# Fungsi login
def login(username, password):
    if username in user_table and user_table[username] == hash(password):
        print("Login berhasil. Selamat datang,", username)
    else:
        print("Login gagal. Username atau password salah.")

while True:
    print("\n=== Menu ===")
    print("1. Daftar")
    print("2. Login")
    print("3. Keluar")
    pilihan = input("Pilih opsi (1/2/3): ")

    if pilihan == "1":
        uname = input("Masukkan username: ")
        pw = input("Masukkan password: ")
        register(uname, pw)
    elif pilihan == "2":
        uname = input("Masukkan username: ")
        pw = input("Masukkan password: ")
        login(uname, pw)
    elif pilihan == "3":
        print("Terima kasih!")
        break
    else:
        print("Pilihan tidak valid.")
