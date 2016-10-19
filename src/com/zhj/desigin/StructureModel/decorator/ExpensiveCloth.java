package com.zhj.desigin.StructureModel.decorator;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public class ExpensiveCloth extends PersonCloth{
    public ExpensiveCloth(Person person) {
        super(person);
    }

    //穿了短袖
    private void dressShirt(){
        System.out.println("穿了短袖");
    }

    //穿了皮衣
    private void dressLeather(){
        System.out.println("穿了皮衣");
    }

    //穿了牛仔裤
    private void dressJean(){
        System.out.println("穿了牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
