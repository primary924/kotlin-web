package my.hyakoo.kotlinweb.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {
    @GetMapping("/home")
    fun home(): String = "hello world!"
}