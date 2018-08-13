Feature: Free CRM creats contacts

  Scenario Outline: Free CRM creats new contacts scenario
    Given user is already in  login page
    When title of login page is Free CRM
    Then user enters "<username>" and "<password>"
    Then user clicks on login button
    Then user is on home page
    Then user moves to new contact page
    Then user enter contact details "<firstName>" and "<lastName>" and "<position>"
    Then close the browser

    Examples: 
      | username | password | firstName | lastName | position |
      | naveenk  | test@123 | Tom       | peter    | Manager  |
#      | naveenk  | test@123 | David     | Dsouza   | Director |
