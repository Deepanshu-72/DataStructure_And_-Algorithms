package com.deep.inheritance;

public class BoxPrice extends  BoxWeight{
    double price;

    BoxPrice(){
        this.price =-1;
    }
    BoxPrice(double price){
        this.price = price;
    }

    BoxPrice(double l,double w,double h,double weight,double price){
        super(l,w,h,weight);
        this.price =price;

    }

    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }

    public static void main(String[] args) {
        BoxPrice b1 = new BoxPrice(1,2,3,8,99);
        System.out.println(b1.l);
        BoxPrice b2 = new BoxPrice(b1);
        System.out.println(b2.w);
        Box B1 = new BoxPrice(b1);
    }


}
