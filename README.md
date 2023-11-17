**Capstone -- Spring boot + JPA + Security + MVC + Maven**

This service provides a simple solution for customer to order a dream party. Also give admin the ability to extend party types
and hire more chefs. 

This backend service provide 9 apis: 
7 of them covers create and read operation for database
2 of them provides save and fetch parties,
2 of them provides save and fetch chefs,
2 of them can fetch customer either by customer id or email
1 of them can fetch all orders for one customer
remaining 2 apis handling register and login.

This service contains 5 tables, 4 of them related with 4 entities: party
customer, chef, order. another one is used to store customer login info.

To communicate with DB, using spring JPA repository, since it already provides 18 different ways to get data

For the service it using Restful service architecture using JSON to talk between Frontend and back end.

For register: using spring security password encoder. Once get the password from front end it will encode and store the encoded version in the auth table, meanwhile save the customer to customer table

For login: once get the email and password from FE, in service it will get the user by email and compare the encoded password check if it matches

For Fe: it uses Javascript xmlhttprequest to fire get or post request to back end, using jquery to handle password validation util work.
it consist 5 pages right now.

Future: due to time constraint this project is just a POC so far, in future it needs to add more functionality such as validate customer already registered function, admin page, customer account page, maintain login session methodology.