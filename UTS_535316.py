from collections import deque

Dequeue = deque()

# def LinkedList():
class node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Linked_list:
    def __init__(self):
        self.head = None

    def append(self, data):
        mahasiswa = node(data)
        if self.head is None:
            self.head = mahasiswa
        else:
            cur = self.head
            while cur.next is not None:
                cur = cur.next
            cur.next = mahasiswa

    def display(self):
        elems = []
        cur_node = self.head
        while cur_node is not None:
            elems.append(cur_node.data)
            cur_node = cur_node.next
        for idx, (nama) in enumerate(elems):
            print(f"{idx+1}. Nama: {nama}")

    def tampilkan_data_ke(self, urutan):
        cur = self.head
        idx = 1
        while cur is not None and idx < urutan:
            cur = cur.next
            idx += 1
        if cur:
            print(f"Data urutan ke-{urutan}: {cur.data}")
        # else:
        #     print(f"Data urutan ke-{urutan} tidak tersedia")    

my_list = Linked_list()

def Enqueue():
    Nama = input("Masukkan nama: ")
    Dequeue.append(Nama)
    my_list.append(Nama)

while True:
    print("\n1. Tambah data")
    print("2. Tampilkan semua data")
    print("3. Tampilkan data urutan tertentu")
    print("4. Keluar")

    pilihan = int(input("Masukkan pilihan anda: "))

    if pilihan == 1:
        Enqueue()
        print("Data mahasiswa berhasil ditambahkan")
    
    elif pilihan == 2:
        my_list.display()

    elif pilihan == 3:
        urutan = int(input("Masukkan urutan yang ingin ditampilkan: "))
        my_list.tampilkan_data_ke(urutan)

    elif pilihan == 4:
        print("Terima kasih telah menggunakan program ini")
        break

    else:
        print("Pilihan tidak valid")