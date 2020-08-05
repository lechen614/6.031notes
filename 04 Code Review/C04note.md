## Code Review

### Style Standards
[Google Java Guide](https://google.github.io/styleguide/javaguide.html)

### Don't repeat yourself (DRY)
if the code is repeat, error may also repeat
propriate abstraction, code reuse

### Comments where neede
one kind of comment is spec
use `@param` and `@return` for methods

comment the source of the code if needed. E.g. from stackoverflow

### fail faster
validate input

### Avoid magic numbers
[Magic numbers](https://en.wikipedia.org/wiki/Magic_number_(programming))
- A number is less readable than a name.
- Constants may need to change in the future.
- Constants may be dependent on other constants.

Use named constant instead of magic numbers.
If you have a profusion of magic numbers in your code, it can be a sign that you need to take a step back and treat those numbers as **data** rather than named constants.