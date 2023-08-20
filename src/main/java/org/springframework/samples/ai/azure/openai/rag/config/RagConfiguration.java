package org.springframework.samples.ai.azure.openai.rag.config;

import org.springframework.ai.client.AiClient;
import org.springframework.ai.embedding.EmbeddingClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.ai.azure.openai.rag.RagService;

@Configuration
public class RagConfiguration {

    @Bean
    public RagService ragService(AiClient aiClient, EmbeddingClient embeddingClient) {
        return new RagService(aiClient, embeddingClient);
    }

}
