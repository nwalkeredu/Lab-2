package ssu.cs370.lab2.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ssu.cs370.lab2.R;
import ssu.cs370.lab2.model.RecipeModel;

public class SearchActivity extends AppCompatActivity {

    private EditText searchEditText;
    private Button searchButton;
    private TextView recipeNameTextView;
    private TextView recipeCuisineTextView;
    private TextView recipeDescriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchEditText = (EditText)findViewById(R.id.searchEditText);
        searchButton = (Button)findViewById(R.id.searchButton);
        recipeNameTextView = (TextView)findViewById(R.id.recipeNameTextView);
        recipeCuisineTextView = (TextView)findViewById(R.id.recipeCuisineTextView);
        recipeDescriptionTextView = (TextView)findViewById(R.id.recipeDescriptionTextView);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RecipeModel ClickRecipe = new RecipeModel();
                ClickRecipe = getMockRecipeData();

                String mockName = ClickRecipe.getRecipeName();
                recipeNameTextView.setText(mockName);
                String mockCuisine = ClickRecipe.getRecipeCuisine();
                recipeCuisineTextView.setText(mockCuisine);
                String mockDesc = ClickRecipe.getRecipeDescription();
                recipeDescriptionTextView.setText(mockDesc);




            }
        });
    }

    private RecipeModel getMockRecipeData() {
        RecipeModel mockRecipe = new RecipeModel();
        mockRecipe.setRecipeName("Chicken Teriakyi");
        mockRecipe.setRecipeDescription("Great basic Chicken Teriyaki recipe. Better than the bottled stuff.");
        mockRecipe.setRecipeCuisine("Japanese");
        mockRecipe.setRecipeCategory("Main Dish");
        mockRecipe.setRecipePrimaryIngredient("Chicken");
        mockRecipe.setRecipeReviewCount(34);
        mockRecipe.setRecipeStarRating(4.5);
        mockRecipe.setRecipeImageURL("http://redirect.bigoven.com/pics/rs/640/chicken-teriyaki-10.jpg");

        return mockRecipe;
    }



}
