Feature: Realizando cadastro no site

  Scenario: Realizar cadastro no site Centauro
    Given que acesso a Centauro
    And clico no CRIAR UM CONTA
    When preencho os campos do castro
    Then valido as informacoes

    Scenario: Realizar login no site Centauro
      Given que acesso o login da Centauro
      And clico no login
      When coloco "e-mail" e "senha"
      Then e acesso a conta

      Scenario: Realizar compra no site
