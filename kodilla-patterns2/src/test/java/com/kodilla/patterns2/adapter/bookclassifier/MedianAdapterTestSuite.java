package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> setA = new HashSet<>();
        setA.add(new Book("aut1", "book1", 2015, "bk1"));
        setA.add(new Book("aut2", "book2", 2016, "bk2"));
        setA.add(new Book("aut1", "book3", 2017, "bk3"));
        setA.add(new Book("aut2", "book4", 2018, "bk4"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(setA);
        //Then
        System.out.println(median);
        assertEquals(median, 2017);
    }
}
