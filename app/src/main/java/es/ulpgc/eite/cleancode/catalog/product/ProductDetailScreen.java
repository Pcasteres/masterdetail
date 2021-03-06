package es.ulpgc.eite.cleancode.catalog.product;

import android.support.v4.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.catalog.app.CatalogMediator;


public class ProductDetailScreen {

  public static void configure(ProductDetailContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    CatalogMediator mediator = (CatalogMediator) context.get().getApplication();
    ProductDetailState state = mediator.getProductDetailState();

    ProductDetailContract.Router router = new ProductDetailRouter(mediator);
    ProductDetailContract.Presenter presenter = new ProductDetailPresenter(state);
    ProductDetailModel model = new ProductDetailModel();
    presenter.injectView(new WeakReference<>(view));
    presenter.injectModel(model);
    presenter.injectRouter(router);
    view.injectPresenter(presenter);

  }

}
