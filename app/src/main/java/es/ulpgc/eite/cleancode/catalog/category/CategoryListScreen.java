package es.ulpgc.eite.cleancode.catalog.category;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

public class CategoryListScreen {

    public static void configure(CategoryListContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        CategoryListState state = mediator.getCategoryState();

        CategoryListContract.Router router = new CategoryListRouter(mediator);
        CategoryListContract.Presenter presenter = new CategoryListPresenter(state);
        CategoryListContract.Model model = new CategoryListModel();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
