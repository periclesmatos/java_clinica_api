# 🏥 Clínica API - Backend em Java com Spring Boot

Este projeto é uma **API RESTful** para gestão de uma clínica médica, desenvolvida com **Java + Spring Boot**. O sistema permite o cadastro, atualização, listagem e exclusão de pacientes, médicos e agendamentos, utilizando arquitetura limpa e boas práticas do ecossistema Spring.


## 🚀 Tecnologias e ferramentas utilizadas

### 🔧 Backend
- **Java 17**
- **Spring Boot 3 (REST, Validation, Data JPA)**
- **Hibernate / JPA**
- **Flyway (migrations de banco de dados)**

### 🧪 Testes
- JUnit 5
- Mockito

### 🛢️ Banco de dados
- PostgreSQL (produção)
- H2 (testes)

### 📦 Outros
- Swagger/OpenAPI (documentação da API)
- Docker (configuração opcional de ambiente)
- Lombok
- MapStruct (mapeamento DTOs)


## 📚 Funcionalidades principais

- [x] Cadastro de pacientes
- [x] Cadastro de médicos
- [x] Agendamento de consultas
- [x] Cancelamento de consultas
- [x] Validação de disponibilidade de médicos
- [x] Integração com banco de dados via JPA
- [x] Documentação Swagger em `/swagger-ui.html`
- [x] Versionamento de banco com Flyway


## ▶️ Como executar localmente

### Pré-requisitos:
- Java 17+
- Maven
- PostgreSQL (ou utilize H2 para testes)

### Passos:
```bash
# Clone o projeto
git clone https://github.com/periclesmatos/clinica-api-java

# Acesse a pasta do projeto
cd clinica-api-java

# Rode a aplicação
./mvnw spring-boot:run
```

> A aplicação estará disponível em: `http://localhost:8080`


## 🧪 Executar os testes

```bash
./mvnw test
```


## 🔎 Swagger / Documentação da API

Após rodar o projeto, acesse:

> [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)


## 🗂️ Estrutura do projeto

```
src
├── main
│   ├── java
│   │   └── med.voll.api
│   │       ├── controller
│   │       ├── domain
│   │       └── infra
│   └── resources
│       └── application.properties
├── test
│   └── ...
```


## 📌 Possíveis melhorias futuras

- [ ] Autenticação JWT
- [ ] Upload de exames/arquivos
- [ ] Dashboard de atendimentos
- [ ] Integração com serviços externos (ex: envio de email, WhatsApp)


## 👨‍💻 Desenvolvido por

**Péricles Matos**  
🔗 [LinkedIn](https://www.linkedin.com/in/pericles-matos)  
🐙 [GitHub](https://github.com/periclesmatos)


## ⭐ Quer contribuir?

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

