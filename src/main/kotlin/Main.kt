fun singleFizzbuzzCheck(number: Int): String {
    return if (number % 15 == 0) {
        "FizzBuzz"
    } else if (number % 5 == 0) {
        "Buzz"
    } else if (number % 3 == 0) {
        "Fizz"
    } else {
        number.toString()
    }
}

fun fizzbuzz(number: Int): String {
    // INPUT: number (integer)
    // OUTPUT: String e.g. "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz"
    // Iterate through all the integers from 1 to number
    // Transform each list element according to FizzBuzz rules
    // Join the list with ", " to create string
    // Return the string
    return (1..number).map {
        singleFizzbuzzCheck(it)
    }.joinToString(separator = ", ")

}