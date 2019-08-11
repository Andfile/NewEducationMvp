package com.example.neweducationmvp.model;

import com.example.neweducationmvp.model.entity.DataModel;

import java.util.List;

public interface DataSourceCallback {

    void onDataReceive(List<DataModel> data);
}
