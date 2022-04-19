package com.fhlcrab32

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.fhlcrab32")
		.start()
}

