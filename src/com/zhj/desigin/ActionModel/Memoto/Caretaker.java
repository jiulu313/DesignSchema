package com.zhj.desigin.ActionModel.Memoto;

/**
 * 管理备忘录的,有可能很很多个备忘录,该例子中只有一个
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
