public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke",1.50);
//        coke.setSize("LARGE");
//        coke.printItem();
//
//       Burger burger = new Burger("regular", 5.00);
//       burger.addToppings("BACON", "CHEESE", "KETCHUP");
//       burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("bacon", "cheese", "ketchup");
//        regularMeal.setDrinkSize("large");
//        regularMeal.printItemizedList();
//
//        MealOrder meal = new MealOrder("Turkey", "7-up", "chili");
//        meal.addBurgerToppings("lettuce", "bacon", "mayo");
//        meal.setDrinkSize("small");
//        meal.printItemizedList();

        MealOrder db = new MealOrder("Deluxe", "Coke","fries" );
        db.addBurgerToppings("Avocado", "Bacon", "Ketchup", "Mayo", "Lettuce");
        db.setDrinkSize("Large");
        db.printItemizedList();

    }
}