/**
 * ElektrischBudgetAuto
 */
public class ElektrischBudgetAuto extends BudgetAuto {
    String type = "elektrisch";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getModel() {
        return super.model;
    }

    public void show() {
        System.out.println("Dit is het " + getType() + " " + getModel() + " model");
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