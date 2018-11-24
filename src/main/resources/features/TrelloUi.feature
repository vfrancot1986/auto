#language: pt
#encoding: UTF-8
@ui
Funcionalidade: Editar cartao no Trello
  Contexto:
    Dado que eu esteja logado no Trello
    E tenha acesso ao board "<quadro>"
    Cenario: "<acao>" cartao no Trello
      Quando clico em <acao> um cartao
      Então o cartao e <acao>
      Exemplos:
        |acao		|quadro			|
        |Adicionar	|automationprime|
        |Editar		|automationprime|
        |Excluir	|automationprime|