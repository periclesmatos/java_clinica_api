# Clinica API

Este projeto consiste em uma API de gerenciamento de médicos, pacientes e consultas, desenvolvida em Java com o framework Spring Boot. A aplicação é projetada para ser escalável e robusta, utilizando o MySQL como banco de dados relacional para armazenamento eficiente e consultas rápidas.

Para gerenciamento de dependências, o Maven é utilizado, permitindo uma configuração modular e facilitando o processo de build. O Flyway é integrado para realizar o versionamento do banco de dados, garantindo que as alterações de esquema sejam gerenciadas de forma consistente e segura ao longo do ciclo de vida da aplicação.

A biblioteca Lombok é utilizada para simplificar o desenvolvimento, reduzindo a quantidade de código boilerplate através da geração automática de métodos como getters, setters e construtores. Além disso, o projeto implementa mecanismos de autenticação e autorização, utilizando JWT (JSON Web Tokens) para proteger endpoints sensíveis e garantir que apenas usuários autorizados possam acessar determinadas funcionalidades.

Com essa arquitetura, a API não só atende às necessidades de gerenciamento de dados, mas também assegura a integridade e a segurança das informações dos usuários.

## Funcionalidades
- Cadastra, listar, atualizar e deletar medicos.
- Cadastra, listar, atualizar e deletar pacientes.
- Agendar e cancelar consultas.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Maven
- Lombok
- Flyway
- MySQL

## Autor

Desenvolvido por [Pericles Matos](https://www.linkedin.com/in/periclesm/).
