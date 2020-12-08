// http://prntscr.com/vxlbpx package com.r.pmitacademy

fun main() {
    val a = AImplementation()
    makeSomething(a)
}

class AImplementation : A {
    override fun foo() {
        println("foo")
    }

    override fun doo() {
        println("doo")
    }

    override fun boo() {
        println("boo")
    }
}

fun makeSomething(a: A) {
    //
}

interface A {
    fun foo()
    fun doo()
    fun boo()
}