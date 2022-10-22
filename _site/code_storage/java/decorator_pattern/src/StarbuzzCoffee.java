
abstract class Beverage {
    String description; 

    public String getDescription() {
        return description;
    }

    abstract public double cost(); 
}

abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}

class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    public double cost() {
        return 1.99;
    }
}

class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    public double cost() {
        return .89;
    }
}


class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "하우스 블렌드 커피";
    }

    public double cost() {
        return .79;
    }
}


class Mocha extends CondimentDecorator {
    
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
    
    public double cost() {
        return beverage.cost() + .20;
    }
}

class Soy extends CondimentDecorator {
    
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription()+ ", 두유";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return beverage.cost() + .31;
    } 

}

class Whip extends CondimentDecorator { 
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + ", 크림";
    }

    @Override
    public double cost() {
        // TODO Auto-generated method stub
        return beverage.cost() + .30;
    }

    
}

public class StarbuzzCoffee {
    public static void main(String[] args) throws Exception {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(
            beverage2.getDescription() + " $"+ beverage2.cost()
        );

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
            + " $"+ beverage3.cost()
        );
    }
}
