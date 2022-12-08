fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }


    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))

    ///-------------------- aqui empieza el ejercicio---------
    //variable tamaño
    val tama= input.count(){it.isBlank()} +1

    val listaDeCalorias= MutableList<Int>(tama,{0})
    var grupo=0
    input.forEach{ String
        if (!it.isBlank())
            grupo++
        else
            listaDeCalorias[grupo]=listaDeCalorias[grupo]=+it.toInt()
    }
    println(listaDeCalorias.max())
    println(listaDeCalorias.indexOf(listaDeCalorias.max()))
}
