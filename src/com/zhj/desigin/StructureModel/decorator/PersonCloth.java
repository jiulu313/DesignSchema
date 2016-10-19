package com.zhj.desigin.StructureModel.decorator;

/**
 * Created by zhanghongjun on 16/10/19.
 */
public abstract class PersonCloth extends Person{
    protected Person mPerson;

    public PersonCloth(Person person){
        mPerson = person;
    }

    @Override
    public void dressed() {
        mPerson.dressed();
    }
}
