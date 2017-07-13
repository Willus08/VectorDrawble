package posidenpalace.com.vectordrawble.View.Activites.MainActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import posidenpalace.com.vectordrawble.R;
import posidenpalace.com.vectordrawble.View.Activites.Inject.MainActivity.DaggerMainActivityComponent;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{
    @Inject MainActivityPresentor presentor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // set up variables like textViews etc
        setUpDaggerComponent();
        presentor.addView(this);
        //presenter.whatever

    }

    private void setUpDaggerComponent(){
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void makeToast(String mesage) {
        Toast.makeText(this, mesage, Toast.LENGTH_SHORT).show();
    }

    public void start(View view) {
        presentor.setToastString("Hello World");
    }
}
