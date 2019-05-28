package com.datapar.liquidetl.transformation

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class ServletInitializer : SpringBootServletInitializer() {

    @Override
    fun main(args: Array<String>) {
        SpringApplication.run(TransformationApplication::class.java, *args)
    }

}
