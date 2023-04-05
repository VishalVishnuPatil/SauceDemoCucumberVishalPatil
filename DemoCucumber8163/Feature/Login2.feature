Feature: Validating the authentic user

  Background:
   Given    open the landing page 
 
  Scenario: ValidUser
    
    When        username as "standard_user" in usernamefield
    And         password as "secret_sauce" in passwordfield
    And         click button
    Then        homepage should appear
    
    Scenario: Invalid User Valid Password
   
    When        username as "standard" in usernamefield
    And         password as "secret_sauce" in passwordfield
    And         click button
    Then        User Should Stay on login Page
    
    Scenario: Invalid User InValid Password
    
    When        username as "standardr" in usernamefield
    And         password as "secret" in passwordfield
    And         click button
    Then        User Should Stay on login Page
    
    Scenario: Valid User Invalid Password 
    
    When        username as "standard_user" in usernamefield
    And         password as "secret" in passwordfield
    And         click button
    Then        User Should Stay on login Page
    