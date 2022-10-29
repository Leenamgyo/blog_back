import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

abstract public class Pizza{
    String name; 
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    public void prepare(){
        System.out.println("준비 중" + name);
        System.out.println("도우를 돌리는 중...");
        System.out.println("소스를 뿌리는 중...");
        System.out.println("토핑을 올리는 중...");
        for (String topping: toppings) {
            System.out.println(" "+ topping);
        }
    };
    public void bake() {
        System.out.println("175도에서 25분간 굽기");
    };
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    };
    public void box() {
        System.out.println("상자에 피자 넣기");
    };
    public String getName() {
        return name;
    }
}

class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "뉴욕 스타일 소스와 치즈 피자";
        dough = "씬 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 레지아노 치즈")
    }
}

class ChiCagoStyleCheesePizza extends Pizza {
    public ChiCagoStyleCheesePizza() {
        name = "시카고 스타일 딥 디쉬 치즈 피자";
        dough = "아주 두꺼운 크러스트 도우";
        sauce = "플럼토마토 소스";

        toppings.add("잘게 잘라낸 모짜렐라 치즈");

    }

    public void cut(){
        System.out.println("네모난 모양으로 피자 자르기");
    }
}

class CheesePizza extends Pizza {}
class PepperoniPizza extends Pizza {}
class ClamPizza extends Pizza {}
class VeggiePizza extends Pizza {}

