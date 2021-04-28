# Conditional Operators 
## Comparison Operators
Comparison operators are symbols that are used to compare two values in order to return a result of `true` or `false`.

The comparison operators include the following: 
- `<` less than 
- `>` greater than
- `<=` less than or equal to 
- `>=` greater than or equal to 

```kotlin
var Khloe = 19
var Zane = 18
var Nimu = 20

Khloe > Zane //true 
Zane < Nimu // true 
Khloe >= Nimu // false 
Nimu <= Zane // false
```

## Logic Operators 
Logical operators are symbols used to evaluate the relationship between two or more Boolean expressions in order to return a `true` or `false` value.

The logic operators include the following:
- `!` NOT
- `&&` AND
- `||` OR

### "!" NOT Operator 
The NOT operator evaluates a boolean expression and return it's opposite value `(true -> false)`. 

```kotlin
var exp = true 
println(!exp)
// Prints false 
```

### "&&" AND Operator 
The AND operator only evaluates to `true` if both expressions it's evaluating results to `true`. 

```kotlin
if (4 < 5 && 6 > 3){ //Both expressions are true 
    println("True")
} else {
    println("False")
}
// Prints true 
```

### "||" OR Operator 
The OR operator only evaluates to `true` if one of the expressions result to `true`. 

```kotlin
if (1.2 < 9.8 || 5 > 9){ // One results to true 
    println("True")
} else {
    println("False")
}
//Prints True
```

### Order of Evaluation
The order of evaluation when using multiple logical operators in a single Boolean expression is:

1. Expressions placed in parentheses
2. NOT(`!`) operator
3. AND(`&&`) operator
4. OR(`||`) operator

```kotlin

!true || (true && false) // false

```


### The Range Operator
The range operator (`..`) is used to create a succession of number or character values.

```kotlin 
var grades = 90

when (grades){
    90..101 -> println("A+")
    80..90 ->  println("A")
    .
    .
    .
    else -> println("F")
}
// Prints A+ 
```