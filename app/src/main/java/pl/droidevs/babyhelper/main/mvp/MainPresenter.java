package pl.droidevs.babyhelper.main.mvp;

public class MainPresenter {
    private MainView view;
    private MainModel model;

    public MainPresenter(MainView view, MainModel model ) {
        this.view = view;
        this.model = model;
    }

    public void onCreate(){
        view.showText(model.getTestText(0));
    }

    public void fabClick(){
        view.showText(model.getTestText());
    }

    public void onDestroy(){
        view = null;
    }
}
