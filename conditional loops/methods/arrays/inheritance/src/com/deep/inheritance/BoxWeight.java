package com.deep.inheritance;

public class BoxWeight extends Box {
    double weight;

     public BoxWeight(){
         this.weight = -1;
     }
    public BoxWeight(BoxWeight other){
         super(other);
        this.weight = other.weight;
    }

    public BoxWeight(double l,double w,double h,double weight){
         super(l,w,h);
        this.weight = weight;

    }


}
