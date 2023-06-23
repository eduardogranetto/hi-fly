package io.test.hifly

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.lang.System.getenv


@RestController
class RootController {

    @GetMapping("/")
    fun root() = Mono.just(
            mapOf(
                    "code" to "hi",
                    "hiVar" to getEnv("HI_VAR"),
                    "versionSha" to getEnv("VERSION_SHA")
            )
    )

    private fun getEnv(name: String) : String = getenv(name) ?: "UNKNOWN"
}


