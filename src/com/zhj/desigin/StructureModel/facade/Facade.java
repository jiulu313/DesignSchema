package com.zhj.desigin.StructureModel.facade;

/**
 *
 * 外观模式是一种使用频率非常高的结构型设计模式，
 * 它通过引入一个外观角色来简化客户端与子系统之间的交互，
 * 为复杂的子系统调用提供一个统一的入口，降低子系统与客户端的耦合度，且客户端调用非常方便
 */
public class Facade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();


    public void doSomething(){

        //这些子系统一块才能完成一个功能
        systemA.doSomething1();
        systemA.doSomething2();
        systemA.doSomething3();

        systemB.doSomething1();
        systemB.doSomething2();
        systemB.doSomething3();

        systemC.doSomething1();
        systemC.doSomething2();
        systemC.doSomething3();
    }
}
