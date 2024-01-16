package Practice;

class Car{
    int num;
    private double gas;
    public void show(){
        System.out.println("번호 :"+num);
        System.out.println("연료량 :"+gas);
    }

    public void fillGas(double g){
        gas = g;
    }
    

//    오버로딩
    public void setCar(int a){
        num = a;
        System.out.println("번호를 "+num+"으로 변경.");
    }
    public void setCar(double g){
        gas += g;
        System.out.println("가스를"+g+"만큼 더함");
    }
}

public class java_class {
    public static void main(String [] args) throws Exception{

        Car c1 = new Car();

    }
}
