Feature: Login inside testproject site

  Scenario Outline: The new user wants to log into testproject site
    Given The new user access to testproject
    When user insertar <username> and <password>
    Then the user get access to testproject
    And the new user are able to use the site

    Examples: 
      | username | password |
      | jaick    |    12345 |
      | enrique  |    12345 |
      | tim  		 |    12345 |