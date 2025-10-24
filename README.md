# Comparativo de Algoritmos de Ordenação

## Descrição 

Os código foram feitos todos em Java contendo os seguintes algoritmos de ordenação:

- Bubble Sort
- Selection Sort
- Cocktail Sort
- Comb Sort
- Gnome Sort
- Bucket Sort

O objetivo é comparar o desempenho:

- Quantidade de Trocas: número de vezes que dois elementos foram efetivamente trocados.
- Quantidade de Comparações: número de vezes que elementos foram comparados.

## Como rodar:

- Clone o repositório -> Entre no diretório do projeto -> Compile todos os arquivos .java -> Execute o programa principal.

## Funcionamento

analisamos tres tipos de vetores:

- Aleatório – elementos em ordem aleatória
- Ordenado – elementos já ordenados crescentemente
- Decrescente – elementos em ordem inversa



## Resultados Obtidos


### aleatório
BubbleFlag , comparacoes:180 trocas:88
Selection , comparacoes:190 trocas:16
Cocktail , comparacoes:154 trocas:88
Comb , comparacoes:129 trocas:26
Gnome , comparacoes:193 trocas:88
Bucket , comparacoes:11 trocas:7

### ordenado
BubbleFlag , comparacoes:19 trocas:0
Selection , comparacoes:190 trocas:0
Cocktail , comparacoes:19 trocas:0
Comb , comparacoes:110 trocas:0
Gnome , comparacoes:19 trocas:0
Bucket , comparacoes:15 trocas:0

### decrescente
BubbleFlag , comparacoes:190 trocas:190
Selection , comparacoes:190 trocas:10
Cocktail , comparacoes:190 trocas:190
Comb , comparacoes:129 trocas:18
Gnome , comparacoes:380 trocas:190
Bucket , comparacoes:11 trocas:11


## Análise dos Resultados

- Bucket Sort foi o mais eficiente em todos os cenários, devido à sua natureza de distribuição.
- Comb Sort e Cocktail Sort apresentaram bons desempenhos no cenário aleatório.
- BubbleFlag e Gnome Sort foram menos eficientes, especialmente no caso decrescente.
- Selection Sort, embora simples, manteve o número de trocas baixo, mas com muitas comparações.



## Conclusão

Cada algoritmo tem suas vantagens e limitações dependendo do tipo de entrada:

- Para listas pequenas ou quase ordenadas -> BubbleFlag ou Cocktail
- Para listas grandes -> Comb ou Bucket
- Para fins didáticos -> Selection e Gnome, pela clareza na lógica

Esse comparativo demonstra a importância de escolher o algoritmo certo para o contexto certo —
nem sempre o mais simples é o mais eficiente, e nem sempre o mais rápido é o mais previsível.
