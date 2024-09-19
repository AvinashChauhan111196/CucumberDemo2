Feature: radio check


  Scenario: click radio checkbox
  
    Given User is on "<URL>" selenium easy page
    When User click radio checkbox
    Then User is able to click check value button  
    
    Examples:
    
    | URL |
    | http://demo.seleniumeasy.com/basic-radiobutton-demo.html |  