package com.example.webhookdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhooks")
public class GithubWebhookController {

    @PostMapping("/github")
    public ResponseEntity<String> githubWebhook(
            @RequestBody String payload,
            @RequestHeader("X-GitHub-Event") String event) {

        System.out.println("=========================");
        System.out.println("Webhook received from the Github");
        System.out.println("Event : " + event);
        System.out.println(payload);
        System.out.println("=========================");

        return ResponseEntity.ok("OK");
    }

}
