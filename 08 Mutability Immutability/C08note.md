### Mutability
`String t = s` `StringBuilder tb = sb` change `t` won't impact `s` while change `tb` will change `sb`

### Aliasing is what makes mutable types risky
`MutableObject b = a` thus `a` and `b` point to the same object, and modification to `b` will also modify `a`

in Java, if a iterator is modified during iteration, you'll get a `ConcurrentModifictionException`,
this feature is fail-fast feature mentioned previously

### Mutation and contracts
The example shows that return mutable object may result in bugs. Instead, return a immutable version can solve this issure.

### Immutability and performance
- **advantage of a immutable object** An immutable value may be safely shared by many different parts of a program, where a mutable value in the same context would have to be defensively copied over and over, at a cost of both time and space
- **advantage of a mutable object** If a value needs to be edited, in the sense of having many small mutations made to it, then a mutable value may be more efficient, because it doesn’t require the whole value to be copied on every edit.
- **Other case** But even when an immutable value needs to be heavily edited, it may still be possible to design it in a way that exploits sharing in order to reduce copying.
*For example, if you have an immutable string that is a million characters long, editing a single character in the middle of the string seems to require copying all the unchanged characters too. But a clever String implementation might internally share the unchanged regions of characters before and after the edit, so that even though you get a new String object as a result of the edit, it actually occupies very little additional memory space. We will see an example of this kind of implementation in a few classes, when we talk about abstract data types. This kind of internal sharing is only possible because of immutability.*

### Useful immutable types
As the code shows, there is a immutable wrapper for `List`, keep the mutable object in the local scope and provide an immutable public version would be a good way that prevent modification from outside and still have the convenience in local modification 