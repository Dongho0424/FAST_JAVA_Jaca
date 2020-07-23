package polymorphism;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName); //명시적으로 생성자 호출 왜냐하면 기본 생성자 없기 때문에

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        System.out.println("VIPCustomer(int ,String) constructor is called! ");
    }

//    public VIPCustomer() {
//
//
//        super() // : default constructor of father class
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//
//        System.out.println("VIPCustomer() constructor is called! ");
//    }

}
