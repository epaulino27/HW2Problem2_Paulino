# HW2Problem2_Paulino
A Java application that demonstrates two design patterns (Observer and Composite) in a store scenerio. The system can make products, categories, sub categories, customers, deals, and deal subscribers. It allows subscribers to be notified of black friday deals. It also allows the display of one or more categories or products.

## Resources Used in Development
- Rounding Decimals (https://stackabuse.com/bytes/rounding-to-two-decimal-places-in-javascript/)
- General ArrayList Documentation (https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

## Design Patterns Implemented
### Observer: 
Used to notify subscribers based on a passed in subscriber list defined in main.
### Composite: 
Used to store products and sub categories inside of categories.

## Features
- Users can make: products, categories, sub-categories, customers
- Users can trigger subscriber notification.

## Requirements
- JDK 8 or higher
- No external libraries

## Installation
1. Download src files and import into your desired directory.
2. Save and run the program to ensure installation was successful.

## Usage
Demo program will play automatically and display the store item list. It also create customers, subscribers, and trigger a notification for Black Friday deals.
  
## Example Output
Product Catalogue: 

Category: Tech
    Product: Phone, Price: $90.0
    Product: Computer, Price: $150.0
Category: Kids Toys
    Product: Yo-Yo, Price: $5.0
Category: Food
Category: Diary
    Product: Milk, Price: $7.0
    Product: Cheese, Price: $3.0
Category: Fruit
    Product: Apples, Price: $8.99

Dear Bruce, there is an exclusive Black Friday Deal on Tech!
Dear Mr. Oswald, there is an exclusive Black Friday Deal on Tech!
Customer 'Jack' is not subscribed to this notification list and has not been notified.

Process finished with exit code 0
