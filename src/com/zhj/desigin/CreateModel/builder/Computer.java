package com.zhj.desigin.CreateModel.builder;

/**
 * 组装一台电脑，需要安装硬盘，CPU，和内存条
 * 一台电脑
 */
public class Computer {
    protected String HDD;       //硬盘
    protected String CPU;       //CPU
    protected String MEM;       //内存条

    public Computer(String hdd,String cpu,String memory){
        this.HDD = hdd;
        this.CPU = cpu;
        this.MEM = memory;
    }


    @Override
    public String toString() {
        return "HDD="+HDD+" CPU="+CPU+" MEM="+MEM;
    }

    /*
        内部有一个静态的ComputerBuilder类
        ComputerBuilder内部的属性和Computer中是一样的
        或者和Computer的子类中的属性是一样的
    */
    public static class ComputerBuilder{
        protected String HDD;       //硬盘
        protected String CPU;       //CPU
        protected String MEM;       //内存条

        //设置HDD
        ComputerBuilder setHDD(String hdd){
            this.HDD = hdd;
            return this;
        }

        //设置CPU
        ComputerBuilder setCPU(String cpu){
            this.CPU = cpu;
            return this;
        }

        //设置MEM
        ComputerBuilder setMEM(String mem){
            this.MEM = mem;
            return this;
        }

        //创建一个Computer
        Computer build(){
            return new Computer(this.HDD,this.CPU,this.MEM);
        }
    }

}
