Feature: Sign-in function .
 Automation the sign-in functionality .
 
 @Adhoc
  Scenario Outline: Verify user loggedin after entering valid credentials
    Given I am on facebook sign-in page
    When I entered username "<name>" into field
    And I entered password "<psword>" into field 
    And I clickedd on sign-in button
    Then User logged-in successfully
    Examples:
    
    |name  |  psword|
    |Saleem| Siver  |
    |Khuram| diamond|
    |Khan  | glod   |
   
     @Regrassion
    Scenario Outline: Verify user loggedin after entering valid credentials
    Given I am on facebook sign-in page
    When I entered username "<name>" into field
    And I entered password "<psword>" into field 
    And I clickedd on sign-in button
    Then User logged-in successfully
    Examples:
    
    |name  |  psword|
    |Saleem| Siver  |
    |Khuram| diamond|
    |Khan  | glod   |
    
    
 