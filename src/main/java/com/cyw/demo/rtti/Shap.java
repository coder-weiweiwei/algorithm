package com.cyw.demo.rtti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @auther: chenyw
 * @time: 2020/8/19
 * @description:
 */
public abstract class Shap {
    void draw(){
        System.out.println(this + "draw()");
    }
    abstract public String toString();

    public static void main(String[] args) {
        List<Shap> shaps = Arrays.asList(new Circle(),new Square());
        for (Shap shap:shaps){
            shap.draw();
            System.out.println(shap);
        }
    }
}

class Circle extends Shap{
    @Override
    public String toString() {
        return "circle";
    }
}

class Square extends Shap {

    @Override
    public String toString() {
        return "square";
    }
}


