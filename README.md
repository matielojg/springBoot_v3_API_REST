# SpringBoot_v3_API_REST 

Enjoy the code. The coffee is on us :coffee:

 [Módulo II do curso](#modulo-2-do-curso)</br>
 [Módulo III do curso](#modulo-3-do-curso)</br>

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
- [x] 	Implementar um mecanismo de autenticação na API
- [x] 	Realizar o controle de acesso na API
- [x] 	Utilizar Json Web Token para controlar o acesso na API

<strong>Submódulo 1 - </strong>
>-	Utilizei a classe ResponseEntity, do Spring, para personalizar os retornos dos métodos de uma classe Controller;
>-	Modifiquei o código HTTP devolvido nas respostas da API;
>-	Adicionei cabeçalhos nas respostas da API;
>-	Utilizei os códigos HTTP mais apropriados para cada operação realizada na API.

<strong>Submódulo 2 - Lidando com Tratamento de Erros</strong>
>-	Criei uma classe para isolar o tratamento de exceptions da API, com a utilização da anotação @RestControllerAdvice;
>-	Utilizei a anotação @ExceptionHandler, do Spring, para indicar qual exception um determinado método da classe de tratamento de erros deve capturar;
>-	Tratei erros do tipo 404 (Not Found) na classe de tratamento de erros;
>-	Tratei erros do tipo 400 (Bad Request), para erros de validação do Bean Validation, na classe de tratamento de erros;
>-	Simplifiquei o JSON devolvido pela API em casos de erro de validação do Bean Validation.
>-	Leitura recomendada: [Common Application Properties](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html).

<strong>Submódulo 3 - Spring Security</strong>
>-	Aprendi o funcionamento do processo de autenticação e autorização em uma API Rest;
>-	Leitura recomendada: [Tipos de Autenticação](https://www.alura.com.br/artigos/tipos-de-autenticacao);
>-	Adicionei o Spring Security ao projeto;
>-	Vi o comportamento padrão do Spring Security em uma aplicação, sendo necessário logar na aplicação;
>-	Implementei o processo de autenticação na API, de maneira Stateless, utilizando as classes e configurações do Spring Security.
>-	Leitura recomendada: [Documentação Spring Data](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)

<strong>Submódulo 4 - JSON Web Token</strong>
>-	Adicionei a biblioteca Auth0 java-jwt como dependência do projeto;
>-	Utilizei essa biblioteca para realizar a geração de um token na API;
>-	Injetei uma propriedade do arquivo application.properties em uma classe gerenciada pelo Spring, utilizando a anotação @Value;
>-	Devolvi um token gerado na API quando um usuário se autenticar nela.

<strong>Submódulo 5 - Controle de Acesso</strong>
>-	Funcionam os Filters em uma requisição;
>-	Implementar um filter criando uma classe que herda da classe OncePerRequestFilter, do Spring;
>-	Utilizar a biblioteca Auth0 java-jwt para realizar a validação dos tokens recebidos na API;
>-	Realizar o processo de autenticação da requisição, utilizando a classe SecurityContextHolder, do Spring;
>-	Liberar e restringir requisições, de acordo com a URL e o verbo do protocolo HTTP.

### Modulo 3 do curso

[Spring Boot 3: documente, teste e prepare uma API para o deploy](https://cursos.alura.com.br/course/spring-boot-3-documente-teste-prepare-api-deploy)</br>

<strong>Checklist do módulo III:</strong>
- [x] 	Aprenda a isolar códigos de regras de negócio em uma aplicação
- [ ] 	Implemente princípios SOLID
- [ ] 	Documente uma API seguindo o padrão OpenAPI
- [ ] 	Saiba como escrever testes automatizados em uma aplicação com Spring Boot
- [ ] 	Realize o build de uma aplicação com Spring Boot
- [ ] 	Utilize variáveis de ambiente e prepare uma aplicação para o deploy

<strong>Submódulo 1 - Agendamento de consultas</strong>
>-	Implementei uma nova funcionalidade no projeto;
>-	Avaliei quando é necessário criar uma classe Service na aplicação;
>-	Criei uma classe Service, com o objetivo de isolar códigos de regras de negócio, utilizando para isso a anotação @Service;
>-	Implementei um algoritmo para a funcionalidade de agendamento de consultas;
>-	Realizei validações de integridade das informações que chegam na API;
>-	Implementei uma consulta JPQL (Java Persistence Query Language) complexa em uma interface repository, utilizando para isso a anotação @Query.

----

### Banco de Dados

Se baixou novamente o projeto e já possuir o banco com as tabelas criadas, será necessário:
>-	use vollmed-api;
>-	delete from flyway_schema_history where success =0;
>-	dropar as tabelas medicos e pacientes;
>-	Rodar novamente o projeto.
----
:smirk:[Ajuda com os markdowns](https://learn.microsoft.com/en-us/azure/devops/project/wiki/markdown-guidance?view=azure-devops)

