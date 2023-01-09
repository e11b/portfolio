package L103_CompChallenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen montorio = new SmartKitchen();

//        montorio.getDishWasher().setHasWorkToDo(true);
//        montorio.getFridge().setHasWorkToDo(true);
//        montorio.getKeurig().setHasWorkToDo(true);
//
//        montorio.getDishWasher().doDishes();
//        montorio.getFridge().orderFood();
//        montorio.getKeurig().brewCoffee();


        montorio.setKitchenState(true);
        montorio.doKitchenWork();

        montorio.setKitchenState(true, false, true);
        montorio.doKitchenWork();
    }
}
