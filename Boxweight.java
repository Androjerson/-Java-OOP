public class Boxweight extends Box {
  double weight;
  Boxweight(){
    this.weight=-1.0;
  }
 Boxweight(double l,double h,double w,double weight){
   super(l,h,w); // calling the parent class constructor 
   this.weight=weight;
 }
  
}