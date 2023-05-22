import java.io.*;
import java.util.Scanner;
class Suma
  {
   public static void main(String[] args)
     {
      Scanner entrada = new Scanner(System.in);
      float nota1,nota2,suma;//Variables
      nota1 = entrada.nexFloat();
      nota2 = entrada.nexFloat();
      suma = nota1 + nota2;
      System.out.print("la SUMA es:"+suma);
     }
  }