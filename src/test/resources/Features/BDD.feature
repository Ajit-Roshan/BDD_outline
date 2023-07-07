Feature: 
   basic search

  #	Background:
  #	Given backgroung running given
  
  @data_driven
  Scenario Outline: data driven test
    Given we open the link
    When data entered  <login> and <passcrad>
    And hit enter
    Then for valid login Crad we get logged in

    Examples: 
      |login|passcrad|
      |"ajit"|"ajit123"|
      |"roshan"|"roshan123"|
      |"soy"|"soy123"|

  @search
  Scenario: 
    google search

    Given user on search page
    And enter the search data
    When user hit enter
    Then user is redirect to search result page

  @demo_login
  Scenario: 
    demo login test

    Given user on demo login page
    And enter the user id and password
    When user click on login
    Then user shuld get loggedIN

  @orange_hrm
  Scenario: 
    orange HRM

    Given user should be on ornage hrm home page
    When user input ligin ID and Password
    And click on ligin
    Then user should be login page
