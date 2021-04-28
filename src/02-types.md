# Data Types

We will begin this section off by disecting this example program that contains most topics that will be discussed: 
```kotlin
fun main(){
    /*
     Our goal is to be able to have variables that 
     calculate various geometric areas
     */ 

    // An immutable variable for the value of pi
    val pi = 3.14159

    var radius = 10.0
    var area = pi * radius // Circle 

    //Since we will be using the area statement a lot
    //it's good to make it a variables 

    var stm = "The area of this "
    var shape = "circle"

    println(stm + shape + " is $area") // String Concetation + Template 

    // Now let's say we want to find the area and volume of a square 
    var length = 56.21

    area = Math.pow(length, 2.00) // Will square the length
    var volume = Math.pow(length, 3.00) // Will cube the length

    // Now to prepare this statement 
    // However I want each beginning letter of each word capatalized 

    shape = "square"
    stm = stm + shape + " is $area" + "\nThe volume of this " + shape + " is $volume"
    println(stm.capitalize())

}
```
## Mutable and Immutable Variables 
Variables are used in a program to store data, and in Kotlin there is two different ways to declare a variable, 
one being `var` which is for mutable variables, and the other `val` being for immutable. Now what is the difference between 
mutable and immutable, well the difference is between being able to be reassigned. A mutable variable is a variable that can be 
reassigned any amount of times in a program, while a immutable cannot be reassigned a value once it is given one.  

You can see this in the program in the use case of `val pi = 3.14159` where we don't want `pi` to ever change. You 
can see a few of our varaibles were reassigned, such as `shape`, `area`, etc.  

A neat thing that you'll notice that Kotlin has unlike Java is type inference, which is going to be talked about next...

## Type Inference 
If you're coming from Java to Kotlin, you must've been being so confused by the no semi colons, or the fact that when you declare a
variable, you don't need to provide a type with it. This is what Kotlin means with type inference, where the Kotlin compiler at 
compiling time can infer what data type each varaible is.  

A nice way to look at Kotlin's type inference is to compare declaring a variable in Kotlin vs Java: 

| Java     | Kotlin |
| ----------- | ----------- |
| ``` double num_double = 67.89; ```      | ``` var num_double = 67.89 ```      |

In Java a data type must be declared explicitly while in Kotlin, the type is implicitly inferred. 

## Strings 
Strings are essentially an array of characters, and in Java is not considered to be a primitive type, 
however, Strings do have useful builtin properties that are good to take advantage of. 

Let's first talk about `String Concetation`, and we have seen it in a few times, and a good example to look at is this:  
```
stm = stm + shape + " is $area" + "\nThe volume of this " + shape + " is $volume"
```

String Concetation is to combine Strings together with the `+` operator, and as you can see, it was useful for formatting 
our statement with the various variables we had with us. 

Next is `String Templates`, which is also used in our example is useful to have variables in a String with `$variable` inside 
the String to cleanly write the strings without needing to concetate a lot.  

In the ending of the program, we use a builtin String function called `.capatilize()` which served our purpose to capatalize 
each word in a String. There is also `.length()` which returns the number of characters in a String. It is a good idea to explore 
the various String properties that Kotlin offers. 

## Character Escape Sequences
Character escape sequences consist of a backslash and character and are used to format text.

- \n Inserts a new line
- \t Inserts a tab
- \r Inserts a carriage return
- \\' Inserts a single quote
- \\" Inserts a double quote
- \\\\ Inserts a backslash
- \\$ Inserts the dollar symbol

## Math 
### Arithmetic Operators 
Kotlin includes the following arithmetic operators: 
- `+` addition
- `-` subtraction 
- `*` multiplication 
- `/` division 
- `%` modulus 

### Order of Operations 
The order of operations for compound arithmetic expressions is as follows:

1. Parentheses
2. Multiplication
3. Division
4. Modulus
5. Addition
6. Subtraction  

When an expression contains operations such as multiplication and division or addition and 
subtraction side by side, the compiler will evaluate the expression in a left to right order.

### Augmented Assignment Operators
An augmented assignment operator includes a single arithmetic and assignment operator used to calculate and reassign a value in one step.

```kotlin 
var sum = 10
var num = 7

sum += num // 10 + 7

```

