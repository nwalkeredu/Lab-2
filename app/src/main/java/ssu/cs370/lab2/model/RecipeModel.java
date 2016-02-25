package ssu.cs370.lab2.model;

public class RecipeModel {
// Name
    private String recipeName;

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

//Desc
    private String recipeDescription;

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

//Cuisine
    private String recipeCuisine;

    public String getRecipeCuisine() {
        return recipeCuisine;
    }

    public void setRecipeCuisine(String recipeCuisine) {
        this.recipeCuisine = recipeCuisine;
    }

//Category
    private String recipeCategory;

    public String getRecipeCategory() {
        return recipeCategory;
    }

    public void setRecipeCategory(String recipeCategory) {
        this.recipeCategory = recipeCategory;
    }

//PrimIngredient
    private String recipePrimaryIngredient;

    public String getRecipePrimaryIngredient() {
        return recipePrimaryIngredient;
    }

    public void setRecipePrimaryIngredient(String recipePrimaryIngredient) {
        this.recipePrimaryIngredient = recipePrimaryIngredient;
    }

//Review #
    private double recipeReviewCount;

    public double getRecipeReviewCount() {
        return recipeReviewCount;
    }

    public void setRecipeReviewCount(double recipeReviewCount) {
        this.recipeReviewCount = recipeReviewCount;
    }

//Rating #
    private double recipeStarRating;

    public double getRecipeStarRating() {
        return recipeStarRating;
    }

    public void setRecipeStarRating(double recipeStarRating) {
        this.recipeStarRating = recipeStarRating;
    }

//Image URL
    private String recipeImageURL;

    public String getRecipeImageURL() {
        return recipeImageURL;
    }

    public void setRecipeImageURL(String recipeImageURL) {
        this.recipeImageURL = recipeImageURL;
    }

}