## Designing Specifications

### Stronger vs. weaker specs
A specification S2 is stronger than or equal to a specification S1 if and only if
- S2’s precondition is weaker than or equal to S1’s,
- S2’s postcondition is stronger than or equal to S1’s, for the states that satisfy S1’s precondition.

### Designing good specifications
The specification should be coherent
The results of a call should be informative
The specification should be strong enough
The specification should also be weak enough
The specification should use abstract types where possible. E.g. `Set` `List` `Map`