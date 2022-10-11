package no.kristiania.lecture3.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/api/sample")
    fun sampleEndpoint(): ResponseEntity<String> {
        return ResponseEntity.ok("Hey")
    }
}