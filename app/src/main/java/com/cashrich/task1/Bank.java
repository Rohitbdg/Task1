package com.cashrich.task1;

/**
 * Created by Rohit33 on 13-04-2017.
 */

public class Bank {
    private String name,fund,current,withdraw,color;
    int img;
    public Bank(){}

    public Bank(int i,String n,String f,String c,String w,String col){
        img=i;
        name=n;
        fund=f;
        current=c;
        withdraw=w;
        color=col;
    }

    public String getColor(){
        return color;
    }

    public int getImg(){
        return img;
    }
    public void setImg(int i){
        img=i;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }

    public String getFund(){
        return fund;
    }
    public void setFund(String f){
        fund=f;
    }

    public String getCurrent(){
        return current;
    }
    public void setCurrent(String c){
       current=c;
    }

    public String getWithdraw(){
        return withdraw;
    }
    public void setWithdraw(String w){
        withdraw=w;
    }
}
