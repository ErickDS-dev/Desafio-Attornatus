# Desafio Attornatus - API de Gerenciamento de Pessoas e Endereços

Este projeto é uma API desenvolvida em Spring Boot que permite o gerenciamento de pessoas e seus endereços. A API oferece funcionalidades como criar uma pessoa, editar informações de uma pessoa, consultar uma pessoa, listar todas as pessoas, adicionar endereço a uma pessoa, listar os endereços de uma pessoa e definir qual endereço é o principal de uma pessoa.

## Funcionalidades

- **Criar uma Pessoa:**
  Permite criar uma nova pessoa fornecendo seu nome e data de nascimento.

- **Editar uma Pessoa:**
  Permite atualizar as informações de uma pessoa, incluindo seu nome e data de nascimento.

- **Consultar uma Pessoa:**
  Permite consultar as informações de uma pessoa com base no seu ID.

- **Listar Pessoas:**
  Retorna a lista de todas as pessoas cadastradas.

- **Criar um Endereço para uma Pessoa:**
  Permite adicionar um endereço a uma pessoa, incluindo logradouro, CEP, número e cidade.

- **Listar Endereços de uma Pessoa:**
  Retorna a lista de endereços associados a uma pessoa.

- **Informar o Endereço Principal de uma Pessoa:**
  Permite marcar um endereço como principal para uma pessoa.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Executando a Aplicação

Para executar a aplicação, certifique-se de ter o Java e o Maven instalados. Em seguida, siga os passos abaixo:

1. Clone o repositório para sua máquina local.
   
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Navegue até o diretório do projeto.
   
   ```bash
   cd Desafio-Attornatus

3. Execute a aplicação usando o Maven.
   
   ```bash
   mvn spring-boot:run


A aplicação estará disponível em http://localhost:8080.

# Uso da API

Para utilizar a API, você pode fazer requisições HTTP aos endpoints descritos acima utilizando o Postman ou cURL.


Feito pelo melhor desenvolvedor Java (Eu) Erick D Silva!
