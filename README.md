# Demo DAO JPA 

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](https://github.com/hakkinenT/java-demo-dao-jdbc/blob/master/LICENSE) 
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

## Sobre o projeto
Demo DAO JPA é uma versão do projeto Java Demo DAO JDBC, desenvolvido usando as tecnologias JPA/Hibernate, com o objetivo de colocar em prática o que foi aprendido sobre JPA e Hibernate ao longo do Curso Java COMPLETO 2023 Programação Orientada a Objetos +Projetos, ministrado pelo Professor Nelio Alves da DevSuperior na Udemy.

O projeto consiste na implementação de um simples cadastro de Vendedores e seus respectivos Departamentos, usando o JPA para o mapeamento das Classes em Entidades a serem persistidas no Banco de Dados e o Hibernate como ferramenta de ORM. Ele foi implementado utilizando os conceitos da Programação Orientada a Objetos (POO) como Polimorfismo, Encapsulamento e Associação. Além disso, também foram usados dois padrões de projeto: o DAO e o Factory. O DAO foi usado para implementar, para cada entidade, um objeto responsável por fazer o acesso ao Banco de Dados. Já o Factory foi usado para implementar o conceito de Injeção de Depedência.

## Modelo Conceitual
![Modelo Conceitual](https://github.com/hakkinenT/assets/blob/master/java-projects/java-jdbc/modelo-conceitual-projeto.png)

## Funcionalidades

- Gerenciar Vendedor
- Gerenciar Departamento


## Tecnologias Utilizadas
- Java
- JPA / Hibernate
- MySQL

## Aprendizados

Neste projeto foi possível aprender a usar o JPA juntamente com o Hibernate para armazenar e buscar os dados no Banco de Dados MySQL.


## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/hakkinenT/java-demo-dao-jpa.git
```

Entre no diretório do projeto

```bash
  cd java-demo-dao-jpa
```

Rode a aplicação

```bash
  mvn compile
```

```bash
  mvn exec:java -Dexec.mainClass=com.hakkinent.application.Main
```

Ou

```bash
  mvn compile
```

```bash
  mvn exec:java -Dexec.mainClass=com.hakkinent.application.Main2
```


## Autores

- [@hakkinenT](https://github.com/hakkinenT)
