package com.newbegin.user;

import com.newbegin.operation.IOperation;

public abstract class User {
    public String name;
    public IOperation[] operations;

    public abstract void menu();
}
