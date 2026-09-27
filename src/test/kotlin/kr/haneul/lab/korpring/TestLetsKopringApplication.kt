package kr.haneul.lab.korpring

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<LetsKopringApplication>().with(TestcontainersConfiguration::class).run(*args)
}
