impot java.io.*;
class estaturas
 {
  public static void main(String[]args)
   {
    float[] estaturas= {1.8f,1.5f,2.0f};
    float numMayor;
    for(int i = 0; i<=2; i++)
    { 
     if(numMayor>estaturas[i])
     {
      numeroMayor=numMayor;
     }
    else
     {
      numMayor=estaturas[i];
     }
    }
   System.out.println(numMayor);
   }
  } 