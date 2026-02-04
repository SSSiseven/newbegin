package com.newbegin;

import com.newbegin.book.Book;
import com.newbegin.user.AdminUser;
import com.newbegin.user.User;

public class Main {
    public static void main(String[] args) {
        //Book book = new Book("PyTorch深度学习实战", "伊莱", 119.9, "IT",false);
        User user = new AdminUser("fcc");
        new LibraryController().start(user);
    }
}