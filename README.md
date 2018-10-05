# Trabalho1

Trabalho1 é uma programa escrito em Java que tem como objetivo mostrar todo o conhecimento adquirido até agora na disciplica de 'Técnicas de programação'. O programa contém três tipos de contas **Conta-comum**, **Conta-Poupança** e **Conta-Especial**. Tendo a opção de efetuar várias operações que uma conta bancária faria.

### Autor:
**Nome:** Salmo Da Cruz Mascarenhas - 431447
**E-mail:** salmo.cruz@gmail.com
**Curso:** Engenharia da computação
**Instituição:** Universidade Federal do Ceará.

### Descrição (classes, atributos, metódos)
**Contas.java**
    -String nome;
    -int numero;
    -double saldo;
    -getNome();
    -setNome(String nome);
    -getNumero();
    -setNumero(int numero);
    -getSaldo();
    -depositar(double valor);
    -sacar(double valor);
    -tipoConta();
    
**ContaPoupanca**
    -reajustar(double taxa);
    -reajustar();
    -tipoConta();

**ContaEspecial**
    int limite;
    int multa;
    descontar(double multa);
    tipoConta();
    
### Operações

-sacar
-depositar
-transferir
-reajustar
-ver saldos
-sair

### Clonando repositório

**No Windows**
Faça o download do git no link: https://git-scm.com/download/win

Após download, execute o instalador e dê **next next...* e por último finish.

Crie uma pasta na Área de trabalho e abra, em uma parte "branca" clique com o direito do mouse e vá em GIT bash here.
No GitBash digite:
```sh
$ git clone https://github.com/salmomascarenhas/Trabalho1.git
```
Faça o login com a sua conta na tela que irá aparecer (login e senha).

Pronto, verifique a pasta escolhida o repositório.


**No Unix/Linux**
Baixe o Git abrindo o terminal e digitando:
```sh
$ apt-get install git
```
dê Enter.

Crie uma pasta em seu computador, clique (botão direito) em uma parte vazia na Área de trabalho e abra o terminal/shell.
Para criar a pasta, digite o comando:
```sh
$ mkdir Github
```
E dê Enter.
Depois disso, para entrar na pasta que acabamos de criar, digite:
```sh
$ cd Github 
```
E dê Enter.
Ainda no terminal, digite:
```sh
$ git clone https://github.com/salmomascarenhas/Trabalho1.git
```
Pronto! Verifique a pasta, os arquivos do repositório estarão lá.




### Execução 
**1ª forma de executar**
Após clonar o repositório, dentro da pasta (que criou) siga o diretório: **/Github/Trabalho1/dist/** e execute o arquivo **Trabalho1.jar**.

**2ª forma de executar (compilando)**
Abra o NetBeans, clique em Arquivo/File. 
Selecione Abrir projeto/Open project.
Navegue até a pasta onde clonou o repositório (criada inicialmente).
Selecione **Trabalho1** e cliquem abrir projeto/open project.
Agora no NetBeans (com o projeto aberto) execute o programa clicando no atalho F6.

### Funcionamento
- Ao executar o programa, deve ser preenchido todas as informações de acordo com cada label informativa e a respectiva conta (conta comum, conta poupança e conta especial).
- Após o preenchimento de todas as informações necessárias, será exebido um menu principal com todas as operações possíveis.

- **Saque:**
--  Pode ser efetuado um saque informando o número da conta (preenchido no início), e o valor desejado para saque e depois clicando no botão 'Ok' ou pode voltar ao 'MENU' principal.
- **Depositar:**
-- Pode ser efetuado um deposito informando o número da conta (preenchido no início) no campo respectivo, e o valor para ser depositado.
- **Transferência:**
-- Deve ser informado o número da conta de origem e o valor a ser transferido. Depois deve ser informado o número da conta de destino.
- **Reajustar:**
-- Deve ser informado o número da conta para reajustar a taxa (se poupança), e depois informar a porcentagem (%) da taxa de reajuste, caso nenhuma seja informada, será aplicada a taxa padrão (%10).
- **Ver saldos:**
-- Mostra os tipos de conta (comum, poupança e especial), o número de cada conta e o seus respectivos saldos.
- **Sair:**
-- Finaliza o programa.
