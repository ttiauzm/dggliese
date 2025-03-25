class node:
    def __init__(self, data=None):
        self.data = data
        self.next = None

class linked_list:
    def __init__(self):
        self.head = node()

    def append(self, name, phone, email):
        new_node = node((name, phone, email))
        cur = self.head
        while cur.next is not None:
            cur = cur.next
        cur.next = new_node
        print(f"Kontak dengan nama {name} berhasil ditambahkan!")

    def length(self):
        cur = self.head
        total = 0
        while cur.next is not None:
            cur = cur.next
            total += 1
        return total

    def display(self):
        elems = []
        cur_node = self.head
        while cur_node.next is not None:
            cur_node = cur_node.next
            elems.append(cur_node.data)
        print("Daftar Kontak:")
        for idx, (name, phone, email) in enumerate(elems):
            print(f"{idx+1}. Nama: {name}, Telepon: {phone}, Email: {email}")

    def erase(self, name):
        cur = self.head
        prev = None
        while cur.next is not None:
            prev = cur
            cur = cur.next
            if cur.data[0] == name:
                prev.next = cur.next
                print(f"Kontak dengan nama {name} berhasil dihapus!")
                return
        print(f"Kontak dengan nama {name} tidak ditemukan.")

my_list = linked_list()

while True:
    print("\nMenu:")
    print("1. Tambah kontak baru")
    print("2. Tampilkan daftar kontak")
    print("3. Hapus kontak")
    print("4. Keluar")

    pilihan = input("Masukkan pilihan: ")

    if pilihan == "1":
        x = input("Masukkan nama: ")
        y = input("Masukkan nomor telepon: ")
        z = input("Masukkan alamat email: ")
        my_list.append(x, y, z)

    elif pilihan == "2":
        my_list.display()

    elif pilihan == "3":
        a = input("Masukkan nama kontak yang akan dihapus: ")
        my_list.erase(a)

    elif pilihan == "4":
        print("Keluar dari program")
        break

    else:
        print("Pilihan tidak valid, silakan coba lagi.")
