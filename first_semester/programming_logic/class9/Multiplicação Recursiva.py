def func_rec(x,y):
    if x == 0 or y == 0:
        return 0
    else:
        return y + func_rec(x-1, y)