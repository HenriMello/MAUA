tempo = int(input("Digite o a duração do intervalo de tempo em segundos: "))

conv_horas = tempo//3600
conv_min = (tempo%3600)//60
conv_seg = tempo % 60



print("A conversão final é horas minutos segundos")