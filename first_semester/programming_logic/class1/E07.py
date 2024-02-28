p1 = float(input("Digite o valor do primeiro produto: "))
p2 = float(input("Digite o valor do segundo produto: "))
p3 = float(input("Digite o valor do terceiro produto: "))

valor = p1 + p2 + p3
print("O valor da compra sem imposto é R$%.2f" %valor)

imposto = valor * 0.07
print("O valor do imposto é R$%.2f" %imposto)

novo_valor = valor - imposto
print("O valor da compra com imposto é R$%.2f" %novo_valor)