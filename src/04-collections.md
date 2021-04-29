# Collections

In Kotlin,  there is various type of collections that exist for different case usages. In this section, we 
will be covering `Lists`, `Sets` and `Maps`. 

## Lists 
### Mutable and Immutable Lists 
- An immutable list represents a group of elements with read-only operations.
  - It can be declared with the term `listOf`, followed by a pair of parentheses containing elements that are separated by commas.
  - Ex. `var fruits = listOf("Apples", "Bananas", "Oranges")`

- A mutable list represents a group of ordered elements with read and write operations.
  - It can be declared with the term, `mutableListOf` followed by a pair of parentheses containing elements that are separated by commas.
  - Ex. `var companies = mutableListOf("Google", "Tesla", "Apple")`

### Acessing Lists Elements
In order to retrieve an element from a list, we can reference its numerical position or index using square bracket notation `[ ]`.  

**Note:** The beginning index of a list starts at `0`.  

### The Size Property
The `size` property returns the size of a collection of the number of elements that exists. 

```kotlin
var grades = listOf("A", "B", "C", "D", "F")
println(grades.size)
// Prints 5
```


