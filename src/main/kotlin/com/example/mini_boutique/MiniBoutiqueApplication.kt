package com.example.mini_boutique

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MiniBoutiqueApplication

fun main(args: Array<String>) {
    val runApplication = runApplication<MiniBoutiqueApplication>(*args)
}
