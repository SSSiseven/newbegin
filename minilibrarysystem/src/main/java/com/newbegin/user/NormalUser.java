package com.newbegin.user;

import com.newbegin.operation.*;

public class NormalUser extends User{

    public NormalUser(String name) {
        this.name = name;
        this.operations = new IOperation[]{
                new BorrowOperation(),
                new ReturnOperation(),
                new FindOperation(),
                new ShowOperation(),
                new ExitOperation()
        };
    }

    @Override
    public void menu() {
        System.out.println("1. Borrow 2. Return 3. Find 4. Show 0. Exit");
    }
}
