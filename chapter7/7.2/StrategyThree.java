import java.util.Arrays;
public class StrategyThree implements ComputableStrategy{
    public double computeScore(double [] a){
        if(a.length<=2)
            return 0;
        double score=0,sum=0;
        Arrays.sort(a);
        for(int i=1;i<a.length-1;i++){
           sum=sum+a[i]; 
        }
        score=sum/(a.length-2);
        return score; 
    }
}