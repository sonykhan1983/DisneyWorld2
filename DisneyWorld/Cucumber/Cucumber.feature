Feature: Disney World  functionalaty testting

  Scenario: Login functiionalaty testing
    Given Open Browser
    When go to Disney Home Page
    And I CLick on Sing In or Create Account
    And Put Username "<Username>"
    And Put Password "<Password>"
    And Click on submit button 
    And Click on Ckekcin button
    And Click on Ckeck in date
    And Click on Check out date 
    And Click on -adult button
    And Click on +child Button
    And Click on child Age button
    And select child age 16
    And Click on Resort Hotel button
    And Select Diseny's Beach Club Villas
    And Click onAccessible Rooms button
    And Click on Find Resort
    And Mouse hover on parks&tickets
    And Click on Epcot
    Then It sould Navigate me to the Disney's Beach Club Villas page
         | Username                 |Password |
         | login_practice@yahoo.com |Yahoo007 |