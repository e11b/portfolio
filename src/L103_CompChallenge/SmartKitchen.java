package L103_CompChallenge;

public class SmartKitchen {
    private CoffeeMaker keurig;
    private Refrigerator fridge;
    private DishWasher dishWasher;

    public SmartKitchen() {
        keurig = new CoffeeMaker();
        fridge = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getKeurig() {
        return keurig;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean startWork) {
        keurig.setHasWorkToDo(startWork);
        fridge.setHasWorkToDo(startWork);
        dishWasher.setHasWorkToDo(startWork);
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        keurig.setHasWorkToDo(coffeeFlag);
        fridge.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        keurig.brewCoffee();
        fridge.orderFood();
        dishWasher.doDishes();
    }


}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if (hasWorkToDo) {
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo) {
            System.out.println("Washing Dishes");
            hasWorkToDo = false;
        }
    }
}
