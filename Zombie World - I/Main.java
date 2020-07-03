test = int(input())
while(test != 0):
    check = 0
    n, time = map(int, input().split())
    z = list(map(int, input().strip().split()))[:n]
    player, min = map(int, input().split())
    if time < n: 
        check = check + 1
    else:
        z.sort()
        for i in range(n):
            if player>=z[i]:
                player = player + (player-z[i])
            else:
                check = check + 1
                break
    if (player >= min and check==0): 
        print("YES", end="") 
    else:
        print("NO", end="");
    check = 0
    test = test - 1