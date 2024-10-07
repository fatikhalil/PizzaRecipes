package pizza.lachgar.ma.pizzarecipes.classes;

public class Produit {
    private int id=0;
    private String name;
    private int servings;
    private int imageResourceId; // ID de la ressource de l'image
    private String cookingTime;
    private String ingredients;
    private String description;
    private String recipe;

    public Produit(String name, int servings, int imageResourceId, String cookingTime, String ingredients, String description, String recipe) {
        this.id++;
        this.name = name;
        this.servings = servings;
        this.imageResourceId = imageResourceId; // Initialisation
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
        this.description = description;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public int getServings() {
        return servings;
    }
    public int getId(){
        return id;
    }

    public int getImageResourceId() {
        return imageResourceId; // Méthode pour obtenir l'ID de l'image
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }
}
