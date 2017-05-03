package com.zhj.desigin.StructureModel.decorator;

/**
 * 便宜的衣服
 */
public class CheapCloth extends PersonCloth{
    public CheapCloth(Person person) {
        super(person);
    }

    //穿短裤
    public void dressShorts(){
        System.out.println("穿了短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
