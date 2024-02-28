kg = int(input("Digite seu peso: "))
m = float(input("Digite sua altura: "))

IMC = kg/(m ** 2)

if IMC < 18.5:
    print(IMC)
    print("Abaixo do peso")

elif IMC < 25:
    print(IMC)
    print("Saudável")

elif IMC < 30:
    print(IMC)
    print("Peso em excesso")

elif IMC < 35:
    print(IMC)
    print("Obesidade Grau I")

elif IMC < 40:
    print(IMC)
    print("Obesidade Grau II (Severa)")

elif IMC  >= 40:
    print(IMC)
    print("Obesidade Grau III (Mórbida)")