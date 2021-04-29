# Loops

## for Loops 

A `for` loop is used when we know how many times we want a section of code repeated. 

Let's examine the following code: 

```kotlin 
var list = listOf["Hello", "Example", "Test"]

for (i in 0..list.size){
    println(list[i])
}
/* Prints: 
Hello
Example
Test 
*/
```

- `for` is a keyword used to declare a for loop.
- We define `i` as the loop variable. This variable holds the current iteration value and can be used within the loop body.
- The `in` keyword is between the variable definition and the iterator.
- The range `0..list.size` is the for loop iterator.

An `iterator` is an object that allows us to step through and access every individual element in a collection of values. 

**Note:** It is important to note that the loop variable only exists within the loop’s code block. 
Trying to access the loop variable outside the `for` loop will result in an error.