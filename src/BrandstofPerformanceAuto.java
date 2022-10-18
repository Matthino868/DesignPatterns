/**
 * BrandstofPerformanceAuto
 */
public class BrandstofPerformanceAuto extends PerformanceAuto{
    String type = "brandstof";
    @Override
    public String getType() {
        return type;
    }
    @Override
    public String getModel() {
        return super.model;
    }
    public void show(){
        System.out.println("Dit is het "+ getType() + " " +  getModel() + " model");
    }
    
}