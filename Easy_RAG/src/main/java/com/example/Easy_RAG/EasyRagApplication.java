package com.example.Easy_RAG;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.FileSystemDocumentLoader;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingStoreIngestor;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;
import java.util.List;

@SpringBootApplication
public class EasyRagApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyRagApplication.class, args);
	}




}
