@googlesearch 
Feature: Test google India search list 
Background: 
Given I can access google India  
@googlestatic
Scenario: Display search list based on entered text
Given I enter Selenium Turotial in search textbox
When I click google search
Then Google search results should be displayed
And I enter "somevalue" in search textbox in static
@googledatadriven
Scenario Outline: Display search list based on data drvien text
Given I enter <searchvalue> in search textbox
When I click google search
Then Google search results should be displayed


Examples: 
| searchvalue |  
| 'Car models' |    
| 'US news' |    
    