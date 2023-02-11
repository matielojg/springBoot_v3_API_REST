# SpringBoot_v3_API_REST

-	[Mockup Mobile - Figma](https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med?node-id=45%3A3017&t=AOkfskcNyjPEaq5T-0)
-	[Trello](https://trello.com/b/O0lGCsKb/api-voll-med)

## Neste projeto foi possível: 
- Criar uma API Rest em Java com Spring Boot
- Desenvolver CRUDs utilizando o banco de dados MySQL
- Utilizar o Flyway como ferramenta de Migrations da API
- Realizar validações utilizando o Bean Validation
- Realizar paginação dos dados da API

### Módulo 1 - Criação do Projeto com SpringBoot v3

```md
-	Criar um projeto Spring Boot utilizando o site do Spring Initializr;
-	Importar o projeto no IntelliJ e executar uma aplicação Spring Boot pela classe contendo o método main;
-	Criar uma classe Controller e mapear uma URL nela utilizando as anotações @RestController e @RequestMapping;
-	Realizar uma requisição de teste no browser acessando a URL mapeada no Controller.
```

### Módulo 2 - Requisições POST

```md
-	Mapear requisições POST em uma classe Controller;
-	Enviar requisições POST para a API utilizando o Insomnia;
-	Enviar dados para API no formato JSON;
-	Utilizar a anotação @RequestBody para receber os dados do corpo da requisição em um parâmetro no Controller;
-	Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST.
```

### Módulo 3 - Spring Data JPA

```md
-	Adicionar novas dependências no projeto;
-	Mapear uma entidade JPA e criar uma interface Repository para ela;
-	Utilizar o Flyway como ferramenta de Migrations do projeto;
-	Realizar validações com Bean Validation utilizando algumas de suas anotações, como a @NotBlank.
```
-	[Bean Validation 3.0 - Specifications](https://jakarta.ee/specifications/bean-validation/3.0/jakarta-bean-validation-spec-3.0.html#builtinconstraints)

### Módulo 4 - Requisições GET

[DTO ou Entidades?](https://cursos.alura.com.br/course/spring-boot-3-desenvolva-api-rest-java/task/116068)
<p>
-	Vantagens em usar DTOs e não entidades inteiras JPA:<br>
		[Diminui vulnerabilidades](https://cheatsheetseries.owasp.org/cheatsheets/Mass_Assignment_Cheat_Sheet.html);<br>
		Filtram dados sensíveis no retorno do JSON;<br>
		Evita loops de stackOverflow através de relacionamentos.<br>
</p>

```md
-	Utilizei a anotação @GetMapping para mapear métodos em Controllers que produzem dados;
-	Utilizei a interface Pageable do Spring para realizar consultas com paginação;
-	Controlei a paginação e a ordenação dos dados devolvidos pela API com os parâmetros page, size e sort;
-	Configurei o projeto para que os comandos SQL sejam exibidos no console.
```
