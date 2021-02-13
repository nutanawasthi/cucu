Feature: Login

Scenario: Successfull Login With Valid Credentials

Given User Launch chrome Browser

When User opens url "http://demo.guru99.com/Agile_Project/Agi_V1/"
And User enters UserID as "1303" and Password as "Guru99"
And clicks on Login
Then Page Title should be "Guru99 Bank Customer HomePage"
When User Click on LogOut Link
Then Page Title should be "Guru99 Bank Home Page"
And Browser should close

Scenario Outline: Login Data Driven
Given User Launch chrome Browser
When User opens url "http://demo.guru99.com/Agile_Project/Agi_V1/"
And User enters UserID as "<UserId>" and Password as "<Password>"
And clicks on Login
Then Page Title should be "Guru99 Bank Customer HomePage"
When User Click on LogOut Link
Then Page Title should be "Guru99 Bank Home Page"
And Browser should close


Examples:
|UserId | Password |
| 1303 | Guru99 |
| 130 3| guru99 |

