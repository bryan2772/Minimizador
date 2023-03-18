package Minimizador; //projeto
import java.io.*;// biblioteca que usamos para ler o arquivo
    /*A biblioteca Java "java.io" fornece classes e interfaces para lidar com 
    operações de entrada e saída (I/O) em Java. Essa biblioteca é usada para
    realizar tarefas como leitura e escrita de arquivos, leitura e gravação de
    fluxos de dados (streams), comunicação com dispositivos externos,
    entre outras operações de entrada e saída.

    Algumas classes importantes da biblioteca "java.io" incluem:

    FileInputStream e FileOutputStream: para ler e escrever dados em arquivos;
    BufferedReader e BufferedWriter: para ler e escrever dados em buffers de memória;
    DataInputStream e DataOutputStream: para ler e escrever dados primitivos (int, float, etc.) em fluxos de dados;
    ObjectInputStream e ObjectOutputStream: para ler e escrever objetos serializados em fluxos de dados.

    Essas classes e interfaces fornecem métodos para ler e escrever dados em 
    diferentes formatos e contextos, tornando a biblioteca "java.io" uma 
    ferramenta essencial para lidar com operações de entrada e saída em Java.*/

    //escolher qual descriçao deixar(acho que a resumida e melhor)

    /*resumo:A biblioteca "java.io" é usada para fazer coisas como 
    ler e escrever arquivos e trabalhar com dados de entrada e saída.
    Ela fornece ferramentas úteis, como classes para ler e escrever em 
    arquivos, buffers de memória, fluxos de dados e objetos serializados.
    Em resumo, a biblioteca "java.io" é uma coleção de ferramentas para 
    ajudar na manipulação de entrada e saída de dados em Java.*/

public class Minimizador {

   public static void main(String[] args) {
      try {
         // Abre o arquivo.dat
         InputStream arquivo = new FileInputStream("Minimizador/automato.dat");

         // Cria um buffer de leitura para o arquivo .dat
         DataInputStream dis = new DataInputStream(arquivo);//dis = DataInputStream
         BufferedReader br = new BufferedReader(new InputStreamReader(dis));//br = BufferedReader

         // Leie o arquivo .dat
         String linha;
         while ((linha = br.readLine()) != null) {//percorre linha a linha
            System.out.println(linha);//imprime a linha
         }

         // Fecha o buffer de leitura
         br.close();

      } catch (IOException e) {//verifica se ouve erro ao ler o arquivo
         System.err.println("Erro ao ler o arquivo: " + e.getMessage());
      }
      /*"try {} catch" é uma construção em Java usada para lidar com 
      exceções. O bloco "try" é usado para envolver um conjunto de 
      instruções que podem gerar exceções e o bloco "catch" contém o 
      código que é executado para lidar com a exceção. O "try {} catch" é 
      usado para prevenir que o programa pare de executar quando 
      ocorre uma exceção, permitindo que o código continue sendo executado.*/
   }
}
