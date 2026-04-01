🍃**Dependências** 
Primeiro adicionei *depedências* que são complementos q adicionamos ao projeto q n são nativos do Spring Boot comum. 
São complementos q precisamos adicionar pra trazer alguns aspectos diferenciais pro projeto e facilitar, 
inclusive, o desenvolvimento.

Foram elas:
Spring Web= é a principal, p trabalharmos c as requisições q usamos.

Dev Tools=  Acelera o processo de carregamento conforme vou fazendo as alterações no meu código.

ThymeLeaf= facilita um pouquinho o trato c a interface gráfica.


📤📥**StatusController**
Criei a classe StatusController pra sinalizar que é ela quem vai se comunicar com o frontend e  backend.

⌨️**@GetMapping**
Usei GetMapping(/status) para invocar o meu método quando digitar /status no  meu navegador (localhost:8080/status)

🎯**@RestController**
Usei o @RestController para ser um agente do HTTP para trocar dados entre os sistemas e manipular requisições HTTP. 
E dentro dessa classe, um método q vai ser chamado, é o método @GetMapping.
