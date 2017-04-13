package com.cashrich.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Bank> bankList= new ArrayList<>();
    private RecyclerView recyclerView;
    private BankAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new BankAdapter(bankList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(mAdapter);

        prepareBankData();
    }

    private void prepareBankData(){
        Bank bank=new Bank(R.drawable.hdfc,"HDFC","ABC Mutual Funds","₹ 3500.00","₹ 3500.00","red");
        bankList.add(bank);
        bank=new Bank(R.drawable.sbi,"SBI","XYZ Mutual Funds","\u20B9 5000.45","₹ 1500.00","blue");
        bankList.add(bank);
    }
}
