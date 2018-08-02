package example

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    println("Start: " + now())

    launch {
        delay(1000)
        println("Hello: " + now())
    }

    Thread.sleep(2000)
    println("Stop: " + now())
}

private fun now(): String {
    return SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())
}