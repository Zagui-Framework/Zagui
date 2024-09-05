Feature: Login SauceDemo
  As a user of SauceDemo
  I want to log in to the application with different valid and invalid credentials
  To be able to access my inventory and in turn test the invalid credentials messages

  @Test01
  Scenario Outline: Login with valid credentials
    Given I am on the login page
    When I enter <username> as the username
    And I enter <password> as the password
    And I click on the login button
    Then I should be on the inventory page

    Examples:
      | username      | password     |  |
      | standard_user | secret_sauce |  |

  Scenario Outline: Login with invalid credentials
    Given I am on the login page
    When I enter <username> as the username
    And I enter <password> as the password
    And I click on the login button
    Then I should see an error <message>

    Examples:
      | username        | password       | message                                                                   |  |
      | locked_out_user | secret_sauce   | Epic sadface: Sorry, this user has been locked out.                       |  |
      | incorrect_user  | secret_sauce   | Epic sadface: Username and password do not match any user in this service |  |
      | standard_user   | wrong_password | Epic sadface: Username and password do not match any user in this service |  |




