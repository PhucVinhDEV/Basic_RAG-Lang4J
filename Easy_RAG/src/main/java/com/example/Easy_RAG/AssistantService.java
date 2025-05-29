package com.example.Easy_RAG;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.rag.content.retriever.EmbeddingStoreContentRetriever;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.store.embedding.EmbeddingStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssistantService {

    private final Assistant assistant;

    @Autowired
    public AssistantService(ChatModel chatModel, EmbeddingStore embeddingStore) {
        this.assistant = AiServices.builder(Assistant.class)
                .chatModel(chatModel)  // This will be injected from your Google configuration
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .contentRetriever(EmbeddingStoreContentRetriever.from(embeddingStore))
                .build();
    }

    public String processMessage(String userMessage) {
        return assistant.chat(userMessage);
    }
}
