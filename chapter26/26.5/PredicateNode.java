public class PredicateNode implements Node{
      Node verbNode,objectNode;
      public void parse(Context context){
            verbNode =new VerbNode();
            objectNode=new ObjectNode();
            verbNode.parse(context);
            objectNode.parse(context);
      }
      public void execute(){
          verbNode.execute();
          objectNode.execute();
     }
}