package io.test.hifly

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


@RestController
class HomeController {

    @GetMapping("/")
    fun root() = Mono.just(
            mapOf(
                    "code" to "hi"
            )
    )

}
