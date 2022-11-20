Feature: Testing HomePage

Scenario: Check the Customer Service number in header 

Given Access the url "https://www.spartoo.eu/"
When Page loads the page 
Then Maximize the page
And check the customer service "0044 203 318 2709"
