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
![decoupling](http://web.mit.edu/6.031/www/sp20/classes/06-specifications/figures/firewall.svg)
![](http://web.mit.edu/6.031/www/sp20/classes/06-specifications/figures/firewall-talk.svg)

### Specification structure
- a **method signature**, giving the name, parameter types, return type, and exceptions thrown
- a **requires clause**, describing additional restrictions on the parameters
- an **effects clause**, describing the return value, exceptions, and other effects of the method

These three parts forms the **precondition** and **postcondition** of the method.

Precondition contains :
- parameter type
- requires clause
  - more restrictions on parameter, like input range

Postcondition contains :
- return type
- effects clause
  - how the return value relates to the input
  - exceptions may thrown
  - whether and how object may mutated

### Specifications in Java
parameters are described by `@param` clauses and results are described by `@return` clauses. You should put the preconditions into `@param` where possible, and postconditions into `@return`

- start of comments is `/**` instead of normal comments, which is `/*`
- `@param` and `@return` do not contain type, since it will be redundant
- `@param` and `@return` are descriptions of requires and effects listed above
  

### Do not allow null references
Primitive types cannot be null
As a general convention null values are disallowed in parameters and return values unless the spec **explicitly** says otherwise

### Include emptiness
Becareful with empty cases, such as empty list, `""`

### Testing and Specifications
Test cases are subset of the preconditions.

### Specifications for mutating methods
Just as null is implicitly disallowed unless stated otherwise, programmers also assume that mutation is **disallowed unless stated** 

### Exception  hierarchy
`Exception` is the base class for all Exceptions including checked and unchecked, but not errors