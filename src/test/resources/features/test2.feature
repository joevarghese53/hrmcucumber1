Feature: verify user can create new user
  Scenario: verify user can create new user
    Given user open website
    When user login with username "Admin" and password "admin123"
    When user click on admin link
    When user click on add button
    When user fills in user data and save
    Then verify success message is displayed
    When user search with newly created user
    Then verify newly created user displayed in search list
    When user deletes newly created user
    Then verify Success Successfully Deleted message is displayed
