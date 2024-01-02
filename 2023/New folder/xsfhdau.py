def maxMEX(arr):
    K = 2
    N = len(arr)
    s = set()

    for i in range(1, N + 2):
        s.add(i)

    for i in range(K):
        s.remove(arr[i])

    mex = list(s)[0]

    for i in range(K, N):
        s.remove(arr[i])

        s.add(arr[i - K])

        firstElem = list(s)[0]

        mex = max(mex, firstElem)

    return mex


# Driver code
if __name__ == '__main__':

    # Given array
    arr = [1, 2]

    # Size of the array
    N = len(arr)

    # Given length of subarray
    K = 2

    # Function Call
    print(maxMEX(arr))

# This code is contributed by Shivam Singh
