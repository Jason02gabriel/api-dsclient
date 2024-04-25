Documentação do projeto:  Linguagens e frameworks utilizados:  
Java
SQL
Spring Boot
Maven
O projeto consiste em uma aplicação Spring Boot que gerencia clientes. Ele possui três camadas principais: recursos, serviços e entidades.  
ClientResources.java: Esta é a camada de recursos que expõe endpoints REST para manipulação de dados do cliente. Os seguintes endpoints estão disponíveis:  
GET /clients: Retorna uma lista paginada de clientes, com opções para ordenação e direção.
GET /clients/{id}: Retorna um cliente específico com base no ID fornecido.
POST /clients: Cria um novo cliente com os dados fornecidos no corpo da solicitação.
PUT /clients/{id}: Atualiza um cliente existente com base no ID fornecido e nos dados fornecidos no corpo da solicitação.
DELETE /clients/{id}: Exclui um cliente específico com base no ID fornecido.
ClientService.java: Esta é a camada de serviço que contém a lógica de negócios para manipulação de dados do cliente. Ele usa o ClientRepository para interagir com o banco de dados.  
Client.java: Esta é a camada de entidade que representa a tabela de clientes no banco de dados. A classe Client tem os seguintes campos:  
id: O identificador único do cliente.
name: O nome do cliente.
cpf: O CPF do cliente.
income: A renda do cliente.
birth_Date: A data de nascimento do cliente.
children: O número de filhos do cliente.
O projeto usa o Maven como ferramenta de construção e gerenciamento de dependências. Ele também usa o Spring Boot para facilitar a configuração e o desenvolvimento da aplicação.
