package posidenpalace.com.vectordrawble.View.Activites.MainActivity;

import posidenpalace.com.vectordrawble.View.Activites.BasePresenter;
import posidenpalace.com.vectordrawble.View.Activites.BaseView;

/**
 * Created by Android on 7/12/2017.
 */

public interface MainActivityContract {
    interface View extends BaseView{
        void makeToast(String mesage);

    }

    interface Presenter extends BasePresenter<View>{
        void setToastString(String Message);
    }
}
