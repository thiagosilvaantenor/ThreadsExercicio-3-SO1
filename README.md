# Exercício 3 de Threads - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-000?style=for-the-badge&logo=windows&logoColor=2CA5E0)
![Linux](https://img.shields.io/badge/Linux-000?style=for-the-badge&logo=linux&logoColor=FCC624)

</div>

## Sobre o projeto
Este é o exercício 3, da lista de exercícios de Threads, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.<br>

Caso queira ver os outros exercícios:
- [Exercício 1](https://github.com/thiagosilvaantenor/ThreadsExercicio-1-SO1)
- [Exercício 2](https://github.com/thiagosilvaantenor/ThreadsExercicio-2-SO1)
- [Exercício 4](https://github.com/thiagosilvaantenor/ThreadsExercicio-4-SO1)
## Índice
=================
<!--ts-->
* [Título](#exercício-3-de-threads---sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercício 3](#exercício-3)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercício 3
Criar em java um projeto com uma `Thread` chamada `ThreadVetor`, que receba um
valor numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve
percorrer o vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o
tempo para percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer
o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No
final, ambas as possibilidades devem apresentar o tempo em segundos.<br>
A operação `main` deve gerar um vetor de 1000 posições com valores aleatórios de 1 a
100. Deve iniciar 2 `ThreadVetor` e para uma passar o número 1 e o vetor e para a outra,
passar o número 2 e o mesmo vetor.


## Status do projeto
✅ Finalizado ✅

* Preview:
  * A classe `Main` vai gerar e preencher um vetor[1000] com números aleatorios entre 100 a 1
  * O resultado deve sair no console, uma linha mostrando o tempo com o loop `For` e outra com o `ForEach`

    ![image](https://github.com/thiagosilvaantenor/ThreadsExercicio-3-SO1/assets/99970279/ee06754b-bd0d-42c6-af24-9ac893ca7f21)

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [Thread](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, [Leandro Colevati dos Santos](https://www.leandrocolevati.com.br/index.jsp), por todo o aprendizado passado.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/thiago-antenor/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
 <br />
 <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>


Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!

[![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
[![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
