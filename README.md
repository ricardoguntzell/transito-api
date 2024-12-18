# Autuação de Trânsito - API

# Sobre o projeto

[API em produção no Railway](https://transito-api-production.up.railway.app "App em produção no Railway")

Autuação de Trânsito é uma aplicação back-end inspirada através do curso Ignição Spring Rest
da [AlgaWorks](https://algaworks.com "Site da AlgaWorks").

A aplicação consiste na exposição de uma API REST,
que possibilita toda a gestão de autuações de trânsito.
Os dados são coletados inicialmente pela própria API.

- Cadastro de Proprietário, Veículo e Autuação
- Listagem de Proprietário, Veículo e Autuação
- Busca de Proprietário, Veículo
- Autuação de Veículo
- Ativação/Inativação de Proprietário

## Modelo de domínio Transito API

<img src="src/main/resources/img/transito-modelo-dominio.png" alt="Modelo de Dominio">

# Tecnologias utilizadas

## Back end

- Java 17
- Spring Boot
- JPA / Hibernate / Lombok / Flyway
- Maven
- H2
- MySql

## Implantação em produção

- Back end: Railway
- Banco de dados: MySql

# Como executar o projeto

## Back end

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/ricardoguntzell/transito-api

# entrar na pasta do projeto raiz

# executar o projeto
./mvnw spring-boot:run
```

# Testes

- Link de documentação e uso da API: [Swagger-UI](http://localhost:8080/swagger-ui/index.html "Swagger-UI")
- Foi disponibilizado na folder "/postman-collections" os payloads para testar
- Nota: Lembre-se de alterar a URL para seu ambiente local(Ex: http://localhost:8080). Também vou deixar no ar o projeto em produção caso você queira testar a partir dele.
  (https://transito-api-production.up.railway.app)

# Autor

Ricardo Guntzell

- www.linkedin.com/in/ricardoguntzelljr
- https://github.com/ricardoguntzell