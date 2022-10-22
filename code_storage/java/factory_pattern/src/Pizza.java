
abstract public class Pizza{
    public void prepare(){
        System.out.println("재료 준비");
    };
    public void bake() {
        System.out.println("베이킹");
    };
    public void cut() {
        System.out.println("Cutting");
    };
    public void box() {
        System.out.println("Boxing");
    };
}

class CheesePizza extends Pizza {}
class PepperoniPizza extends Pizza {}
class ClamPizza extends Pizza {}
class VeggiePizza extends Pizza {}

