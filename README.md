# Log4j2 Filter Application

Este projeto demonstra como configurar filtros de log no Log4j2 para evitar que consultas SQL sensíveis apareçam nos logs.

## 📌 Funcionalidades

- 🔒 Filtragem de logs com palavras-chave sensíveis (ex: `SELECT`, `DELETE`, `DROP`).
- ⚙️ Integração com Spring Boot.
- 📜 Registro em console e arquivos com Log4j2.
- 🛠️ Configuração via `log4j2.xml`.

## 🚀 Tecnologias Utilizadas

- **Java 17** ☕
- **Spring Boot** 🌱
- **Log4j2** 📜
- **Maven** 📦

## 📄 Como Rodar o Projeto

1️⃣ Clone o repositório:
```sh
git clone https://github.com/LuizC-ai/spring-log4j2-filter.git
cd spring-log4j2-filter


2️⃣ Compile e execute os testes:

mvn clean package

3️⃣ Rode a aplicação:

java -jar target/Log4j2FilterApplication-0.0.1-SNAPSHOT.jar

