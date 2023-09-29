## **Descrição**
Este software é projetado para processar arquivos no formato CSV. Ele lê um arquivo de entrada CSV, calcula a soma das duas primeiras colunas de cada linha e gera um novo arquivo CSV de saída. O arquivo de saída terá as mesmas linhas do arquivo de entrada, mas com uma coluna adicional contendo a soma calculada para cada linha.

## **Funcionamento**
- ### **Leitura do arquivo de entrada:**
- O software começa lendo o arquivo CSV de entrada especificado pelo usuário.

- ### **Processamento das linhas:**
- Para cada linha do arquivo de entrada, o software realiza o seguinte:
- Lê os valores das duas primeiras colunas.
- Calcula a soma desses valores.
- Adiciona a soma como uma nova coluna ao final da linha

- ### **Geração do arquivo de saída:**
- Após o processamento de todas as linhas, o software cria um novo arquivo CSV de saída.
- O arquivo de saída conterá todas as linhas do arquivo de entrada, agora com uma coluna adicional representando a soma calculada.

## **Classes e componentes**
O software pode ser dividido em três principais componentes:

- ### **Leitura de arquivo CSV:**
- Classe responsável por ler o arquivo CSV de entrada.
- Extrai as linhas e valores das colunas.

- ### **Processador de linhas:**
- Classe que calcula a soma das duas primeiras colunas para cada linha.
- Adiciona a soma como uma coluna adicional.

- ### **Gerador de Arquivo CSV:**
- Classe que cria o novo arquivo CSV de saída.
- Escreve as linhas processadas no arquivo de saída.
