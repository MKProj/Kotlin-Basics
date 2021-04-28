# Conditional Expressions

## If Statements 
An `if` statement is used to execute a section of code if an expression results to `true`. A great way to look at this is an example: 

```kotlin 
var a = 5

if (a == 5) {
    println("True!")
}
```
Since `a` is indeed equal to 5, then the program will execute `println("True!")`, however, let's say we had, 

```kotlin
var a = 5

if (a == 6) {
    println("True!")
}
```

Since `a` doesn't equal to 6, the expression results to `false`, so the program doesn't print anything. 

## Else Statements
An `else` statement is used to execute a section of code if an expression results to `false`. Let's fix our previous example 
a bit to include an `else` statement:  

```kotlin
var a = 5

if (a == 6) {
    println("True!")
} else {
    println("False!")
}

```
Since `a` doesn't equal to 6, it follows the `else` statement, and executes `println("False!")`.

## Else-If Statements 
An `else-if` expression allows for more conditions to be evaluated within an `if/else` expression.

**Note:** You can use multiple else-if expressions as long as they appear after the if expression and before the else expression.

```kotlin
var num = 8 

if (num > 8){
    println(num)
} else if (num == 8){
    println(num++)
} else {
    println(num--)
}
// Prints 9
```

## Nested Conditionals 
A nested conditional is a conditional statement within another conditional statement. Essentially an `if` statement inside an `if` statement. 

```kotlin
var foo = true 
var bar = true 

if (foo){
    println("FOO!")
    if (bar){
        println("BAR!")
    }
} else {
    println("No Foo or Bar for you")
}
/* 
Prints: 
FOO!
BAR!
*/
```

## When Statements 
After a while you may get sick of a huge tree of `else if` statements, so any better option? The `when` statement is useful to 
execute code depending on the value of the expression. 

```kotlin
var grade = "F"

when (grade){
    "A" -> println("Excellent")
    "B" -> println("Okay")
    "C" -> println("Bad")
    "D" -> println("Terrible")
    else -> println("FAIL")
}
// Prints FAIL
```