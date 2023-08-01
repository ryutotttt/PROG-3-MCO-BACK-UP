import java.util.Scanner;

public class CustomizableSandwich {

    public static void customizeSandwich() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Customizing Sandwich...");
        System.out.println("Available Ingredients: ");
        System.out.println("1 - Chicken Breast");
        System.out.println("2 - Cheese");
        System.out.println("3 - Bread");
        System.out.println("4 - Deli Ham");
        System.out.println("0 - Finish Customization");

        float totalCalories = 0;
        String customization = "";

        while (true) {
            System.out.print("Enter the ingredient number (0 to finish customization): ");
            int ingredientNumber = sc.nextInt();
            sc.nextLine(); 

            if (ingredientNumber == 0) {
                break;
            } else if (ingredientNumber >= 1 && ingredientNumber <= 4) {
                String ingredient = getIngredientName(ingredientNumber);
                int calories = getIngredientCalories(ingredientNumber);
                totalCalories += calories;
                customization += ingredient + ", ";
            } else {
                System.out.println("Invalid ingredient number.");
            }
        }

        if (!customization.isEmpty()) {
            System.out.println("Toasting the bread...");
            System.out.println("Slicing the Cheese...");
            System.out.println("Adding the chicken breast...");
            System.out.println("Spreading the mayonnaise...");
            System.out.println("Assembling the sandwich...");
            System.out.println("Sandwich Done!");
            System.out.println("Customization: " + customization.substring(0, customization.length() - 2));
            System.out.println("Total Calories: " + totalCalories);
        } else {
            System.out.println("No ingredients selected. Customization canceled.");
        }

        sc.close();
    }

    private static String getIngredientName(int ingredientNumber) {
        switch (ingredientNumber) {
            case 1:
                return "Chicken Breast";
            case 2:
                return "Cheese";
            case 3:
                return "Bread";
            case 4:
                return "Deli Ham";
            default:
                return "";
        }
    }

    private static int getIngredientCalories(int ingredientNumber) {
        switch (ingredientNumber) {
            case 1:
                return 100;
            case 2:
                return 50;
            case 3:
                return 80;
            case 4:
                return 70;
            default:
                return 0;
        }
    }
}