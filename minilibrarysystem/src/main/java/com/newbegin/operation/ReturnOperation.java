package com.newbegin.operation;

import com.newbegin.book.Book;
import com.newbegin.book.BookRepository;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookRepository repo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要归还的书名: ");
        String name = scanner.nextLine();
        int size = repo.getSize();
        // 在书架上查找这本书
        for(int i = 0;i<size;++i){
            Book book = repo.getBooks(i);
            if (book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("成功归还!");
                return;

            }
        }
        System.out.println("抱歉, 此书不在归还范围中: "+name);
    }
}
