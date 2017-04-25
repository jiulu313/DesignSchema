package com.zhj.desigin.StructureModel.proxy.demo1;

/**
 * 代理律师
 */
public class Lawyer implements ILawsuit{
    //持有一个具体的被代理者的引用
    private ILawsuit mLawsuit;

    public Lawyer(ILawsuit lawsuit){
        mLawsuit = lawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }
}
