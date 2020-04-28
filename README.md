# selenium-test-framework

 practice automation test framework for Amazon.com, based on the knowledge gained as a first year automation engineer at Fitbit-Boston.

Problems: I wasn't able to set up tests to run in parallel. I didn't initially build that into DriverUtils, and haven't been able to figure this part out.

Blog: Adventures in Automation A sample project in order to practice designing automated test frameworks. 
Automate Amazon:
Introduction
Part One: Development Environment Setup
Part Two: Sketch Out a Use Case
Part Three: CommonUtils, methods and exceptions
Part Four: Writing a Sign In Test
Part Five: Product Enums and Product Objects
Part Six: Initializing Login and Cart
Part Seven: Writing a Shopping Cart Test
Part Eight: Data Driven Tests with TestNG XML
The directory structure:
src/test/java

actions
OrderActions
base
LoadProperties
enums
Products
Url
pages
HomePage
SignInPage
ProductPage
ShoppingCartPage
ShoppingCartReviewPage
pojo
Book
properties
user.properties
testcases
PurchaseOrderTest
utils
CommonUtils
DriverUtils
