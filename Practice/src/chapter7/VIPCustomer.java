package chapter7;

public class VIPCustomer extends Customer {

    double saleRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;

        initVIPCustomer();
    }

    public void initVIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public String showCustomerInfo(){
        return super.showCustomerInfo() +
                " 담당 상담원 번호는 " + agentID + "입니다";
    }

    public int getAgentID() {
        return agentID;
    }
}
