package com.zhj.desigin.StructureModel.facade;


/**
 *
 */
public class FacadeTest {
    public static void main(String[] args){
        test();
    }


    public static void test(){
        Facade facade = new Facade();
        facade.doSomething();
    }

    //正常情况下，这3个子系统需要配合才能完成一件事
    public static void testNormal(){
        SystemA systemA = new SystemA();
        SystemB systemB = new SystemB();
        SystemC systemC = new SystemC();

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
