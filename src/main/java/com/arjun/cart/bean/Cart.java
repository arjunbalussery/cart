package com.arjun.cart.bean;

import java.util.List;

public class Cart
{
    private int totaltems;
    private double totalPrice;

    List<Product>products;


    public Cart(int totaltems, double totalPrice, List<Product> products)
    {
        this.totaltems = totaltems;
        this.totalPrice = totalPrice;
        this.products = products;
    }


    public int getTotaltems()
    {
        return totaltems;
    }


    public void setTotaltems(int totaltems)
    {
        this.totaltems = totaltems;
    }


    public List<Product> getProducts()
    {
        return products;
    }


    public void setProducts(List<Product> products)
    {
        this.products = products;
    }


    public double getTotalPrice()
    {
        return totalPrice;
    }


    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }
}
