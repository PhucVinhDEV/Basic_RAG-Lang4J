# Basic_RAG-Lang4J

using Easy RAG lib from Langchain4J
Easy RAG
LangChain4j has an "Easy RAG" feature that makes it as easy as possible to get started with RAG. You don't have to learn about embeddings, choose a vector store, find the right embedding model, figure out how to parse and split documents, etc. Just point to your document(s), and LangChain4j will do its magic.

# Easy_RAG 🤖

Ứng dụng RAG (Retrieval-Augmented Generation) đơn giản sử dụng Spring Boot và LangChain4j để tạo chatbot thông minh có khả năng truy xuất thông tin từ tài liệu PDF.

## 🚀 Tech Stack

- **Backend**: Spring Boot 3.5.0, Java 17
- **AI Framework**: LangChain4j
- **AI Model**: Google Vertex AI Gemini 2.0 Flash
- **Document Processing**: PDF document loader
- **Vector Store**: In-memory embedding store
- **Build Tool**: Maven

## ✨ Tính năng

- 📄 **Xử lý tài liệu PDF**: Tự động load và phân tích tài liệu PDF
- 🧠 **RAG Pipeline**: Tích hợp retrieval và generation cho câu trả lời chính xác
- 💬 **Chat Memory**: Lưu trữ lịch sử chat (10 tin nhắn gần nhất)
- 🔍 **Semantic Search**: Tìm kiếm thông tin relevant từ tài liệu
- 🌐 **REST API**: Endpoints đơn giản để tương tác

## 📋 Prerequisites

- Java 17+
- Maven 3.6+
- Google Cloud Project với Vertex AI API enabled
- PDF document để test (hiện tại: `De_Thi_SQL_Level1.pdf`)

## 🔧 Google Cloud Setup Chi tiết

### 1. Tạo và Cấu hình Google Cloud Project

- Truy cập [Google Cloud Console](https://console.cloud.google.com/)
- Tạo mới project hoặc chọn project hiện có
- Bật API:
  - Vertex AI API

