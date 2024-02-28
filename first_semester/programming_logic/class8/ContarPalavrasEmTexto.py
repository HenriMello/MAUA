def le_arquivo(nome_arq):
    arq = open(nome_arq, 'r', encoding='latin-1')
    texto = arq.read()
    arq.close()
    return texto.lower()


def palavras_no_texto(texto):
    pontuacao = ['.', ',', ':', '!', '?', '(', ')', '-']
    for item in pontuacao:
        texto = texto.replace(item, ' ')
    palavras = texto.split()
    dict_palavras = {}
    for palavra in palavras:
        if not palavra in dict_palavras:
            ocorrencia = palavra.count(palavra)
            dict_palavras[palavra] = ocorrencia
    return dict_palavras


texto = le_arquivo("5parágrafos-1984.txt")
print(palavras_no_texto(texto))
