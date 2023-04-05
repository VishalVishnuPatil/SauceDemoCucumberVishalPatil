Feature: Registration of user

Scenario Outline: User Registered succesfully
    Given   user Login
    And     accept the value <user> and <pass> fill the value
    Then    Verify user is registered
    
Examples:
|user    |pass       |
|ab      |a4b4       |
|abc     |ans        |
|abc     |a555       |
|abc     |5555      |
|abc     |ans555     |