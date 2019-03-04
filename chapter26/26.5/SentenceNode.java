public class SentenceNode implements Node{
      Node subjectNode,predicateNode;
      public void parse(Context context){
            subjectNode =new SubjectNode();
            predicateNode=new PredicateNode();
            subjectNode.parse(context);
            predicateNode.parse(context);
      }
      public void execute(){
           subjectNode.execute();
           predicateNode.execute();
     }
}