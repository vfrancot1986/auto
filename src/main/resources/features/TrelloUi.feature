#language: pt
#encoding: UTF-8
@ui
Funcionalidade: Editar cartao no Trello
  Contexto:
    Dado que eu esteja logado no Trello
    E tenha acesso ao board automationprime
      Esquema do Cenario: "<acao>" cartao no Trello
        Quando clico em "<acao>" um cartao
        Entao o cartao e "<acao>"
        Exemplos:
          |acao		|
          |Adicionar|
          |Editar	|
          |Excluir	|