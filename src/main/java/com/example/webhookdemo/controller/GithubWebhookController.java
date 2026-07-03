package com.example.webhookdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhooks")
public class GithubWebhookController {

    @PostMapping("/github")
    public ResponseEntity<String> receiveWebhook(
            @RequestBody String payload,
            @RequestHeader("X-GitHub-Event") String event) {

        System.out.println("Event = " + event);

        System.out.println(payload);

        return ResponseEntity.ok("Received");
    }

}
