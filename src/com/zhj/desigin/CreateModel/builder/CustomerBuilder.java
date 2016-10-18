package com.zhj.desigin.CreateModel.builder;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public class CustomerBuilder extends Builder{
    @Override
    public Builder setHDD(String hdd) {
        mComputer.setHDD(hdd);
        return this;
    }

    @Override
    public Builder setCPU(String cpu) {
        mComputer.setCPU(cpu);
        return this;
    }

    @Override
    public Builder setMEM(String mem) {
        mComputer.setMEM(mem);
        return this;
    }

    @Override
    public Compute build() {
        return mComputer;
    }
}
