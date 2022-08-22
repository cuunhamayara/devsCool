# devsCool
Case técnico para o programa de estágio da eCore - Dev's Cool/2022
- Projeto escrito em Java, no Eclipse. 

Inicialmente, na classe "Projeto", o usuário irá interagir com um menu simples, nele existem as opções de:
- opção 1. cadastrar uma pessoa (adicionando nome e idade), 
- opção 2. listá-las por ordem crescente de idade, 
- opção 3. listá-las por ordem alfabética e 
- opção 0. de finalizar o programa.

O usuário digita a opção que quer seguir - o programa só aceita opções numéricas, caso contrário, exibe mensagem de erro.

"Pessoa" é a classe com as características deste objeto - aqui, de acordo com a idade, o programa verifica se esta é uma criança,
adolescente, adulto ou idoso - no método "verificar tipo", que já é chamado no próprio construtor.

"Projeto" é a classe main, onde a aplicação irá rodar. Para cadastrar uma pessoa, o usuário digita o nome e depois idade. O programa
mostra uma mensagem de erro, caso a idade digitada seja menor do que 0 ou maior do que 120. E pede novamente para que o usuário insira uma idade válida.
Também apresenta mensagem de erro caso o usuário digite algum caracter que não seja um número inteiro. Quando nome e idade são inseridos
corretamente, o programa mostra uma mensagem de sucesso no cadastro.

Caso o usuário escolha as opções 2 ou 3 antes de ter cadastrado uma pessoa, o programa exibe mensagem de erro, já que a lista está vazia.

As listas de pessoas contêm nome, idade e tipo.

Ao finalizar (opção 0), o programa exibe uma mensagem informando que finalizou.
