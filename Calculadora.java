import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    int number1, number2;
    String operador;
    Scanner entrada = new Scanner(System.in);
    boolean online = true;

    while (online) {
      System.out.println("Digite o primeiro numero: ");
      number1 = entrada.nextInt();
      System.out.println("Qual operação você gostaria de executar?");

      System.out.println("Soma: +");
      System.out.println("Subtracao: -");
      System.out.println("Multiplicacao: *");
      System.out.println("Divisao: /");
      operador = entrada.next();


      System.out.println("Digite o segundo numero: ");
      number2 = entrada.nextInt();

      switch (operador) {
        case "+":
          System.out.println(number1 + number2);
          break;
        case "-":
          System.out.println(number1 - number2);
          break;
        case "*":
          System.out.println(number1 * number2);
          break;
        case "/":
          System.out.println(number1 / number2);
          break;
        default:
          System.out.println("Operador inválido!");
      }
      boolean restart = true;
      while(restart) {
        System.out.println("Gostaria de executar outra operação?");
        System.out.println("Sim - Digite 1");
        System.out.println("Não - Digite 2");
        int novaOperacao = entrada.nextInt();
        if (novaOperacao == 1) {
          online = true;
          restart = false;
        }else if (novaOperacao == 2) {
          online = false;
          restart = false;
        }else{
          System.out.println("Valor inválido, digite novamente!");
        }

      }
    }
  }
}
