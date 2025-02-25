# #bubble sort
# def bubblesort(A):
#     count = 0  
#     n = len(A)  
#     for i in range(n):
#         for j in range(n - 1 - i):
#             if A[j] > A[j + 1]:
#                 A[j], A[j + 1] = A[j + 1], A[j]
#             count += 1 
#     return A, count

# N = int(input("Masukkan panjang data: "))
# A = list(map(int, input("Masukkan data: ").split())) 
# sorted_A, iterasi = bubblesort(A)
# print(" ".join(map(str, sorted_A)))

# #insertion sort
# def insertionsort(s):
#     n = len(s)
#     for i in range (1, n):
#         x = s[i]
#         j = i-1
#         while j>= 0 and s[j] > x:
#             s[j+1] = s[j]
#             j -= 1
#         s[j+1] = x
#     print(" ".join(map(str, s)))

# n = int(input("Masukkan panjang data: "))
# s = list(map(int, input("Masukkan data: ").split()))
# insertionsort(s)

#selection sort
def selectionsort(S):
    n = len(S)
    for i in range (n-1):
        smallest = i
        for j in range(i+1,n):
            if S[j]<S[smallest]:
                smallest= j
        S[i], S[smallest] = S[smallest], S[i]
    print(" ".join(map(str, S)))

n = int(input("Masukkan panjang data: "))
S = list(map(int, input("Masukkan data: ").split()))
selectionsort(S)