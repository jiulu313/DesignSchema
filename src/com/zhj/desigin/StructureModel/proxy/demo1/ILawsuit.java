package com.zhj.desigin.StructureModel.proxy.demo1;

/**
 * 诉讼接口类
 * 4个方法很简单，诉讼的一般流程
 */
public interface ILawsuit {
    //提交申请
    void submit();
    //进行举证
    void burden();
    //开始辨护
    void defend();
    //诉讼完成
    void finish();
}
