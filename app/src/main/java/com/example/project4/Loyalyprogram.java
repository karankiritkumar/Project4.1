package com.example.project4;

class Loyalyprogram
{


    private  String name;
    private  String bank;
    private  int point_balance;

    public Loyalyprogram(String name, String bank)
    {

        this.name = name;
        this.bank = bank;
        this.point_balance = 0;
    }

    public Loyalyprogram(String name, String bank, int point_balance)
    {
        this(name, bank);
        this.point_balance = point_balance;
    }

    public void diplay()
    {
        System.out.println(this.name + " - " + this.bank + " - " + this.point_balance);
    }
}

