# Fundamentos do Desenvolvimento Java 
## Teste de Performance - TP3 
#### Elvis Lopes

### Escopo

Evoluir o módulo do programa de controle acadêmico para uma instituição de ensino.

* Ao ser iniciado, o programa deve exibir um menu com as seguintes opções:

  * [1] Cadastrar professor.
  * [2] Cadastrar aluno.
  * [3] Consultar situação de um docente/discente.
  * [4] Sair.

* A estrutura do programa é composta por um vetor com 100 posições, de objetos da classe Pessoa. 
* No seu cadastro, uma pessoa pode ser um professor ou um aluno. 
* Ambos devem herdar atributos da classe Pessoa, mas também devem ter os seus atributos específicos.
* O cadastro de professor e de aluno (opções 1 e 2 do menu) deve tratar a entrada de dados. 
* Ao cadastrar um professor ou um aluno, o programa deve informar o código gerado, que é o índice do vetor. 
* Esse índice deve viabilizar a consulta da situação de um docente/discente (item 3 do menu).
* Ao realizar a consulta, o programa deve:
  * perguntar o código, e retornar a informação sobre o docente/discente pesquisado. 
  * A informação deve ser retornada a partir da chamada de um método consultarSituacao() da classe Pessoa, que deve ser implementada em Aluno e Professor com o retorno dos atributos gerais de uma pessoa, e os atributos específicos de cada classe, através do conceito de polimorfismo.
* Os dados de uma pessoa, comuns ao aluno e ao professor, e os dados específicos de aluno e de professor serão criados por você. 
* Você também deve criar métodos específicos para Aluno e Professor. 
* Desenvolva construtores para as classes. 
* Crie sobrecargas de construtores e de métodos. 
* Pense em dar mais opções ao cliente das classes.
* Defina os atributos privados para cada classe, segundo a sua concepção, e métodos públicos get e set para todos os atributos, seguindo os padrões de encapsulamento. 
* Fique atento à utilização de modificadores protected na classe Pessoa para que Aluno e Professor tenham acesso.
* Crie uma classe que deve conter o método main para a execução do programa e realize alguns testes para demonstrar o funcionamento dele, instanciando os objetos e realizando chamadas de métodos.
* Percorra o código do seu programa, com o foco em possíveis erros que ele pode lançar. Por exemplo, suponha que uma opção acima da permitida no menu seja digitada, ou que o vetor exceda o limite, ou que uma string seja informada quando o valor solicitado é um inteiro.
* Verifique e trate esses casos usando try, catch e finally. O finally é opcional, mas você deve utilizar pelo menos uma vez em seu programa. Escolha duas exceções não verificadas e trate em seu código. Além disso, crie sua própria classe de exceção e trate dentro do seu programa usando throws e throw.
* Neste teste, você também deve tratar os nomes do professores e alunos que são informados no programa. Crie nos objetos atributos referentes a nome, nome do meio e último nome. Instancie objetos da classe String variando a utilização de seus construtores.
* Você deve receber do usuário os nomes completos, mas separá-los para armazenar nas variáveis correspondentes. Você deve fazê-lo de duas formas no programa: a primeira utilizando os métodos substring e indexOf, e a segunda utilizando split. Implemente as duas formas nos métodos sets das classes e realize testes elas.
* Para retornar as informações, implemente o uso da classe StringBuilder e seu método append para concatenar o nome completo e informar ao usuário quando o método consultarSituacao for chamado.