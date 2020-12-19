package cl.zerodevelopment.sismoschile;

import java.util.List;

public class Presenter implements PresenterRepository {
    PresenterView view;
    Repository repository;

    public Presenter(PresenterView view, Repository repository) {
        this.view = view;
        this.repository = repository;

    }

    @Override
    public void showInfo(List<SismosLista> listaSismos) {
        view.showInfo(listaSismos);
    }
}
