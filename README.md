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

| Situação | Algoritmo | Comparações | Trocas |
| :--- | :--- | ---: | ---: |
| **Aleatório** | BubbleFlag | 180 | 78 |
| | Selection | 190 | 18 |
| | Cocktail | 154 | 78 |
| | Comb | 129 | 22 |
| | Gnome | 174 | 78 |
| | Bucket | 11 | 4 |
| **Ordenado** | BubbleFlag | 19 | 0 |
| | Selection | 190 | 0 |
| | Cocktail | 19 | 0 |
| | Comb | 110 | 0 |
| | Gnome | 19 | 0 |
| | Bucket | 10 | 0 |
| **Decrescente** | BubbleFlag | 190 | 190 |
| | Selection | 190 | 10 |
| | Cocktail | 190 | 190 |
| | Comb | 129 | 18 |
| | Gnome | 380 | 190 |
| | Bucket | 47 | 47 |



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
