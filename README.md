NOME E MATRICULA

Manuela Rodrigues Both - 468593
Eduarda de Barros Felicio - 431234


Descrição 

O projeto CineDev consiste no desenvolvimento de um sistema simples, em Java, para gerenciar a ocupação de assentos e a venda de ingressos em uma sala de cinema. O objetivo é criar um sistema funcional que substitua o controle manual atualmente utilizado pela rede de cinemas, reduzindo erros, filas e insatisfação dos clientes.

   
 MANUAL DE FUNCIONAMENTO:

1. Início do Programa

Ao executar o sistema, será exibido o Menu Principal no console.

Todas as ações são escolhidas digitando um número de 1 a 5 e pressionando Enter.

2. Menu Principal


O menu apresenta as seguintes opções:

 MENU PRINCIPAL:
 
1. Mapa de Assentos
2. Comprar Ingresso
3. Cancelar Compra
4. Relatório de Ocupação
5. Sair
Escolha uma opção: 

3. Funcionalidades

  OPÇÃO 1 – Exibir Mapa de Assentos
Mostra toda a sala de cinema, com as fileiras numeradas e os assentos livres/ocupados.

Legenda:

[L] → Livre

[X] → Ocupado

Exemplo de saída:

Assentos:   1  2  3  4  5 ... 20
Fileira  1: [L][L][L][L]...[L]
Fileira  2: [X][L][L][X]...[L]
...
Fileira 10: [L][L][X][L]...[L]

 OPÇÃO 2 – Comprar Ingresso

O sistema pedirá:

Número da fileira (1 a 10).

Número do assento (1 a 20).

Exemplo:

Informe o número da fileira (1 a 10): 3
Informe o número do assento (1 a 20): 5
Ingresso comprado com sucesso!

 Regras:

Se o número da fileira ou do assento for inválido → mensagem de erro.

Se o assento já estiver ocupado → o sistema avisa e não realiza a compra.

 OPÇÃO 3 – Cancelar Compra
O sistema pedirá:

Número da fileira (1 a 10).

Número do assento (1 a 20).

Exemplo:

Informe o número da fileira (1 a 10): 3
Informe o número do assento (1 a 20): 5
Compra cancelada com sucesso.

 Regras:

Se o assento já estiver livre, o sistema avisará:

O assento já está livre.

  OPÇÃO 4 – Exibir Relatório de Ocupação
Mostra um resumo com:

Total de assentos.

Quantos estão ocupados.

Quantos estão livres.

Percentual de ocupação.

Exemplo de saída:


 RELATÓRIO DE OCUPAÇÃO 
Total de assentos: 200
Assentos ocupados: 45
Assentos livres: 155
Percentual de ocupação: 22.50%

  OPÇÃO 5 – Sair
Finaliza o programa e exibe a mensagem:

Saindo do sistema. Obrigado!

4. Regras de uso:

 A sala possui 10 fileiras e 20 assentos por fileira.
  Sempre digite apenas números inteiros válidos.
 Acompanhe o mapa de assentos antes de comprar ou cancelar.
 O sistema pode ser usado quantas vezes for necessário — o menu sempre retorna até que o usuário escolha 5 (Sair).




