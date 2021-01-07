
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookTime) {
        this.name = name;
        this.cookingTime = cookTime;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookTime() {
        return this.cookingTime;
    }
    
    public int ingredientListSize() {
        return this.ingredients.size();
    }
    
    public String getIngredient(int index) {
        return this.ingredients.get(index);
    }
    
    @Override
    public String toString() {
        return getName() + ", cooking time: " + getCookTime();
    }
}
