package es.ulpgc.eite.cleancode.catalog.app;

import android.app.Application;

import es.ulpgc.eite.cleancode.catalog.category.CategoryListState;
import es.ulpgc.eite.cleancode.catalog.product.ProductDetailState;
import es.ulpgc.eite.cleancode.catalog.products.ProductListState;

public class CategoryMediator extends Application {
    private CategoryListState categoryListState = new CategoryListState();
    private ProductListState productListState = new ProductListState();

    private CategoryItem category;


    public ProductListState getCategoryListState() {
        return productListState;
    }


    public CategoryItem getCategory() {
        CategoryItem item = category;
        //product = null;
        return item;
    }


    public void setCategory(CategoryItem item) {
        category = item;
    }

}

}
