package com.mostafa_anter.appportfolio.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.mostafa_anter.appportfolio.R;
import com.mostafa_anter.appportfolio.R2;
import com.mostafa_anter.appportfolio.utils.AppPortfolioHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    @BindView(R2.id.toolbar)Toolbar toolbar;

    private final static String HEADER_OF_TOAST_MESSAGE = "This button will launch ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
    }

    // R2 used inside annotation :)
    @OnClick({R2.id.popularMovies, R2.id.stockHawk, R2.id.buildItBigger,
    R2.id.makeYourAppMaterial, R2.id.goUbiquitous, R2.id.capstone})
    public void doAction(View view){
        switch (view.getId()){
            case R.id.popularMovies:
                AppPortfolioHelper.showSnackbar(view, HEADER_OF_TOAST_MESSAGE +
                        getString(R.string.popular_movies));
                break;
            case R.id.stockHawk:
                AppPortfolioHelper.showSnackbar(view, HEADER_OF_TOAST_MESSAGE +
                        getString(R.string.stock_hawk));
                break;
            case R.id.buildItBigger:
                AppPortfolioHelper.showSnackbar(view, HEADER_OF_TOAST_MESSAGE +
                        getString(R.string.build_it_bigger));
                break;
            case R.id.makeYourAppMaterial:
                AppPortfolioHelper.showSnackbar(view, HEADER_OF_TOAST_MESSAGE +
                        getString(R.string.make_your_app_material));
                break;
            case R.id.goUbiquitous:
                AppPortfolioHelper.showSnackbar(view, HEADER_OF_TOAST_MESSAGE +
                        getString(R.string.go_ubiquitous));
                break;
            case R.id.capstone:
                AppPortfolioHelper.showSnackbar(view, HEADER_OF_TOAST_MESSAGE +
                        getString(R.string.capstone));
                break;

        }
    }
}
