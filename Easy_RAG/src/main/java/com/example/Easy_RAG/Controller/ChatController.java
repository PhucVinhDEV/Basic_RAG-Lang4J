package com.example.Easy_RAG.Controller;

import com.example.Easy_RAG.AssistantService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ChatController {

    private final AssistantService assistantService;

    public ChatController(AssistantService assistantService) {
        this.assistantService = assistantService;
    }

    // Test endpoint đơn giản
    @GetMapping("/test")
    public String test() {
        return assistantService.processMessage("Hello, introduce yourself!");
    }

    // Test với câu hỏi về document
    @GetMapping("/test-document")
    public String testDocument() {
        return assistantService.processMessage("What information do you have from the SQL document?");
    }

    // Test interactive chat
    @PostMapping("/chat")
    public String chat(@RequestBody ChatRequest request) {
        return assistantService.processMessage(request.getMessage());
    }
}
