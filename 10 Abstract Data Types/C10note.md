## Abstract Data Types

### Access control(Java):
- Any code within the curly braces of a defined class body can touch the class’s private fields and methods. Even it is another instance of the class.
- it is OK if no `this` is used (while in Python, `self` is required)
- a class with no explicitly-declared constructors gets an automatic public constructor that takes no arguments

### What abstraction means
- **Abstraction**: Omitting or hiding low-level details with a simpler, higher-level idea.
- **Modularity**: Dividing a system into components or modules, each of which can be designed, implemented, tested, reasoned about, and reused separately from the rest of the system.
- **Encapsulation**: Building a wall around a module so that the module is responsible for its own internal behavior, and bugs in other parts of the system can't damage its integrity.
- **Information hiding**: Hiding details of a module's implementation from the rest of the system, so that those details can be changed later without changing the rest of the system.
- **Separation of Concerns**: Making a feature the responsiblity of a single module, rather than spreading it across multiple modules.

Previous examples:
- Abstraction: A spec is an abstraction in that the client only has to understand its preconditions and postconditions to use it, not the full internal behavior of the implementation.
- Modularity: Unit testing and specs help make methods into modules.
- Encapsulation: The local variables of a method are encapsulated, since only the method itself can use or modify them. Contrast with global variables, which are quite the opposite, or local variables pointing to mutable objects that have aliases, which also threaten encapsulation.
- Information hiding: A spec uses information-hiding to leave the implementer some freedom in how the method is implemented.
- Separation of concerns: A good method spec is coherent, meaning it is responsible for just one concern.

**The key idea of data abstraction is that a type is characterized by the operations you can perform on it**

### Classifying types and operations
- **Creators** take values of other types as input and create new objects of the type. E.g constructor for creating a `ArrayList` use other types
- **Producers** create new objects of the type from one or multi existing objects of the type. E.g. concatenation of `string`
- **Observers** take objects of the abstract type and return objects of different types. E.g. `size` method of `List`
- **Mutators** change objects. E.g. `add` method of `List`

A **creator** implemented as a static method is often called a factory method.

#### An abstract type is defined by its operations
![abstract data type](http://web.mit.edu/6.031/www/sp20/classes/10-abstract-data-types/figures/adt-firewall.svg)


### Designing an abstract type
- It's better to have a few, simple operations
- have coherent behavior
- operatoins should be adequate
- shouldn't mix generic and domain-specific features

### Representation independence
 a good abstract data type should be **representation independent**. This means that the use of an abstract type is independent of its representation. That's why use `getter` and `setter` instead of accessing fields directly, which prevent the dependency on representation.

Abstract data type(ADT)
 - **Specification** of ADT: Javadoc comment, name of the class, public methods and fields.
 - **Representation** of ADT: Private fields and any assumptions or requirements about those fields.
 - **Implementation** of ADT: Method implementations that manipulate its representation.