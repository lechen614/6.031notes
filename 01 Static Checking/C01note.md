## Static Checking

### Types in Java:
Primitive types:
- int
- long
- boolean
- double
- char
  
Object types:
- String
- BigInteger

Java convention, primitive types are lowercase while object types start with a capital letter

### Static typing
Java is a **Statically-typed languate**. Types are known at complie time

### Primitive types are not true numbers:
- integer division
- integer overflow
- special values in floating-point types like **NaN**, **INT_MAX**, **INT_MIN**

### Arrays and Collections

|  | Indexing | Assugnment | Get length | Comment |
| ----------- | ----------- | ----------- | ----------- | ----------- | 
| Array | array[2] | array[2] = 0 | array.length | Fixed length
| List | list.get(2) | list.set(2, 0) | list.size() | List itself is a interface, ArrayList is the type here, get size is a method call. List can only deal with object types(Generic types), thus List< int > is invalid, must write List< Integer >

### Iterating

`for (int x : list)` 
Similar to for each in C#, works on both array and list.

### Methods
`public`, `private` and `static` meaning

### Mutating values vs. reassigning variables
Java also gives us immutable references: variables that are assigned once and never reassigned. To make a reference unreassignable, declare it with the keyword `final`:

`final int n = 5;`

with `final` the 