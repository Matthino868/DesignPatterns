/**
 * ElektrischBudgetAuto
 */
public class ElektrischBudgetAuto  extends BudgetAuto{
    String type = "elektrisch";
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
        System.out.println("Dit is het "+ getType() + " " +  getModel() + " model");
    }
    
}