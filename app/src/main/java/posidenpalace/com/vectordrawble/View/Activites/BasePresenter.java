package posidenpalace.com.vectordrawble.View.Activites;

/**
 * Created by Android on 7/12/2017.
 */

public interface BasePresenter<V extends BaseView> {
    void addView(V view);
    void removeView();
}
