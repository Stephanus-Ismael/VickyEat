package com.dev.vickyeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.dev.vickyeat.Adaptor.CategoryAdaptor;
import com.dev.vickyeat.Domain.CategoryDomain;
import com.dev.vickyeat.Domain.FoodDomain;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerViewCategory();
        recyclerViewPopular();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Breakfast", "cat_1"));
        category.add(new CategoryDomain("Lunch", "cat_2"));
        category.add(new CategoryDomain("Fast Food", "cat_3"));
        category.add(new CategoryDomain("Drinks", "cat_4"));

        adapter = new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
    }
    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPopularList=findViewById(R.id.recycleView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<FoodDomain> foodList=new ArrayList<>();
        foodList.add(new FoodDomain( "Pepperoni pizza", "pizza1", "Slices pepperoni, mozzerella cheese, fresh oregano, ground black pepper, pizza sauce", 10.85));
        foodList.add(new FoodDomain( "Cheese Burger", "burger", "Beef, Gouda Cheese, Special Sauce, Lettuce, Tomato", 25.50));
        foodList.add(new FoodDomain( "Vegetable pizza", "pizza2", "Olive Oil, Vegetable Oil, Pitted Kalamata, Cherry Tomatoes, fresh oregano, Basil", 8.72));

        recyclerViewPopularList.setAdapter(adapter2);
    }
}