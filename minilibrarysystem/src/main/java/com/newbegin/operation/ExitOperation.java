package com.newbegin.operation;

import com.newbegin.book.BookRepository;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookRepository repo) {
        System.out.println("正在退出系统...");
        // 结束当前正在运行中的Java虚拟机
        System.exit(0);
    }
}
