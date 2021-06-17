# Hello World Kotlin!

To explain this section, we will be going line by line of the different parts of our program: 

```kotlin 
// examples/01-hello.kt
fun main(){
    // Our program is very simple and is aimed to say hello world 
    /* 
    We will run each word of "Hello World Kotlin!" in seperate println 
    so we can show the order of execution. 
    */
    println("Hello")
    println("World")
    println("Kotlin!")
}
```

## Main Function 
You can see at the beginning of our program is `fun main(){}`, the main function is the starting point 
of which the Kotlin Program executes the code. For an executable program, a main function is required for the
Kotlin Program. 

## Comments 
Comments are used for the programmer and not for the actual execution of the program. It is typically used 
to document and jot ideas down on the program, and is ignored by the compiler. There is two different type of 
comments, there is `//` which is a single line comment and `\* */` which is multi-line comments that contains comments 
in between `\*` and `*/`. 

## Print Statements 
A print statement is a way to output values onto the console, and there is two different print statements that exist.  
- `println()` : This will create a new line after outputting 
- `print()` : This will only output **(not create a new line)**

Now let's Compile and Run: 
```bash
# If using this repo, cd examples
$ kotlinc 01-hello.kt -include-runtime -d 01-hello.jar 
$ ls 
01-hello.jar  01-hello.kt
$ java -jar 01-hello.jar 
Hello
World
Kotlin!
```