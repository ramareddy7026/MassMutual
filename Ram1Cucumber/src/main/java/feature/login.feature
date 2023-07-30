Feature: Shopping and User Account Functionality

  Scenario: Successful Login with Valid Credentials
    Given User is on the login page
    When User enters valid username and password
    Then User should be logged in successfully

  Scenario: Unsuccessful Login with Invalid Credentials
    Given User is on the login page
    When User enters invalid username and password
    Then User should see an error message
    
  Scenario: Add Items to Shopping Cart
    Given User is logged in
    When User adds items to the shopping cart
    Then Items should be displayed in the cart
  Scenario: Calculate Total Cost in Shopping Cart
    Given User has added items to the shopping cart
    When User checks the total cost
    Then Total cost should be calculated correctly
