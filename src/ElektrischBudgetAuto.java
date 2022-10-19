/**
 * ElektrischBudgetAuto
 */
public class ElektrischBudgetAuto extends BudgetAuto {
    String type = "elektrisch";

    
    public String getType() {
        return type;
    }

    
    public String getModel() {
        return super.model;
    }
    public String getVelgen() {
        return super.velgen;
    }

    public void show() {
        System.out.println("Dit is het " + getType() + " " + getModel() + " model");
        // System.out.println(super.velgen);
    }

	public void setVelgen(String velg) {
		// TODO Auto-generated method stub
		
	}

	public void setStoel(String stoel) {
		// TODO Auto-generated method stub

	}

}