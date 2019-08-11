package com.example.neweducationmvp.view;

import com.example.neweducationmvp.model.entity.DataModel;

import java.util.List;

public interface Contract {

    interface View {
         void updateView(List<DataModel> data);
    }

    interface Presenter{
        void subcribe(Contract.View viewContract);
        void onItemClick(int id);
        void unsubcribe();
    }
}
