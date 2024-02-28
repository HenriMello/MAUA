RA = float(input("Digite sua renda anual: "))

if RA >= 30000:
    EF = int(input("A quantos anos você trabalha? "))
    if EF >= 2:
        print("Qualificado para empréstimo")
    else:
        print("Empréstimo negado")
        print("Motivo: Empregado a menos de 2 anos")
else:
    print("Empréstimo Negado")
    print("Motivo: Renda anual menor que R$30.000")
