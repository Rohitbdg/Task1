package com.cashrich.task1;

/**
 * Created by Rohit33 on 13-04-2017.
 */

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class BankAdapter extends RecyclerView.Adapter<BankAdapter.MyViewHolder> {

    private List<Bank> bankList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name,fund,current,withdraw,currenttext,withdrawtext;
        public ImageView bankimg;
        public RelativeLayout llayout;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.bank_name);
            fund = (TextView) view.findViewById(R.id.bank_fund);
            current = (TextView) view.findViewById(R.id.rs);
            withdraw = (TextView) view.findViewById(R.id.withdraw_rs);
            bankimg=(ImageView)view.findViewById(R.id.bank_img);
            currenttext=(TextView)view.findViewById(R.id.amt);
            withdrawtext=(TextView)view.findViewById(R.id.withdraw_amt);
            llayout=(RelativeLayout)view.findViewById(R.id.bank_item);

        }
    }


    public BankAdapter(List<Bank> bankList) {
        this.bankList= bankList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bank_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Bank bank=bankList.get(position);
        holder.bankimg.setImageResource(bank.getImg());
        holder.name.setText(bank.getName());
        holder.fund.setText(bank.getFund());
        holder.current.setText(bank.getCurrent());
        holder.withdraw.setText(bank.getWithdraw());
        String color=bank.getColor();
        switch (color){
            case "red": holder.llayout.setBackgroundResource(R.drawable.selector);
                        break;
            case "blue": holder.llayout.setBackgroundResource(R.drawable.blueborder);
                        break;

        }

    }

    @Override
    public int getItemCount() {
        return bankList.size();
    }
}