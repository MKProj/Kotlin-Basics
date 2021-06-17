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
### List Operations
The list collection supports various operations in the form of built-in functions that can be performed on its elements.

Some functions perform read and write operations, whereas others perform read-only operations.

The functions that perform read and write operations can only be used on `mutable` lists while read-only operations can be 
performed on both `mutable` and `immutable` lists.

```kotlin 
var programming_languages = mutableListOf("Kotlin", "Java", "C++", "Rust")

if (programming_languages.contains("Python") /*read only*/){
  println("Python is pretty cool")
} else {
  programming_languages.add("Python") //write 
}
```

## Sets 
### Immutable and Mutable Sets 
- An immutable set represents a collection of unique elements in an unordered format whose elements cannot be changed throughout a program.
  - It is declared with the term, `setOf`, followed by a pair of parentheses, `( )` holding unique values.
  - `var origin_factions = setOf("Mythicals", "Sorcerers", "Kindgom")`

- A mutable set represents a collection of ordered elements that possess both read and write functionalities.
  - It is declared with the term, `mutableSetOf`, followed by a pair of parantheses, `( )` holding unique values. 
  - `var mkproj_projects = mutableSetOf("Phaktionz", "Books", "UniConv", "Moka")`

### Accessing Set Elements
Elements in a set can be accessed using the `elementAt()` or `elementAtOrNull()` functions.

- The `elementAt()` function gets appended onto a set name and returns the element at the specified position within the parentheses.

- The `elementAtOrNull()` function is a safer variation of the `elementAt()` function
  - Returns `null` if the position is out of bounds as opposed to throwing an error.

```kotlin 
var example = setOf("Foo", "Bar", "Baz")

println(example.elementAt(1)) // Prints Bar
println(example.elementAt(5)) // Returns an error 
println(example.elementAtOrNull(5)) // Prints null
```

## Maps
### Immutable and Mutable Maps 
- An immutable Map represents a collection of entries that cannot be altered throughout a program.
  - It is declared with the term, `mapOf`, followed by a pair of parentheses. 
    - Within the parentheses, each key should be linked to its corresponding value with the `to` keyword, and each entry should be separated by a comma.
    - `var student_records = mapOf("Johnny" to 95, "Billy  to 65, "Kimmy" to 85)`

- A mutable map represents a collection of entries that possess read and write functionalities. Entries can be added, removed, or updated in a mutable map.
  - A mutable map can be declared with the term, `mutableMapOf`, followed by a pair of parentheses holding key-value pairs.
  - `var prices = mutableMapOf("Gum" to 1.50, "Bananas / kg" to 0.88, "Blueberries" to 3.97)`
 
 ### Retrieving Map Keys and Values
- Keys and values within a map can be retrieved using the `.keys` and `.values` properties.
- The `.keys` property returns a list of key elements, whereas the `.values` property returns a list of value elements.
- To retrieve a single value associated with a key, the shorthand, `[key]`, syntax can be used.

```kotlin 
var albums = mapOf("The Chronics" to "Dr Dre", "The Blueprint" to "Jay Z", "Marshall Mathers LP" to "Eminem")

println(albums.keys)
// Prints ["The Chronics", "The Blueprint", "Marshall Mathers LP"]
println(albums.values)
// Prints ["Dr Dre", "Jay Z", "Eminem" ]
println(albums["The Blueprint"])
// Prints Jay Z
```

### Adding and Removing Map Entries
An entry can be added to a mutable map using the `put()` function. 
Oppositely, an entry can be removed from a mutable map using the `remove()` function.

- The `put()` function accepts a key and a value separated by a comma.

- The `remove()` function accepts a key and removes the entry associated with that key

```kotlin
var albums = mutableMapOf("The Chronics" to "Dr Dre", "The Blueprint" to "Jay Z", "Marshall Mathers LP" to "Eminem")

albums.put("All Eyez On Me", "2Pac")

println(albums)
// Prints {"The Chronics"="Dr Dre", "The Blueprint"="Jay Z", "Marshall Mathers LP"="Eminem", "All Eyez On Me"="2Pac"}

albums.remove("The Chronics")
println(albums)
// Prints {"The Blueprint"="Jay Z", "Marshall Mathers LP"="Eminem", "All Eyez On Me"="2Pac"}

```
