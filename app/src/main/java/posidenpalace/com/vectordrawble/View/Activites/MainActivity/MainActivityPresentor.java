package posidenpalace.com.vectordrawble.View.Activites.MainActivity;

/**
 * Created by Android on 7/12/2017.
 */

public class MainActivityPresentor implements MainActivityContract.Presenter {

    MainActivityContract.View view;
    @Override
    public void addView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;

    }



    @Override
    public void setToastString(String Message) {
        view.makeToast(Message);
    }
}
