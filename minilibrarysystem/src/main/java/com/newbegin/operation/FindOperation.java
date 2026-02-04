package com.newbegin.operation;

import com.newbegin.book.Book;
import com.newbegin.book.BookRepository;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookRepository repo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的书名: ");
        String name = scanner.nextLine();
        int size = repo.getSize();
        // 在书架上查找这本书
        for(int i = 0;i<size;++i){
            Book book = repo.getBooks(i);
            if (book.getName().equals(name)) {
                System.out.println("这本书的信息如下：");
                System.out.println(book);
                return;

            }
        }
        System.out.println("此书不存在 ");
    }
}
