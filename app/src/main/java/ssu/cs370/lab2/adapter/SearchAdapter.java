package ssu.cs370.lab2.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

import ssu.cs370.lab2.model.RecipeModel;

public class SearchAdapter extends ArrayAdapter<RecipeModel>{

    public SearchAdapter(Context context, int resource, List<RecipeModel> objects) {
        super(context, resource, objects);
    }
}
