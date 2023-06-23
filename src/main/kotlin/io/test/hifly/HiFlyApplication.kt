package io.test.hifly

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HiFlyApplication

fun main(args: Array<String>) {
	runApplication<HiFlyApplication>(*args)
}
