## Abstraction Functions & Rep Invariants

### Invariants
a good abstract data type is that it **preserves its own invariants**
- use immutable object
- use `final`, only assign some representations in constructor
- Immutable wrappers around mutable data types (in Java, immutability at runtime only, with no compile-time checking)

### AF and RI
**AF**: abstraction function
**RI**: rep (representation) invariant

rep space and abstract space:
AF:from rep space to abstract space
RI: from rep space to boolean
The essential point is that implementing an abstract type means **not only choosing the two spaces** – the abstract value space for the specification and the rep value space for the implementation – **but also deciding which rep values are legal, and how to interpret them as abstract values**.

### Beneficent mutation
rep value is mutable while abstract space is immutable

### Documenting the abstract function and representation invariant
It’s good practice to document the abstraction function and rep invariant in the class, using comments right where the private fields of the rep are declared

### Summary
- An invariant is a property that is always true of an ADT object instance, for the lifetime of the object.
- A good ADT preserves its own invariants. Invariants must be established by creators and producers, and preserved by observers and mutators.
- The rep invariant specifies legal values of the representation, and should be checked at runtime with checkRep().
- The abstraction function maps a concrete representation to the abstract value it represents.
- Representation exposure threatens both representation independence and invariant preservation.
- An invariant should be documented, by comments or even better by assertions like checkRep(), otherwise the invariant is not safe from bugs.