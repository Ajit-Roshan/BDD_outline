Feature: 
   basic

  Scenario: 
    google search

    Given user on search page
    And enter the search data
    When user hit enter
    Then user is redirect to search result page
