Feature: Search

Scenario Outline: Validate when user enters text in search text field then the search result must be displayed

Given Welcome page is displayed
When user eneter "<Search text>" in search text field
Then Search result must be displayed

Examples:

    |   Search text  |
    |   Books        |
    |   Electrionics |
    |   giftcard     |

