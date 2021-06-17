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