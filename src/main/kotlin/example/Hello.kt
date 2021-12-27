package example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.text.SimpleDateFormat
import java.util.*

object Hello {
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}

fun main() {
    println("app start: " + now())
    runBlocking {
        println("    block start: " + now())
        launch {
            printHello()
        }
        println("    after launch: " + now())
        delay(2000)
        println("    block end: " + now())
    }
    println("app end: " + now())
}

// Note: modifier `suspend`
private suspend fun printHello() {
    println("        launch start: " + now())
    delay(1000)
    println("        Hello: " + now())
    println("        launch end: " + now())
}

private fun now(): String {
    return SimpleDateFormat("HH:mm:ss").format(Date())
}