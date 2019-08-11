package com.example.neweducationmvp.presenter;

import com.example.neweducationmvp.view.Contract;
import com.example.neweducationmvp.model.entity.DataModel;
import com.example.neweducationmvp.model.DataSourceCallback;
import com.example.neweducationmvp.model.DataSourceProvider;

import java.util.List;

public class Presenter implements Contract.Presenter {

    private Contract.View viewContract;
    private DataSourceProvider dataProvider;

    @Override
    public void subcribe(Contract.View contract) {
        this.viewContract = contract;
        dataProvider = new DataSourceProvider();
        dataProvider.getData(new DataSourceCallback() {
            @Override
            public void onDataReceive(List<DataModel> data) {
                viewContract.updateView(data);
            }
        });


        //call to model business
        //onCallback from business logic call update view

    }

    @Override
    public void onItemClick(int id) {

    }

    @Override
    public void unsubcribe() {
        viewContract = null;
        dataProvider = null;
    }
}
