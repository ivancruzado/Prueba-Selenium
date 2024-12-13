Feature: Probar busqueda Google

Scenario: Busca algo de goolge
    Given navego a Google
    When busco algo
    Then encuentro algo
