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
}