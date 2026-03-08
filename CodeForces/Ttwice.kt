import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    repeat(sc.nextInt()) {
        val n = sc.nextInt()
        val arr = IntArray(n) { sc.nextInt() }

        var count = 0
        val map = mutableMapOf<Int, Int>()

        for (i in arr.indices.reversed()) {
            val x = arr[i]
            val freq = map.getOrDefault(x, 0)

            if (freq > 0) {
                count++
                map[x] = freq - 1
            } else {
                map[x] = freq + 1
            }
        }

        println(count)
    }
}