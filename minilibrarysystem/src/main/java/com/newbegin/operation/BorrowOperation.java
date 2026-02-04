package com.newbegin.operation;

import com.newbegin.book.Book;
import com.newbegin.book.BookRepository;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookRepository repo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要借阅的书名: ");
        String name = scanner.nextLine();
        int size = repo.getSize();
        // 在书架上查找这本书
        for(int i = 0;i<size;++i){
            Book book = repo.getBooks(i);
            if (book.getName().equals(name)) {
                if (!book.isBorrowed()) {
                    book.setBorrowed(true); //设置为已借阅
                    System.out.println("成功借阅!");
                    return;
                }
            }
        }
        System.out.println("抱歉, 暂无此书: "+name);
    }
}
