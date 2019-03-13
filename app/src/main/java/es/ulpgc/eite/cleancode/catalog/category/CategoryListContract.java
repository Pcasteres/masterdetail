package es.ulpgc.eite.cleancode.catalog.category;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.catalog.app.CategoryItem;

interface CategoryListContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(CategoryListViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();

        void fetchCategoryListData();

        void selectProductListData(CategoryItem item);
    }

    interface Model {
        String fetchData();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(CategoryListState state);

        CategoryListState getDataFromPreviousScreen();
    }
}
