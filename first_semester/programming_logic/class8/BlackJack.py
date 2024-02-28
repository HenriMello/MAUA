from random import choice

def criar_baralho():
    valores = [valor + ' de ' for valor in ['Ás','2','3','4','5','6','7','8','9','10','Valete','Dama','Rei']]
    naipes = ['Ouros','Espadas','Copas','Paus']
    cartas = [valor + naipe for naipe in naipes for valor in valores]
    val_carta = [1,2,3,4,5,6,7,8,9,10,10,10,10]
    baralho = dict(zip(cartas, val_carta*4))
    return baralho

print(criar_baralho())
for chave, valor in criar_baralho().items():
    print(chave,valor)

def distribuir_cartas(baralho, num_cartas):
    mao = 0
    for sorteio in range(num_cartas):
        carta = choice(list(baralho.keys()))
        print(carta)
        mao += baralho[carta]
        del baralho[carta]
    return mao

global baralho
baralho = criar_baralho()
while len(baralho) > 0:
    num_cartas = int(input("Quantas cartas quer na mão? "))
    valor_mao = distribuir_cartas(baralho, num_cartas)
    print(f"valor dessa mão = {valor_mao}")
    print(f"Restam {len(baralho)}cartas no deck\n")