package staticex;

//Singleton pattern

public class Company {

    private static Company instance = new Company();

    private Company() {
    }

    //외부에서 생성과 상관없게 하기 위해 static으로 만듦
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }


}
