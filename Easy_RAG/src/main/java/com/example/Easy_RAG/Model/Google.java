package com.example.Easy_RAG.Model;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.vertexai.VertexAiGeminiChatModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class Google {
    @Value("${spring.google.ai.project-id}")
    private String projectId;

    @Value("${spring.google.ai.location}")
    private String location;

    @Value("${spring.google.ai.model}")
    private String modelName;


    @Bean
    public ChatModel vertexAI() throws IOException {
        return VertexAiGeminiChatModel.builder()
                .project(projectId)
                .location(location)
                .modelName(modelName)
                .build();
    }
}
