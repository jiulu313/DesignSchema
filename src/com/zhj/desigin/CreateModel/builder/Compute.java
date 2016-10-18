package com.zhj.desigin.CreateModel.builder;

/**
 * Created by zhanghongjun on 16/10/18.
 *
 * 一台电脑
 */
public class Compute {
    protected String HDD;       //硬盘
    protected String CPU;       //CPU
    protected String MEM;       //内存条

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMEM() {
        return MEM;
    }

    public void setMEM(String MEM) {
        this.MEM = MEM;
    }


    @Override
    public String toString() {
        return "HDD="+HDD+" CPU="+CPU+" MEM="+MEM;
    }
}
