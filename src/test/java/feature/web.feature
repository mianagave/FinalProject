Feature:Test Automation WEB On https://www.demoblaze.com/

  @web
  Scenario: Register with new username and password
    Given the user is in the main view
    And user clicks the sign up button
    And user enters username "Mian Agave"
    And  user enters  password "one"
    When user click the sign up button
    Then user will receive a notification "Sign up successful."


  @web
  Scenario: Login with a valid registered account
    Given the user is in the main view
    And user clicks the sign in button
    And user enters username "Mian Agave" on login page
    And  user enters password "one" on login page
    When user click the login button
    Then the user will be redirected to his account


  @web
  Scenario: Login with a invalid registered account
    Given the user is in the main view
    And user clicks the sign in button
    And user enters username "Mian Agave" on login page
    And  user enters password "1" on login page
    When user click the login button
    Then user fails to log in and a notification appears "Wrong password"

  @web
  Scenario: user successfully checkout item
    Given the user is in the main view
    Then user selects item category
    Then user select product "Samsung galaxy s6"
    Then user clicks add to cart button
    Then user will receive a notification "Product added."
    When user clicks label cart
    When user click Place order
    Then the user will be directed to fill in the data form
    And user fills in the name "Mian Agave"
    And user fills in the Country  "Indonesia"
    And user fills in the City "Jakarta"
    And user fills in the Credit card "1234567890123456"
    And user fills in the Month "Januari"
    And user fills in the Year "2025"
    Then user click Purchase button
    Then user will receive a notification SuccessfulTick
    And user will receive a message "Thank you for your purchase!"
    And user click OK button
    Then the user is in the main view








