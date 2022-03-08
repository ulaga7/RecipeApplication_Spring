package com.recipes.recipe.service.impl;

import com.recipes.recipe.entity.Category;
import com.recipes.recipe.entity.Ingredient;
import com.recipes.recipe.entity.Recipe;
import com.recipes.recipe.repository.CategoryRepository;
import com.recipes.recipe.repository.RecipeRepository;
import com.recipes.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Transactional
@Service("RecipeService")

public class RecipeServiceImpl implements RecipeService {
    @Autowired
    private RecipeRepository recipeRepository ;
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public  Iterable<RecipeView> getAllRecipes(int page, int limit){
        Pageable paging= PageRequest.of(page, limit);
        Page<Recipe> pagedResult=recipeRepository.findAll(paging);
        List<HeadView> headViews = new ArrayList<>();
        List<RecipeView> recipeView=new ArrayList<>();
        List<AmtView> ingredientView=new ArrayList<>();
        for (Recipe recipe: pagedResult) {
            HeadView view = new HeadView();
            StepView sview=new StepView();
            QtyView qview=new QtyView();
            AmtView aview=new AmtView();
            RecipeView rview=new RecipeView();
            IngredientView iview=new IngredientView();
            Set<Category> category = recipe.getRecipe_categories();
            Set<Ingredient> ingredient=recipe.getIngredient();
            for (Ingredient ing:ingredient) {
                qview.setQty(ing.getQty());
                qview.setUnit(ing.getUnit());
                aview.setAmt(qview);
                aview.setItems(ing.getItem());
                ingredientView.add(aview);
            }

            CategoryViewForrecipe categoryViewForrecipe = new CategoryViewForrecipe();
            for (Category cat:category) {
                categoryViewForrecipe.addCategoryName(cat.getName());
            }
            view.setCategories(categoryViewForrecipe);
            view.setTitle(recipe.getTitle());
            sview.setStep(recipe.getSteps());

            rview.setHead(view);
            view.setYield(recipe.getYield());
            rview.setDirections(sview);
            iview.setIng(ingredientView);
            rview.setIngredients(iview);


           // headViews.add(view);
            recipeView.add(rview);

        }
        return recipeView;
    }

@Override
    public Iterable<CategoryView> getAllCategories() {
        Iterable<Category> categories=categoryRepository.findAll();
        List<CategoryView> categoryNames=new ArrayList<>();
        CategoryView categoryView=new CategoryView();
    for (Category cat:categories) {
        categoryView.addCategoryName(cat.getName());
    }
    categoryNames.add(categoryView);
    return categoryNames;


}




}
