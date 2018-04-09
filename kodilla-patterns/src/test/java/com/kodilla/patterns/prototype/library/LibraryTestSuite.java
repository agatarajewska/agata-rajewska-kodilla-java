package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;


public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given

        Book book1 = new Book("Hobbit", "Tolkien", LocalDate.now());
        Book book2 = new Book("Wladca pierscieni Tom 1", "Tolkien", LocalDate.now());
        Book book3 = new Book("Wladca pierscieni Tom 2", "Tolkien", LocalDate.now());
        Book book4 = new Book("Wladca pierscieni Tom 3", "Tolkien", LocalDate.now());

        //creating the library
        Library library = new Library("Bibliotek publiczna");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //making a shallow copy of library

        Library clondedLibrary = null;
        try{
            clondedLibrary = library.shallowCopy();
            clondedLibrary.setName("Library 2");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of library

        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 2");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }

        //When

        library.getBooks().remove(book1);

        //Then

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clondedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());

    }

}
