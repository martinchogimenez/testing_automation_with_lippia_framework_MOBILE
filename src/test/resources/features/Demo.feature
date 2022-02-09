Feature: As a potential client i want to interact with the mobile application
  @Demo
  Scenario Outline: The user starts the application and log in to the app
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    Then Home page is displayed


    Examples:
   | email                      | password |
   | martinchogimenez@gmail.com | 123456   |

  @Demo
  Scenario Outline: The user starts the application, log in to the app, and change a button state.
    Given The user logs in the application with: <email>, <password>
    When The user select the navigation drawer
    And The user clicks the Settings option
    And The user clicks the Show notifications button
    Then The Show notifications button changes his state

    Examples:
      | email                      | password |
      | martinchogimenez@gmail.com | 123456   |

  @Demo
  Scenario Outline: The user starts the application, log in to the app, and creates a time entry
    Given The user logs in the application with: <email>, <password>
    When The user select the navigation drawer
    And The user select the Time tracker option
    And The user select the add button
    And The user enter the hours and minutes to add
    And The user select the project
    And The user select SAVE option
    Then The new task is saved.

    Examples:
      | email                      | password |
      | martinchogimenez@gmail.com | 123456   |
