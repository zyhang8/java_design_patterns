public class ObjectNode implements Node{
      Node node;
      public void parse(Context context){
            node =new ObjectPronounOrNounNode();
            node.parse(context);
     }
      public void execute(){
           node.execute();
     }
}