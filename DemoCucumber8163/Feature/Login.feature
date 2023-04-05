Feature: Validating the authentic user
 
    Scenario: Valid User

    Given landing page is open
    When  entered username
    And   entered password
    And   click on button
    Then  home page should appear
    