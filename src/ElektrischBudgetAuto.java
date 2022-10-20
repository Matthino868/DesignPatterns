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
    
    // public void setVelgen(String velg) {
    //     super.velgen = velg;
    // }
    // public String getVelgen() {
    //     return super.velgen;
    // }

	public void setSoortStoelen(String stoel) {
        super.soortStoelen = stoel;
	}
    
    public String getSoortStoelen() {
        return super.getSoortStoelen();
    }


}