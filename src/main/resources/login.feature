
Feature: Amazon Login feature


 #without examples keyword
  #Scenario: AmazonLogin Test Scenario

  #  Given  User is alreadey on login page
  #  When title of login page is Cogmento CRM
  # And User enter "khanshabb111@gmail.com" address
  #  And User enter "Agustina2426."
  #  When User clicks on Login  button
  #  Then User is on homepage


 #with examples keyword
  Scenario Outline: AmazonLogin Test Scenario

    Given  User is alreadey on login page
    When title of login page is Cogmento CRM
    And User enter "<Email>" address
    And User enter "<passWord>"
    And  User clicks on Login  button
    And  User is on homepage
    Then close the browser

    Examples:
      | Email                  | passWord     |
      | khanshabb111@gmail.com | Agustina2426. |
      | affan24261@gmail.com   | Agustina2426. |