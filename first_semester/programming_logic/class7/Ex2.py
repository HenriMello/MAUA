#função valida_senha

def valida_senha(senha):
    minusculo_ok = False
    maisculo_ok = False
    digito_ok = False
    for letra in senha:
        if letra.islower():
            minusculo_ok = any(letra.islower() for letra in senha)
            maisculo_ok = any(letra.isupper() for letra in senha)
            digito_ok = any(letra.isdigit() for letra in senha)
    else:
        return False
    return minusculo_ok and maisculo_ok and digito_ok
senha = input("Digite sua senha: ")
while not valida_senha(senha):
    print("Senha inválida!")
    senha = input("Digite sua senha: ")
print("Senha válida")
