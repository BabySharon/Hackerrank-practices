
def sockMerchant(n,ar):
    count = 0

    i = 0
    while i<n :

        for j in range(i+1, len(ar), 1):
            if ar[i] == ar[j] and ar[i]!= -1 and ar[j]!=-1:

                count = count + 1
                ar[i],ar[j]=(-1,-1)
                break

        i=i+1
    print(count)
n = int(input())
ar=[]
ar = [int(i) for i in input().split(" ")]
sockMerchant(n,ar)
