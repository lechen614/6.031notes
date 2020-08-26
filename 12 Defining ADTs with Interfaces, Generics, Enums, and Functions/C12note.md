## Defining ADTs with Interfaces, Generics, Enums and Functions

### Interfaces
An **interface** in Java is a list of methods signatures without method bodies.
A class implements an interface if it declares the interface in its `implements` clause, and provide method bodies for all of the interface's methods.
Define an **ADT** in Java as an interface with its implementation as a class implementing that interface.

#### Pros of interface:
- interface spedifies the contract for the client, the client can't create inadvertent dependencies on the ADT's representation, keeping implementation well and truly separated.
- Multiple different representations of the ADT can coexist in the same program.
- Java's static type checking allows compiler to catch many mistakes in plementing an ADT's contract.

#### About interfaces in Java
Java `interface` contains the spec of an ADT, namely its public method signatures (doc is not required)
An interface do not include information about the rep, so it should not declare instance variables or include instance method bodies(exception introduced in Java 8) 
Because an instance has no rep, Java doesn't allow it to be instantiated with `new`.
E.g. `new` a `List<String>()` is a static error, to make a `List`, need to instantiate a class that provides a rep for it, like `new ArrayList<String>()`
For the same reason, Java interfaces are not allowed to decalre constructors.

### Subtypes
A **subtype** is simply a subset of the **supertype**.
“B is a subtype of A” means “every B is an A.” In terms of specifications: “every B satisfies the specification for A.”

### Why interfaces?
- Documentation for both the compiler and for humans
- Allowing performance trade-offs
- Methods with intentionally underdetermined specifications
- Multiple views of one class
- More and less trustworthy implementations

### Subclassing
Two ways to make a subtype of another type: implementing an interface and subclassing.
Difference in subclassing:
- Subclass inherits the instance methods of its superclass, **including their method bodies**
- inherits the fields of its superclass


Subclass inherits not only the spec of its usperclass, but also its rep:
At first this seems like a great idea. Reusing implementation ought to make our code more DRY, and more ready for change.
Inheriting the rep means:
- rep exposure between the superclass and all its subclasses
- rep dependence between superclass and subclasses
- superclass and subclass can inadvertently break each other’s rep invariants

Designing for safe subclassing means that the superclass must now offer **two contracts**: one for interaction with clients, and one for subclasses. These issues simply do not arise with interface

#### Overriding and dynamic dispatch
`List<String> list = new ArrayList<>(List.of("abc"));`
`Object obj = list;`
either `list.toString()` and `obj.toString()` will display the content in list