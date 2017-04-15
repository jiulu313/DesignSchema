package com.zhj.desigin.DesignPrinciples.principles1;

/**
 * Created by zhanghongjun on 2017/4/15.
 */
public class TestAuthor {
    public static void main(String[] args){
        //作家
        Author author = new Author();

        //出版社
        Publisher publisher = new Publisher();

        //写了一本书
        String bookName = author.writeBook();

        //出版社出版这本书
        publisher.publishBook(bookName);
    }
}
