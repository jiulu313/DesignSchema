package com.zhj.desigin.CreateModel.builder;

/**
 * Created by zhanghongjun on 16/10/18.
 */
public abstract class Builder {
    Compute mComputer = null;

    public Builder(){
        mComputer = new Compute();
    }

    public abstract Builder setHDD(String hdd);
    public abstract Builder setCPU(String cpu);
    public abstract Builder setMEM(String mem);

    public abstract Compute build();
}
