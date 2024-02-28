nome = input("Digite seu nome: ")
ano = int(input("Digite o ano do seu nascimento: "))
idade = 2023 - ano

if idade >= 65: 
    ano_trab = int(input("Digite seu ano de ingresso na empresa: "))
    calc_ano = 2023 - ano_trab
    if calc_ano >= 30:
        print(nome)
        print(f"Tem {idade} anos")
        print(f"Trabalha á {calc_ano} anos")
        print("Requisitos atendidos")
    else:
        print("Requisito não atendido -- Tem menos de 30 anos de empresa")
else:
    print("Requisito não atendido -- Tem menos de 65 anos")
