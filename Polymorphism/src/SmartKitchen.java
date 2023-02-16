public class SmartKitchen {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();
//
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);;
//        kitchen.getBrewMaster().brewCoffee();
//        kitchen.getFridge().setHasWorkToDo(true);
//        kitchen.getDishWasher().doDishes();
//

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }

    private CoffeeMaker brewMaster;
    private Refrigerator fridge;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        fridge = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {

        brewMaster.setHasWorkToDo(coffeeFlag);
        fridge.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);


    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        fridge.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

//    public CoffeeMaker(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Brewing Coffee!");
            hasWorkToDo = false;
        }
    }
}


class DishWasher {
    private boolean hasWorkToDo;

//    public CoffeeMaker(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Doing the Dishes");
            hasWorkToDo = false;
        }
    }
}


class Refrigerator {
    private boolean hasWorkToDo;

//    public CoffeeMaker(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Ordering Food!");
            hasWorkToDo = false;
        }
    }
}


