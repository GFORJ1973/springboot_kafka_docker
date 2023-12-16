<h1 align="center">
  Messaging Spring Boot
</h1>


## Tecnologias:
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring for Kafka](https://docs.spring.io/spring-kafka/reference/html/)
- [Kafka](https://kafka.apache.org)
- [Docker Compose](https://docs.docker.com/compose/)


## Pré-requisitos:
1 - Criar projetos Spring Boot
 - Spring IO: 
   https://start.spring.io/

 - Dependencias:
   Web, Kafka e Lombok

2 - Criar Docker-compose
 - kafka-docker-compose.yml: 
 - Comando para executar docker-compose no terminal, este arquivo esta na pasta docker no projeto Producer:
  docker-compose -f kafka-docker-compose.yml up -d

3 - Acessar Dashboard Kafdrop
 - Navegador de sua preferencia:
  localhost:19000

## Como Executar:

- Utlizando o postman, enviar um POST para a URL: 
    http://localhost:8080/mensagem

    {
    "mensagem": "Qualquer coisa 01"
    }