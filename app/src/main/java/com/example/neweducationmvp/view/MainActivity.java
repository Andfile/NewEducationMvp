package com.example.neweducationmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.neweducationmvp.R;
import com.example.neweducationmvp.model.entity.DataModel;
import com.example.neweducationmvp.presenter.Presenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private Presenter presenter = new Presenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.subcribe(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.unsubcribe();
    }

    @Override
    public void updateView(List<DataModel> data) {

        //update recycler
    }
}
