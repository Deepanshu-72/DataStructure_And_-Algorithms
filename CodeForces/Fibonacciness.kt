import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    repeat(t) {
        val a1 = sc.nextInt()
        val a2 = sc.nextInt()
        val a4 = sc.nextInt()
        val a5 = sc.nextInt()

        val x1 = a1 + a2
        val x2 = a4 - a2
        val x3 = a5 - a4

        val map = mutableMapOf<Int, Int>()

        map[x1] = map.getOrDefault(x1, 0) + 1
        map[x2] = map.getOrDefault(x2, 0) + 1
        map[x3] = map.getOrDefault(x3, 0) + 1

        println(map.values.maxOrNull())
    }
}