Feature: Get highest price
Description: get highest price among six searched products(shoes)
Scenario: find highest price
    Given user navigate to Ajio webpage
    And Click on the Search text box
    When Type the value “Shoes”
    And Click on the Search button
    When get the first six items name,price and discounted price
    Then print name,price and discounted price
    And find highest price among six
    Then print product name with highest price
    

