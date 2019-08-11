package com.example.neweducationmvp.model;

import com.example.neweducationmvp.model.entity.DataModel;

import java.util.ArrayList;

public class DataSourceProvider {

    public void getData(DataSourceCallback callback) {

        //call to database
        if (callback != null) {
            callback.onDataReceive(new ArrayList<DataModel>());
        }
    }

}
