import java.util.*;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int parametroUm, parametroDois;
      System.out.println("Digite o primeiro parametro");
      parametroUm = sc.nextInt();
      System.out.println("Digite o segundo parametro");
      parametroDois = sc.nextInt();
      try {
        contar(parametroUm, parametroDois);
      } catch (ParametrosInvalidosException e) {
        System.out.println(e.getMessage());
      }
    }
  
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
      if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
      } else {
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
          System.out.println("Imprimindo o número" + " " + (i + 1));
        }
      }
    }
  
    public static class ParametrosInvalidosException extends Exception {
      public ParametrosInvalidosException(String msg) {
        super(msg);
      };
    }
}
