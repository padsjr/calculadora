import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    int number1, number2;
    String operador;
    Scanner scanner = new Scanner(System.in);
    boolean online = true;

    while (online) {

      number1 = entraNum();
      operador = entraOper();
      number2 = entraNum();

      switch (operador) {
        case "+":
          System.out.println(sum(number1, number2));
          break;
        case "-":
          System.out.println(sub(number1, number2));
          break;
        case "*":
          System.out.println(mult(number1, number2));
          break;
        case "/":
          System.out.println(div(number1, number2));
          break;
        default:
          System.out.println("Operador inválido!");
      }
      boolean restart = true;
      while(restart) {
        System.out.println("Gostaria de executar outra operação?");
        System.out.println("Sim - Digite 1");
        System.out.println("Não - Digite 2");
        int novaOperacao = scanner.nextInt();
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
  public static int entraNum(){
    int num1;
    Scanner scanner = new Scanner(System.in);
    boolean entradaNum1 = true;
    while(entradaNum1) {
      try{
        System.out.println("Digite o valor para operação: ");
        num1 = scanner.nextInt();
        entradaNum1 = false;
        return num1;
      }catch(InputMismatchException e){
        System.out.println("Você digitou um valor inválido");
        scanner.nextLine();
      }
    }
    return 0;
  }

  public static String entraOper(){
  Scanner scanner = new Scanner(System.in);
  String operador;
    boolean entradaOperador = true;
    while(entradaOperador) {

      System.out.println("Qual operação você gostaria de executar?");
      System.out.println("Soma: +");
      System.out.println("Subtracao: -");
      System.out.println("Multiplicacao: *");
      System.out.println("Divisao: /");
      operador = scanner.nextLine();
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
    try{
      return num1 / num2;
    }catch (ArithmeticException e){
      System.out.println(e.getMessage());
    };
          return num1;
  }
}

