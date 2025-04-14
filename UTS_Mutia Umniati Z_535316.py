from collections import deque
import queue

Dequeue = deque()
queue = []

def Enqueue():
    Nama = input("Masukkan nama: ")
    NIU = int(input("Masukkan NIU: "))
    if NIU%2 == 1:
        Dequeue.append(Nama)
        Dequeue.append(NIU)
        print(Dequeue)
    elif NIU % 2 == 2:
        queue.append(Nama)
        queue.append(NIU)

# def LinkedList():
class node:
    def __init__(self, data = None):
        self.data = data
        self.next = None

class Linked_list:
    def __init__(self):
        self.head = node()

    def append(nama, NIU):
        new_node = node(nama, NIU)
        cur = self.head
        while cur.next is not None:
            cur = cur.next
        cur.next = new_node

    def display(self):
        elems=[]
        cur_node = self.head
        while cur_node.next is not None:
            cur_node = cur_node.next
            elems.append(cur_node.data)
        for idx, (nama, NIU) in enumerate(elems):
            print(f"{idx+1}. ,Nama: {nama}, NIU: {NIU}")

my_list = Linked_list()

while True:
    print("\n1. Tambah data")
    print("2. Tampilkan data")
    print("3. Keluar")

    pilihan = int(input("Masukkan pilihan anda: "))

    if pilihan == 1:
        Enqueue()
        print("Data mahasiswa berhasil ditambahkan")
    
    elif pilihan == 2:
        my_list.display()

    elif pilihan == 3:
        print("Terima kasih telah menggunakan program ini")
        break

    else:
        print("Pilihan tidak valid")