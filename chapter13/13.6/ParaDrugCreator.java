public class ParaDrugCreator implements DrugCreator{
    public Drug getDrug(){
       int [] a={250,15,1,10};
       Drug drug=new Paracetamol("°±¼Ó»ÆÃô½ºÄÒ",a);
       return drug;
    }
}