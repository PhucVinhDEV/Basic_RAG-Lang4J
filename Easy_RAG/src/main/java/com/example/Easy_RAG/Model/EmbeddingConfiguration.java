package com.example.Easy_RAG.Model;

import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.loader.FileSystemDocumentLoader;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.EmbeddingStoreIngestor;
import dev.langchain4j.store.embedding.inmemory.InMemoryEmbeddingStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.List;

@Configuration
public class EmbeddingConfiguration {

    @Bean
    public EmbeddingStore<TextSegment> embeddingStore() {
        InMemoryEmbeddingStore<TextSegment> embeddingStore = new InMemoryEmbeddingStore<>();

        try {
            String projectRoot = System.getProperty("user.dir");
            Path pdfPath = Paths.get(projectRoot, "src", "De_Thi_SQL_Level1.pdf");

            System.out.println("🔍 Looking for PDF at: " + pdfPath.toAbsolutePath());

            if (pdfPath.toFile().exists()) {
                // Sử dụng loadDocument() cho single file, không phải loadDocuments()
                Document document = FileSystemDocumentLoader.loadDocument(pdfPath);
                List<Document> documents = List.of(document);

                EmbeddingStoreIngestor.ingest(documents, embeddingStore);

                System.out.println("✅ Successfully loaded PDF document");
                System.out.println("📄 Document size: " + document.text().length() + " characters");

            } else {
                System.err.println("❌ File not found at: " + pdfPath.toAbsolutePath());
            }

        } catch (Exception e) {
            System.err.println("💥 Error loading document: " + e.getMessage());
            e.printStackTrace();
        }
        return embeddingStore;
    }
}
