@amazonsearch
Feature: Test amazon India product search list 
Background: 
Given I can access amazon India
@amazonstatic  
Scenario: Display product list based on selected category and entered text
Given I select Electronics category from category dropdown
And I enter headphones with mic in search textbox
When I click amazon search
Then Amazon search results should be displayed      



