import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    int number1, number2, resultado;
    String operador;
    Scanner scanner = new Scanner(System.in);
    boolean online = true;

    while (online) {

      number1 = entraNum(scanner);
      operador = entraOper(scanner);
      number2 = entraNum(scanner);
      resultado = operacao(number1,number2,operador);
      System.out.println("O resultado da sua operação é: " + resultado);

      boolean restart = true;
      boolean encadear = false;

      while(restart) {

        if(encadear) {
          operador = entraOper(scanner);
          number1 = entraNum(scanner);
          resultado= operacao(resultado,number1,operador);
          System.out.println("O resultado da sua operação é: " + resultado);
          encadear = false;
        }
        System.out.println("Gostaria de executar outra operação ou continuar essa?");
        System.out.println("Sim - Digite 1");
        System.out.println("Não - Digite 2");
        System.out.println("Continuar esta operação - Digite 3");
        int novaOperacao = scanner.nextInt();

        if (novaOperacao == 1) {
          online = true;
          restart = false;
        }else if (novaOperacao == 2) {
          online = false;
          restart = false;
        }else if (novaOperacao == 3) {
          encadear = true;
        }else{
          System.out.println("Valor inválido, digite novamente!");
        }
      }
      }
    }
  public static int entraNum(Scanner scanner){
    scanner = new Scanner(System.in);

    while(true) {
      try{
        System.out.println("Digite o valor para operação: ");
        return scanner.nextInt();
      }catch(InputMismatchException e){
        System.out.println("Você digitou um valor inválido");
        scanner.nextLine();
      }
    }
  }

  public static String entraOper(Scanner scanner){
  scanner = new Scanner(System.in);
  String operador;
    boolean entradaOperador = true;
    while(entradaOperador) {

      System.out.println("Qual operação você gostaria de executar?");
      System.out.println("Soma: +");
      System.out.println("Subtracao: -");
      System.out.println("Multiplicacao: *");
      System.out.println("Divisao: /");
      operador = scanner.next();
      switch(operador) {
        //Como case nao tem brake, ele passa por todos até encontrar um break, ou ele segue até a saida defaul, por isso tem q lembrar de colocar break
        case "+":
        case "-":
        case "*":
        case "/":
          return operador;
        default: System.out.println("Você digitou um operador inválido, tente novamente");
      }
    }
    return "Falha";
  }

  public static int operacao(int number1, int number2,String operador){
    switch (operador) {
      case "+":
        return sum(number1, number2);
      case "-":
        return sub(number1, number2);
      case "*":
        return mult(number1, number2);
      case "/":
        return div(number1, number2);
      default:
        System.out.println("Operador inválido!");
    }
    return 0;
  }


  public static int sum(int num1, int num2) {
    return num1 + num2;
  }
  public static int sub(int num1, int num2) {
    return num1 - num2;
  }
  public static int mult(int num1, int num2) {
    return num1 * num2;
  }
  public static int div(int num1, int num2) {
    if (num2 == 0) {
      System.out.println("Não é possível dividir por zero.");
      return 0;
    }

    return num1 / num2;
  }
}

