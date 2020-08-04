### Test-first programming
In the order of 
1. **Spec**: Write a specification for the function. E.g. method signatures
2. **Test**: Write tests that exercise the specification. E.g. client of a module
3. **Implement**: Write the implementation.

### Systematic testing
- **Correct**: legal implementation pass all tests
- **Thorough**: find bugs in buggy implementation
- **Small**: all about efficiency
  
 Normally when you’re coding, your goal is to make the program work. But as a test suite designer, you want to make it fail. That’s a subtle but important difference.

### Choosing test cases by partitioning
We want to pick a set of test cases that is **small** enough to be easy to write and maintain and quick to run, yet **thorough** enough to find bugs in the program.

Regard input space as domains, and divide space into **subdomains**.The idea behind subdomains is to divide the input space into sets of similar inputs on which the program has similar behavior. Then we use one representative of each set.

This approach makes the best use of limited testing resources by choosing dissimilar test cases.

#### Boundarie in the partition
The reason causing bugs at **boundaries**:
- **off-by-one mistakes** like writing `<=` instead of `<`
- Some boundaries may need to be handles as special cases. E.g. int overflow from positive to negative

#### Exapmle of multiply of BigIntegers

![Multiplication of BigIntegers](http://web.mit.edu/6.031/www/sp20/classes/03-testing/figures/multiply-partition.png)
