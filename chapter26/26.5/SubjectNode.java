public class SubjectNode implements Node{
      Node node;
      public void parse(Context context){
            node =new SubjectPronounOrNounNode();
            node.parse(context);
     }
      public void execute(){
           node.execute();
     }
}