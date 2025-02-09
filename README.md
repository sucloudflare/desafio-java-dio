<h1>Desafio DIO - Conta Banco</h1>
<p>Este projeto é uma solução para o desafio proposto no módulo de <strong>Sintaxe</strong> da Trilha <strong>Java Básico</strong> da DIO. O objetivo do desafio é criar um sistema simples que leia dados de uma conta bancária via terminal e exiba uma mensagem com as informações fornecidas.</p>

<h2>Requisitos</h2>
<ul>
<li><strong>Java 8+</strong> (ou versão superior) instalado em seu ambiente de desenvolvimento.</li>
<li><strong>VSCode</strong> ou qualquer IDE de sua preferência para desenvolvimento Java.</li>
</ul>

<h2>Como Rodar o Projeto</h2>
<h3>Passo 1: Preparar o ambiente</h3>
<p>1. Certifique-se de ter o Java instalado. Você pode verificar isso com o comando:</p>
<pre><code>java -version</code></pre>
<p>Se não tiver o Java instalado, <a href="https://www.oracle.com/java/technologies/javase-jdk11-downloads.html">baixe e instale a versão mais recente aqui</a>.</p>
<p>Se você estiver usando o VSCode, instale a extensão Java no VSCode para facilitar o processo de desenvolvimento.</p>

<h3>Passo 2: Estrutura do Projeto</h3>
<p>O projeto tem a seguinte estrutura:</p>
<pre><code>
ContaBanco/
│
├── src/
│   └── ContaTerminal.java
│
└── bin/  # Diretório gerado automaticamente após a compilação
</code></pre>
<ul>
<li>O diretório <code>src</code> contém o arquivo fonte <code>ContaTerminal.java</code>.</li>
<li>O diretório <code>bin</code> conterá o arquivo compilado <code>ContaTerminal.class</code>.</li>
</ul>
<h3>Passo 3: Compilação</h3>
<p>Para compilar o código, abra o terminal na pasta raiz do projeto (<code>ContaBanco</code>) e execute o seguinte comando:</p>
<pre><code>javac -d bin src/ContaTerminal.java</code></pre>
<p>Isso criará a pasta <code>bin</code> (se não existir) e armazenará o arquivo <code>.class</code> da classe <code>ContaTerminal</code> nela.</p>

<h3>Passo 4: Execução</h3>
<p>Para executar o programa, no terminal, use o seguinte comando:</p>
<pre><code>java -cp bin ContaTerminal</code></pre>
<p>O programa solicitará os seguintes dados ao usuário:</p>
<ul>
<li><strong>Número da conta:</strong> O número da conta bancária.</li>
<li><strong>Agência:</strong> O número da agência.</li>
<li><strong>Nome do cliente:</strong> O nome do cliente da conta bancária.</li>
<li><strong>Saldo:</strong> O saldo atual da conta.</li>
</ul>
<p>Após inserir esses dados, o programa exibirá a seguinte mensagem:</p>
<pre><code>Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque.</code></pre>
<p>Onde os campos entre colchetes (<code>[ ]</code>) serão substituídos pelos dados informados pelo usuário.</p>

<h3>Exemplo de Execução</h3>
<pre><code>
Por favor, digite o número da Agência !
067-8
Por favor, digite o número da Conta !
1021
Por favor, digite o nome do Cliente !
MARIO ANDRADE
Por favor, digite o saldo da Conta !
237.48

Saída:
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
</code></pre>

<h2>Descrição do Código</h2>
<p>A classe <code>ContaTerminal</code> realiza as seguintes operações:</p>
<ul>
<li>Solicita ao usuário informações sobre sua conta bancária, como número da conta, agência, nome do cliente e saldo.</li>
<li>Exibe uma mensagem de boas-vindas com os dados fornecidos.</li>
</ul>

<h3>Código de Exemplo: <code>ContaTerminal.java</code></h3>
<pre><code>
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados ao usuário
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();
        
        scanner.nextLine();  // Limpar o buffer do scanner
        
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem com os dados fornecidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                           + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
</code></pre>

<h2>Conclusão</h2>
<p>Este projeto é uma boa prática para entender os conceitos básicos de Java, como manipulação de dados, entrada de dados via terminal, uso de tipos de dados, e estrutura de controle de fluxo. A partir dessa base, você pode expandir o sistema para incluir funcionalidades como operações bancárias (depósito, saque, transferência, etc.), persistência de dados, e até mesmo criar uma interface gráfica.</p>

<h2>Licença</h2>
<p>Este projeto é distribuído sob a licença MIT. Veja o arquivo LICENSE para mais informações.</p>
