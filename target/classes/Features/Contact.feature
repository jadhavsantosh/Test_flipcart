Feature: Freecrm create new contact scanrio
Scenario Outline: Search iphone
Given user is already on login page
When title of login page is Free CRM
Then usr enters <username> and <password>
Then user clicks on login Button
Then user is on home page
Then user moves to contact page
Then user  enters <firstname> and <lastname> and <position>
Then close the browser

Examples:

| username|password|firstname|lastname|position|
| naveenk |test@123|Tom      |petter  |manager|
| naveenk |test@123|santosh  |jadhav  |manager|


