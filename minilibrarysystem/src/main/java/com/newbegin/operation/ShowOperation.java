package com.newbegin.operation;

import com.newbegin.book.BookRepository;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookRepository repo) {
        // 获取书架上书的数量
        int size = repo.getSize();
        System.out.println("显示图书：");
        // 打印书籍
        for(int i = 0; i<size;++i){
            System.out.println(repo.getBooks(i));
        }
    }
}
