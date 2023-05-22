class program{
 program(){
  //todo poner codigo aqui
  while(frontIsClear)
   {
    if(notNexToABeeper)
    {
     putbeeper();
     move();
    }
   else
    {
     if(NextToABeeper)
     {
      pickbeeper();
      if(nextToABeeper)
      {
       move();
      }
      else
      {
       putbeeper();
       move();
      } // else
     } //if
    }//else
   }while
   if(notNextToABeeper)
   {
    putbeeper();
   }
   else
   {
    if(nextToBeeper)
    {
     pickbeeper();
     if(nextToABeeper)
     {
      putbeeper();
     }
    else
     {
      if(nextToABeeper)
      {
       turnoff();
      } //If
      else
      {
       putbeeper();
      }// else
     }//if
    }//else
    turnoff();
   }
     
    
     

	 