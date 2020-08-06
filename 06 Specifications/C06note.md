## Specifications

[Java Tutorial on Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)

Exception definition: An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.

Three kinds of Exceptions:
1. **Checked exceptions**: Ececeptional conditions that a well-written application should anticipate and recover from.
2. **Errors**: Extenal to the application and that the application usually cannot anticipate or recover from.
3. **Runtime exceptions**: Internal to the application, and that the application usually cannot anticipate or recover from.

2 and 3 are both unchecked exceptions

Advantages of Exceptions:
1. Seprating Error-Handling Code form "Regular" Code
2. Propagating Errors Up the Call Stack
3. Grouping and Differentiating Error Types


### Why specifications
- For client: It shields the client from the details of the workings of the module
- For implementer: It shields the implementer from the details of the usage of the module

The specifications result in **decoupling**
[!decoupling](http://web.mit.edu/6.031/www/sp20/classes/06-specifications/figures/firewall.svg)