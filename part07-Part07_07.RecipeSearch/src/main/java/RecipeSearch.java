
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String name = fileReader.nextLine();
                int cookTime = Integer.valueOf(fileReader.nextLine());
                recipes.add(new Recipe(name, cookTime));
                
                while (true) {
                    String ingredient = fileReader.nextLine();
                    if (ingredient.equals("")) {
                        break;
                    }
                    recipes.get(recipes.size() - 1).addIngredient(ingredient);
                }
            }
        } catch (Exception e) {
            
        }
        
        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("list")) {
                System.out.println();
                System.out.println("Recipes:");
                listRecipes(recipes);
            }
            if (input.equals("find name")) {
                System.out.print("Searched word: ");
                String findName = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                findRecipeByName(recipes, findName);
            }
            if (input.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println();
                System.out.println("Recipes:");
                findRecipeByCookingTime(recipes, maxCookingTime);
            }
            if (input.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println();
                System.out.println("Recipes:");
                findRecipeByIngredient(recipes, ingredient);
            }
        }
    }
    
    public static void listRecipes(ArrayList<Recipe> recipes) {
        for (Recipe recipe: recipes) {
            System.out.println(recipe);
        }
    }
    
    public static void findRecipeByName(ArrayList<Recipe> recipes, String searchFor) {
        for (Recipe recipe: recipes) {
            if (recipe.getName().contains(searchFor)) {
                System.out.println(recipe);
            }
        }
    }
    
    public static void findRecipeByCookingTime(ArrayList<Recipe> recipes, int maxCookingTime) {
        for (Recipe recipe: recipes) {
            if (recipe.getCookTime() <= maxCookingTime) {
                System.out.println(recipe);
            }
        }
    }

    public static void findRecipeByIngredient(ArrayList<Recipe> recipes, String ingredient) {
        for (Recipe recipe: recipes) {
            for (int i = 0; i < recipe.ingredientListSize(); i++) {
                if (recipe.getIngredient(i).equals(ingredient)) {
                    System.out.println(recipe);
                }
            }
        }
    }
}
