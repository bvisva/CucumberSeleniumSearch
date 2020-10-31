@testrun
Feature: Title of your feature
 @testcolorparam
 Scenario: Valid Login
    Given I have launched URL
    And my name is "Balaji"
    And my nationality is India
    And The i have red in pocket
    And I have my favourite javabook
@testdatatableparam    
Scenario: Valid Authors   
Given these are following authors
  | firstName | lastName | famousBook  |
  | Aslak  | aslak  | selenium |
  | Julien | julien | cucumber |
  | Matt   | matt   | appium   |  
  
@testdocstringjsonparam    
Scenario: Valid javadoc json   
Given this is my javadoc below
"""json
{"hello":"world"}
"""
@testdocstringparam    
Scenario: Valid javadoc string   
Given this is my javadoc stringtext below
"""
Some Title, Eh?
===============
Here is the first paragraph of my blog post. Lorem ipsum dolor sit amet,
consectetur adipiscing elit.
""" 
 
 