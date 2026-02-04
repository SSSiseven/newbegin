package com.newbegin.operation;

import com.newbegin.book.Book;
import com.newbegin.book.BookRepository;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookRepository repo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的书名：");
        String name = scanner.nextLine();

        int size = repo.getSize();
        int index = -1;
        // 在书架上查找这本书
        for(int i = 0;i<size;++i){
            Book book = repo.getBooks(i);
            if (book.getName().equals(name)) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("此书不存在!");
        }
        for(int i = index;i<size-1;++i){
            Book book = repo.getBooks(i + 1);
            repo.setBooks(book,i);
        }
        repo.setBooks(null,size-1);
        repo.setSize(--size);
        System.out.println("删除成功");

    }
}
