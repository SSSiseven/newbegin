package com.newbegin.operation;

import com.newbegin.book.Book;
import com.newbegin.book.BookRepository;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(BookRepository repo) {
        // 获得书名
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入书名：");
        String name = scanner.nextLine();
        // 用书名判断书架上是否有此书
        int size = repo.getSize();
        for(int i =0;i<size;++i){
            Book book = repo.getBooks(i);
            if(book.getName().equals(name)){// 存在
                System.out.println("此书已经存在");
                return;
            }
        }
        // 不存在
        System.out.print("请输入作者：");
        String author = scanner.nextLine();
        System.out.print("请输入价格：");
        double price = scanner.nextDouble();
        System.out.print("请输入类型：");
        String type = scanner.nextLine();
        Book book = new Book(name, author, price, type,false);
        repo.setBooks(book,size);
        repo.setSize(++size);
        System.out.println("设置成功");

    }
}
