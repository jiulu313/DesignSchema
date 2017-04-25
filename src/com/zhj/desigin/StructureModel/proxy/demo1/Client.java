package com.zhj.desigin.StructureModel.proxy.demo1;

/**
 * 客户端类
 */
public class Client {

    public static void main(String[] args){
        //构造一个小明
        ILawsuit xiaomin = new XiaoMin();

        //构造一个律师并将小明作为构造参数传递进去
        ILawsuit lawyer = new Lawyer(xiaomin);

        //律师提交诉讼
        lawyer.submit();

        //律师进行举证
        lawyer.burden();

        //律师代替小明进行辩护
        lawyer.defend();

        //完成诉讼
        lawyer.finish();
    }

}
