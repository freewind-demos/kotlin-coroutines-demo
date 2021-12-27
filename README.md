Kotlin Coroutines Demo
======================

"协程"是Kotlin提供的一个语言特性，提供了“非阻塞”的异步操作，但比`Future/Promise`在语法上更清晰

我们先写一个最简单的例子感受一下。

Run `Hello.kt` in your IDE.

### Output

```
app start: 21:06:08
    block start: 21:06:08
    after launch: 21:06:08
        launch start: 21:06:09
        Hello: 21:06:10
        launch end: 21:06:10
    block end: 21:06:11
app end: 21:06:11
```