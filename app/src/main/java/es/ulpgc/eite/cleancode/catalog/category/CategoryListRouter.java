package es.ulpgc.eite.cleancode.catalog.category;

import android.content.Intent;
import android.content.Context;

public class CategoryListRouter implements CategoryListContract.Router {

    public static String TAG = CategoryListRouter.class.getSimpleName();

    private AppMediator mediator;

    public CategoryListRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, CategoryListActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(CategoryListState state) {
        mediator.setCategoryState(state);
    }

    @Override
    public CategoryListState getDataFromPreviousScreen() {
        CategoryListState state = mediator.getCategoryState();
        return state;
    }
}
