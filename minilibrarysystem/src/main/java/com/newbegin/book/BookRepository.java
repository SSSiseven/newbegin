package com.newbegin.book;

public class BookRepository {
    private Book[] books;
    private int size;

    public BookRepository(){
        this.books = new Book[10];
        this.books[0] = new Book("三国演义","罗贯中",10,"小说",false);
        this.books[1] = new Book("西游记","吴承恩",9,"小说",false);
        this.books[2] = new Book("红楼梦","曹雪芹",19,"小说",false);
        this.size = 3;

    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book getBooks(int pos) {
        return books[pos];
    }

    public void setBooks(Book book,int pos) {
        books[pos] = book;
    }
}
