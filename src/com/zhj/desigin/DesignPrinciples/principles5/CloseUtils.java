package com.zhj.desigin.DesignPrinciples.principles5;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by zhanghongjun on 2017/4/15.
 */

//关闭工具类
public class CloseUtils {
    private CloseUtils(){}

    //关闭Closeable对象
    public static void closeQuitely(Closeable closeable){
        if(closeable != null){
            try {
                closeable.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
