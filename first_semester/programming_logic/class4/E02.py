i = 1 
cod = 1234 
senha = 9999


while i == 1:
    user = int(input("Digite o código de usario: "))
    if  user != cod:
        print("Código Incorreto!")
    else:
        password = int(input("Digite a senha do usuário: "))
        if password != senha:
            print("Senha Incorreta!")
        else:
            print("Acesso Permitido")
            i = 0