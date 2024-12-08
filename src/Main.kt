fun main() {
    val sum = sum(list = listOf(1, 4, 6, 8))
    println(sum)
}

/**
 * Метод посчета факториала числа рекурсивным способом
 *
 * @param x Входное число для посчета факториала
 */
fun factorial(x: Int): Int {
    return if (x == 1) {
        1
    } else {
        x * factorial(x - 1)
    }
}

/**
 * Метод подсчета суммы элементов списка рекурсивным способом
 *
 * @param list список элементов для подсчета суммы
 */
fun sum(list: List<Int>): Int {
    if (list.isEmpty()) {
        return 0
    }
    if (list.size == 1) {
        return list[0]
    }
    return list[0] + sum(list.drop(1))
}