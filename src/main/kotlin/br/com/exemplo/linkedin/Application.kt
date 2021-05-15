package br.com.exemplo.linkedin

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.exemplo.linkedin")
		.start()
}

