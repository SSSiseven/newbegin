package com.newbegin.user;

import com.newbegin.operation.*;

public class AdminUser extends User{
    public AdminUser(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new ExitOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation()
        };
    }

    @Override
    public void menu() {
        System.out.println("1. Add 2. Del 3. Show 0. Exit");
    }
}
