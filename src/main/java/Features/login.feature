Feature: Flipcart search Feature
#without example
#Scenario: Search iphone
#Given user is already on search page
#When user title of page is Flipcart
#Then user enters iphoneName
#And user clicks on price button


#with example
Scenario Outline: Search iphone
Given user is already on search page
When user title of page is Flipcart
Then user enters "<iphoneName>"
And user clicks on price button

Examples:
|iphoneName|
|Apple iPhone 6s (Gold, 32 GB)|
|Apple iPhone 7 (Silver, 32 GB)|
|Apple iPhone 7 (Black, 32 GB)|
