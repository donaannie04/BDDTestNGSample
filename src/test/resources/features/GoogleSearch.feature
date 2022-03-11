
Feature: Google page search 

Scenario: Jave search
Given User is on Google Page
When User enters Java Tutorial
Then Should display Java result page


Scenario: Selenium search
Given User is on Google Page
When User enters Selenium Tutorial
Then Should display Selenium result page