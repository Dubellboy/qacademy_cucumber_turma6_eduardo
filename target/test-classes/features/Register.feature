#language:pt

  @Register
  Funcionalidade:
    Como usuario do site Register
    Eu desejo realizar um cadastro
    Para vaçidar se foi validado com sucesso



    @Test001
    Cenario: validar cadastro com sucesso no site Register
    Dado que eu acesso o site Register
    Quando preencho o campo nome com o valor "Eduardo"
    E preencho o campo sobrenome com o valor "Santos"
    E preencho o campo endereco com o valor "Rua Aurelia de Sousa"
    E preencho o campo email com o valor "eduardo_cns@hotmail.com"
    E preencho o campo telefone com o valor "951218175"
    E clico no genero masculino
    E escolho o Hobbie Movies
    E seleciono a Skill "Javascript"
    E escolho o country
    E seleciono o ano de "1984", o mes "December", e o dia "29"
    E preencho a senha "1234"
    E confirmo a senha "1234"
