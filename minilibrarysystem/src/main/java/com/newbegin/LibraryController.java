package com.newbegin;

import com.newbegin.book.BookRepository;
import com.newbegin.user.User;

import java.util.Scanner;

// 调度中心，不干活，只调度
public class LibraryController {
    private BookRepository repo = new BookRepository();

    public void start(User user){
        while(true){
            user.menu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            user.operations[choice].work(repo);
        }
    }
}
