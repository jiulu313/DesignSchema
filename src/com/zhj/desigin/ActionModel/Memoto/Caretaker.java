package com.zhj.desigin.ActionModel.Memoto;

/**
 * Created by zhanghongjun on 16/10/20.
 */
public class Caretaker {
    private Memoto memoto;


    public void saveMemoto(Memoto memoto){
        this.memoto = memoto;
    }

    public Memoto getMemoto(){
        return memoto;
    }

}
