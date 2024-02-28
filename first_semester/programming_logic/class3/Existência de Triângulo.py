a = int(input("Digite o comprimento a: "))
b = int(input("Digite o comprimento de b: "))
c = int(input("Digite o comprimento de c: "))

if ((b - c) < a < (b + c)) and ((a - c) < b < (a + c)) and ((a - b) < c < (a + b)):
    if a == b == c:
        print("Equilátero")
    elif (a == b) or (a == c) or (b == c):
        print("Isóceles")
    else:
        print("Escaleneo")
else:
    print("Triângulo inexistente")

