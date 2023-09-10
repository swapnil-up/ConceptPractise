data class Item(val id: Int, val name: String)

fun main() {
    // Problem 1: Using forEach with Lists
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach {
        // Your code here (print each element)
        println(it)
    }

    // Problem 2: Modifying Elements with forEach
    val names = mutableListOf("Alice", "Bob", "Charlie")
    names.forEachIndexed { index, name ->
        // Your code here (modify each name)
        names[index]="Hello"+names[index]
    }
    println(names)

    // Problem 3: Custom Operation with forEach
    val numbers2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var sumOfEven = 0
    numbers2.forEach {
        // Your code here (calculate the sum of even numbers)
        if (it%2==0)sumOfEven+=it
    }
    println(sumOfEven)

    // Problem 1: Filtering Elements with forEach
    val words = listOf("apple", "banana", "cherry", "date", "fig")
    words.forEach {
        // Your code here (print words containing 'a')
        if (it.contains('a')) println(it)
    }

    // Problem 2: Mapping Elements with forEach
    val numbers3 = listOf(1, 2, 3, 4, 5)
    val squaredNumbers = mutableListOf<Int>()
    numbers3.forEach {
        // Your code here (square each element and add to squaredNumbers)
        squaredNumbers.add(it*it)
    }
    println(squaredNumbers)

    // Problem 3: Combining forEach with Conditionals
    val words2 = listOf("apple", "banana", "cherry", "date", "fig")
    var longestWord = ""
    words2.forEach {
        // Your code here (find and store the longest word)
        if (it.length>longestWord.length) longestWord=it
    }
    println("Longest word: $longestWord")

    // Problem 4: forEach in Android Development
    val itemList = listOf(
        Item(1, "Item 1"),
        Item(2, "Item 2"),
        Item(3, "Item 3"),
        Item(4, "Item 4")
    )
    fun addItemToRecyclerView(item: Item) {
        // Simulate adding item to RecyclerView
        // Your code here (add the item to RecyclerView)
        println(item)
    }
    itemList.forEach {
        // Your code here (use forEach to add items to RecyclerView)
        addItemToRecyclerView(it)
    }
}
