morango = float(input("Digite a quantida de em Kg de morangos: "))
preco1 = morango * 2.50

maca = float(input("Digite a quantidade em Kg de maçãs "))
preco2 = maca * 1.50

if preco1 == 0:
    print("Nenhum morango comprado")
elif maca > 8 or preco2 > 25:
    desconto2 = preco2 * 0.10
    preco2_final = preco2 - desconto2
    print(f'O desconto nas maçãs foi de R${desconto2}')

if preco2 == 0:
    print("Nenhuma maçã comprada")
elif morango > 8 or preco1 > 25:
    desconto = preco1 * 0.10
    preco1_final = preco1 - desconto
    print(f'O desconto nos morangos foi de R${desconto}')

print(f"O valor dos morangos é de R${preco1_final}")
print(f'O valor das maçãs é de R${preco2_final}')