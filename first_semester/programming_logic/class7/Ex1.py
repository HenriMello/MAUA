#função gera login
 
def gera_login(nome, sobrenome, ID):
    if len(nome) > 3:
        inicio = nome[:3]
    else:
        inicio = nome
    if len(sobrenome) > 3:
        meio = sobrenome[:3]
    else:
        meio = sobrenome
    if len(ID) > 3:
        fim = ID[-3:]
    else:
        fim = ID
    return inicio + meio + fim

import string

nome, sobrenome = input("Digite seu nome e sobrenome: ").lower().split()
ID = input("Digite seu ID: ")
pontuacao = string.punctuation
minha_tabela = str.maketrans('','',pontuacao)
ID = ID.translate(minha_tabela)
login = gera_login(nome, sobrenome, ID)
print(f'\nSeu login na rede é {login}')

