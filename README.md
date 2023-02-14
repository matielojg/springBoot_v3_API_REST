# SpringBoot_v3_API_REST 

Enjoy the code. The coffee is on us :coffee:

 [Módulo II do curso](#módulo-2-do-curso)

	Recursos extras:
-[Mockup Mobile - Figma](https://www.figma.com/file/N4CgpJqsg7gjbKuDmra3EV/Voll.med?node-id=45%3A3017&t=AOkfskcNyjPEaq5T-0)<br/>
-[Trello do Projeto](https://trello.com/b/O0lGCsKb/api-voll-med)

	Checklist do Módulo I: 
- [x] Criar uma API Rest em Java com Spring Boot
- [x] Desenvolver CRUDs utilizando o banco de dados MySQL
- [x] Utilizar o Flyway como ferramenta de Migrations da API
- [x] Realizar validações utilizando o Bean Validation
- [x] Realizar paginação dos dados da API


> Módulo 1 - Criação do Projeto com SpringBoot v3

>>-	Criar um projeto Spring Boot utilizando o site do Spring Initializr;
>>-	Importar o projeto no IntelliJ e executar uma aplicação Spring Boot pela classe contendo o método main;
>>-	Criar uma classe Controller e mapear uma URL nela utilizando as anotações @RestController e @RequestMapping;
>>-	Realizar uma requisição de teste no browser acessando a URL mapeada no Controller.


> Módulo 2 - Requisições POST

>>-	Mapear requisições POST em uma classe Controller;
>>-	Enviar requisições POST para a API utilizando o Insomnia;
>>-	Enviar dados para API no formato JSON;
>>-	Utilizar a anotação @RequestBody para receber os dados do corpo da requisição em um parâmetro no Controller;
>>-	Utilizar o padrão DTO (Data Transfer Object), via Java Records, para representar os dados recebidos em uma requisição POST.

> Módulo 3 - Spring Data JPA

>>-	Adicionar novas dependências no projeto;
>>-	Mapear uma entidade JPA e criar uma interface Repository para ela;
>>-	Utilizar o Flyway como ferramenta de Migrations do projeto;
>>-	Realizar validações com Bean Validation utilizando algumas de suas anotações, como a @NotBlank.
>>- [Bean Validation 3.0 - Specifications](https://jakarta.ee/specifications/bean-validation/3.0/jakarta-bean-validation-spec-3.0.html#builtinconstraints)

> Módulo 4 - Requisições GET

>>-	Utilizei a anotação @GetMapping para mapear métodos em Controllers que produzem dados;
>>-	Utilizei a interface Pageable do Spring para realizar consultas com paginação;
>>-	Controlei a paginação e a ordenação dos dados devolvidos pela API com os parâmetros page, size e sort;
>>-	Configurei o projeto para que os comandos SQL sejam exibidos no console.
>>- [DTO ou Entidades?](https://cursos.alura.com.br/course/spring-boot-3-desenvolva-api-rest-java/task/116068)
>>-	Vantagens em usar DTOs e não entidades inteiras JPA:<br/>
		-	[Diminui as vulnerabilidades](https://cheatsheetseries.owasp.org/cheatsheets/Mass_Assignment_Cheat_Sheet.html);<br/>
		-	Filtram dados sensíveis no retorno do JSON;<br/>
		-	Evita loops de stackOverflow através de relacionamentos.<br/>


> Módulo 5 - Requisições PUT E DELETE

>>-	Mapear requisições PUT com a anotação @PutMapping;
>>-	Escrever um código para atualizar informações de um registro no banco de dados;
>>-	Mapear requisições DELETE com a anotação @DeleteMapping;
>>-	Mapear parâmetros dinâmicos em URL com a anotação @PathVariable;
>>-	Implementar o conceito de exclusão lógica com o uso de um atributo booleano.
>>- [Mass Assignment Attack](https://cursos.alura.com.br/course/spring-boot-3-desenvolva-api-rest-java/task/116073) : ocorre quando um usuário é capaz de inicializar ou substituir parâmetros que não deveriam ser modificados na aplicação.
----

### Módulo 2 do curso

[Spring Boot 3: aplique boas práticas e proteja uma API Rest](https://cursos.alura.com.br/course/spring-boot-aplique-boas-praticas-proteja-api-rest)

	Checklist do módulo II:
- [ ] 	Padronizar os retornos dos controllers da API
- [ ] 	Utilizar os códigos HTTP corretamente
- [ ] 	Adicionar o módulo Spring Security no projeto
- [ ] 	Implementar um mecanismo de autenticação na API
- [ ] 	Realizar o controle de acesso na API
- [ ] 	Utilizar Json Web Token para controlar o acesso na API

----
:smirk:[Ajuda com os markdowns](https://learn.microsoft.com/en-us/azure/devops/project/wiki/markdown-guidance?view=azure-devops)

