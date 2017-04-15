package com.zhj.desigin.DesignPrinciples.principles3;

/**
 * Created by zhanghongjun on 2017/4/15.
 */

//View
public abstract class View {
    public abstract void draw();

    public void measure(int width,int height){
        //测量视图大小
    }
}

class Button extends View{

    @Override
    public void draw() {
        //绘制按钮
    }
}

class TextView extends View{

    @Override
    public void draw() {
        //绘制TextView
    }
}