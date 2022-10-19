/**
 * BrandstofBudgetAuto
 */
public class BrandstofBudgetAuto extends BudgetAuto{
    String type = "brandstof";
    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return type;
    }
    @Override
    public String getModel() {
        return super.model;
    }
    public void show(){
        System.out.println("Dit is het "+ getType() + " " +getModel() + " model");
    }
	@Override
	public void setVelgen(String velg) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setStoel(String stoel) {
		// TODO Auto-generated method stub
		
	}
    
}