Feature: Select Product

Background:

Given login into application

@functional
@sanity
@smoke
  Scenario: Select with Product name
  
      When Click on product with Name as "Sauce Labs Backpack" on product page
      Then product page should open
      And  add it to cart
      And  verify product is added to cart
      
  @sanity    
  Scenario: Click on Multiple Product on the page
      Then click on product and come back
      |id | name of Product        | details  |
      | 1 | Sauce Labs Backpack    | abc      |
      | 2 | Sauce Labs Bike Light  | def      |
      | 3 | Sauce labs             | ppp      |
      | 4 | Sauce labs             | kkk      |
      | 5 | Sauce labs             | sss      |
      | 6 | Sauce labs             | vvv      |
      
 Scenario: Select with Product image  
 
 
 
 Scenario: Select with Product direct visible addtocart
    
