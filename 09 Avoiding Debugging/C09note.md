## Avoiding Debugging

### First defense: make bugs impossible
static checking, dynamic checking and immutability

### Second defense: localize bugs
fail fast: the earlier a problem is observed (the closer to its cause), the easier it is to fix.
defensive programming: e.g. check pre-conditions

### Assertions
Assertions have the added benefit of documenting an assumption about the state of the program at that point. To somebody reading your code, `assert x >= 0` says “at this point, it should always be true that x >= 0.” Unlike a comment, however, an assertion is executable code that enforces the assumption at runtime.

#### What to assert
- Method argument requirements
- Method return value requirements -> `self check`

#### What not to assert
- Runtime assertions are not free, use it judiciously
- Never use assertions to test conditions that are external to your program. External failures are not bugs
- Don't do operations in assertion statement. Since assert may be turned off.

### Modularity & Encapsulation
- **Modularity** means dividing up a system into components, or modules, each of which can be designed, implemented, tested, reasoned about, and reused separately from the rest of the system.
- **Encapsulation** means building walls around a module so that the module is responsible for its own internal behavior, and bugs in other parts of the system can’t damage its integrity.

Access control: `private` `public`

Minimizing the scope of variables:
- Always declare a loop variable in the for-loop initializer
- Declare a variable only when you first need it, and in the innermost curly-brace block that you can.
- Avoid global variables.