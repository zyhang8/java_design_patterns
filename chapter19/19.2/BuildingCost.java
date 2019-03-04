public  class  BuildingCost extends ArchitectureCost{
      BuildingCost(BuildingDesign  design,double unitPrice){
             this.design=design;
             this.unitPrice=unitPrice;
      }
      public  double giveCost() {
            double area=design.computerArea();
            return area*unitPrice;
      }
}   
