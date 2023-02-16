# SpringBoot_v3_API_REST 

Enjoy the code. The coffee is on us :coffee:

 [Módulo II do curso](#modulo-2-do-curso)

Recursos extras:</br>
-[Mockup Mobile - Figma](https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med?node-id=45%3A3017&t=AOkfskcNyjPEaq5T-0)<br/>
-[Trello do Projeto](https://trello.com/b/O0lGCsKb/api-voll-med)</br>
-[Banco de dados](#banco-de-dados)</br>

<strong>Checklist do Módulo I: </strong>
- [x] Criar uma API Rest em Java com Spring Boot
- [x] Desenvolver CRUDs utilizando o banco de dados MySQL
- [x] Utilizar o Flyway como ferramenta de Migrations da API
- [x] Realizar validações utilizando o Bean Validation
- [x] Realizar paginação dos dados da API

<strong>Submódulo 1 - Criação do Projeto com SpringBoot v3</strong>

>-	Criar um projeto Spring Boot utilizando o site do Spring Initializr;
>-	Importar o projeto no Spring Tools Suite e executar uma aplicação Spring Boot pela classe contendo o método main;
>-	Criar uma classe Controller e mapear uma URL nela utilizando as anotações @RestController e @RequestMapping;
>-	Realizar uma requisição de teste no browser acessando a URL mapeada no Controller.


<strong>Submódulo 2 - Requisições POST</strong>

>-	Mapear requisições POST em uma classe Controller;
>-	Enviar requisições POST para a API utilizando o Insomnia;
>-	Enviar dados para API no formato JSON;
>-	Utilizar a anotação @RequestBody para receber os dados do corpo da requisição em um parâmetro no Controller;
>-	Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST.

<strong>Submódulo 3 - Spring Data JPA</strong>

>-	Adicionar novas dependências no projeto;
>-	Mapear uma entidade JPA e criar uma interface Repository para ela;
>-	Utilizar o Flyway como ferramenta de Migrations do projeto;
>-	Realizar validações com Bean Validation utilizando algumas de suas anotações, como a @NotBlank.
>- 	Leitura recomendada: [Bean Validation 3.0 - Specifications](https://jakarta.ee/specifications/bean-validation/3.0/jakarta-bean-validation-spec-3.0.html#builtinconstraints)

<strong>Submódulo 4 - Requisições GET</strong>

>-	Utilizei a anotação @GetMapping para mapear métodos em Controllers que produzem dados;
>-	Utilizei a interface Pageable do Spring para realizar consultas com paginação;
>-	Controlei a paginação e a ordenação dos dados devolvidos pela API com os parâmetros page, size e sort;
>-	Configurei o projeto para que os comandos SQL sejam exibidos no console.
>- 	Leitura recomendada: [DTO ou Entidades?](https://cursos.alura.com.br/course/spring-boot-3-desenvolva-api-rest-java/task/116068)
>-	Vantagens em usar DTOs e não entidades inteiras JPA:<br/>
		-	[Diminui as vulnerabilidades](https://cheatsheetseries.owasp.org/cheatsheets/Mass_Assignment_Cheat_Sheet.html);<br/>
		-	Filtram dados sensíveis no retorno do JSON;<br/>
		-	Evita loops de stackOverflow através de relacionamentos.<br/>


<strong>Submódulo 5 - Requisições PUT E DELETE</strong>

>-	Mapear requisições PUT com a anotação @PutMapping;
>-	Escrever um código para atualizar informações de um registro no banco de dados;
>-	Mapear requisições DELETE com a anotação @DeleteMapping;
>-	Mapear parâmetros dinâmicos em URL com a anotação @PathVariable;
>-	Implementar o conceito de exclusão lógica com o uso de um atributo booleano.
>- 	Leitura recomendada: [Mass Assignment Attack](https://cursos.alura.com.br/course/spring-boot-3-desenvolva-api-rest-java/task/116073) : ocorre quando um usuário é capaz de inicializar ou substituir parâmetros que não deveriam ser modificados na aplicação.
----

### Modulo 2 do curso

[Spring Boot 3: aplique boas práticas e proteja uma API Rest](https://cursos.alura.com.br/course/spring-boot-aplique-boas-praticas-proteja-api-rest)

<strong>Checklist do módulo II:</strong>
- [x] 	Padronizar os retornos dos controllers da API
- [x] 	Utilizar os códigos HTTP corretamente
- [x] 	Adicionar o módulo Spring Security no projeto
- [ ] 	Implementar um mecanismo de autenticação na API
- [ ] 	Realizar o controle de acesso na API
- [ ] 	Utilizar Json Web Token para controlar o acesso na API

<strong>Submódulo 1 - </strong>
>-	Utilizar a classe ResponseEntity, do Spring, para personalizar os retornos dos métodos de uma classe Controller;
>-	Modificar o código HTTP devolvido nas respostas da API;
>-	Adicionar cabeçalhos nas respostas da API;
>-	Utilizar os códigos HTTP mais apropriados para cada operação realizada na API.

<strong>Submódulo 2 - Lidando com Tratamento de Erros</strong>
>-	Criar uma classe para isolar o tratamento de exceptions da API, com a utilização da anotação @RestControllerAdvice;
>-	Utilizar a anotação @ExceptionHandler, do Spring, para indicar qual exception um determinado método da classe de tratamento de erros deve capturar;
>-	Tratar erros do tipo 404 (Not Found) na classe de tratamento de erros;
>-	Tratar erros do tipo 400 (Bad Request), para erros de validação do Bean Validation, na classe de tratamento de erros;
>-	Simplificar o JSON devolvido pela API em casos de erro de validação do Bean Validation.
>-	Leitura recomendada: [Common Application Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html).

<strong>Submódulo 3 - Spring Security</strong>
>-	Funciona o processo de autenticação e autorização em uma API Rest;
>-	Leitura recomendada: [Tipos de Autenticação](https://www.alura.com.br/artigos/tipos-de-autenticacao);
>-	Adicionar o Spring Security ao projeto;
>-	Funciona o comportamento padrão do Spring Security em uma aplicação;
>-	Implementar o processo de autenticação na API, de maneira Stateless, utilizando as classes e configurações do Spring Security.
>-	Leitura recomendada: [Documentação Spring Data](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)


----

### Banco de Dados

Se baixou novamente o projeto e já possuir o banco com as tabelas criadas, será necessário:
>-	use vollmed-api;
>-	delete from flyway_schema_history where success =0;
>-	dropar as tabelas medicos e pacientes;
>-	Rodar novamente o projeto.
----
:smirk:[Ajuda com os markdowns](https://learn.microsoft.com/en-us/azure/devops/project/wiki/markdown-guidance?view=azure-devops)

