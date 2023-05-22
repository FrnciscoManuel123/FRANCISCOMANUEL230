import java.io.*;
class mayorquecinco
{
 public static void main (String[]args)
  {
   int[] listanumeros={0, 9, 4, 1, 3, 7};
   int contar = 0;
   for(int i=0; i<listanumeros.length;i++)
   { 
    if(listanumeros[i]>5)
    {
     contar++;
    }
   }
  System.out.print(+contar);
 }
}	 