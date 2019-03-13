package es.ulpgc.eite.cleancode.catalog.category;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.catalog.app.CategoryItem;
import es.ulpgc.eite.cleancode.catalog.app.ProductItem;

public class CategoryListModel implements CategoryListContract.Model {

    public static String TAG = CategoryListModel.class.getSimpleName();
    private final List<CategoryItem> itemList = new ArrayList<>();
    private final int COUNT = 20;

    public CategoryListModel() {
        for (int index = 1; index <= COUNT; index++) {
            addProduct(createProductList(index));
        }
    }

    private CategoryItem createProductList(int index) {
        String content = "ProductList " + position;

        return new CategoryItem(
                position, content, fetchCategoryDetails(position)
        );

    }

    private void addProduct(CategoryItem item) {
        itemList.add(item);
    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
}
