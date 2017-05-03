package com.zhj.desigin.StructureModel.decorator;

/**
 * 装饰者
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
