def pot_rec(x,y):
    return pot_rec(x, ** y)

x = int(input("Digite o valor da base: "))
y = int(input("Digite o valor da potencia: "))

pot_rec(x,y)