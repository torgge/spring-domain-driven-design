package com.datapar.liquidetl.transformation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class TransformationApplication

fun main(args: Array<String>) {
	runApplication<TransformationApplication>(*args)
}
