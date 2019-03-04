public class PrintNumber{
   int n;
   PrintNumber(int n){
      this.n=n;
   } 
   public void printEvenNumber(){
      for(int m=1;m<=n;m++)
        if(m%2==0)
          System.out.print(" "+m);
   }
}
