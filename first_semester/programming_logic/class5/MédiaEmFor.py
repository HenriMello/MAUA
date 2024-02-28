# condições iniciais

pesos = [0.3, 0.3, 0.2, 0.2]
notas = []

# notas de prova

for contador in range(2):
    nota_ok = False
    while not nota_ok:
        nota = float(input(f"Digite a nota P{contador + 1}: "))
        if (0 <= nota <= 10):
           notas.append(nota)
           nota_ok = True
        else:
            print("ERRO : Notas de prova entre 0 e 10")
        
print(notas)