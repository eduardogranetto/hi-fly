package io.test.hifly

import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.config.CorsRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer


@Configuration
class CorsConfiguration : WebFluxConfigurer {

    override fun addCorsMappings(corsRegistry: CorsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedOrigins("https://hi-fly-ui.vercel.app")
                .allowedMethods("*")
                .maxAge(3600)
    }

}