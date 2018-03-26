package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticAnalyzerTestSuite {

    List<String> users;

    @Before
    public void setUp(){
        users = new ArrayList<>();
        users.add("Antoni");
        users.add("Barbara");
        users.add("Cezary");
        users.add("Danuta");
        users.add("Maciej");
        users.add("Wojciech");
        users.add("Karol");
        users.add("Basia");
    }

    @Test
    public void checkAvgZeroPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 0;
        int comments = 0;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When

        StatisticAnalyzer statisticAnalyzer = new StatisticAnalyzer();
        statisticAnalyzer.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(0, statisticAnalyzer.getAvgUserPosts(), 0);
        assertEquals(0, statisticAnalyzer.getAvgUserComments(), 0);
        assertEquals(0, statisticAnalyzer.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void checkAvgThousandPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 1000;
        int comments = 2000;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When

        StatisticAnalyzer statisticAnalyzer = new StatisticAnalyzer();
        statisticAnalyzer.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(125, statisticAnalyzer.getAvgUserPosts(), 0);
        assertEquals(250, statisticAnalyzer.getAvgUserComments(), 0);
        assertEquals(2, statisticAnalyzer.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void checkAvgZeroComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 1000;
        int comments = 0;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When

        StatisticAnalyzer statisticAnalyzer = new StatisticAnalyzer();
        statisticAnalyzer.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(125, statisticAnalyzer.getAvgUserPosts(), 0);
        assertEquals(0, statisticAnalyzer.getAvgUserComments(), 0);
        assertEquals(0, statisticAnalyzer.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void checkAvgPostsGreaterThanComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 2000;
        int comments = 1000;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When

        StatisticAnalyzer statisticAnalyzer = new StatisticAnalyzer();
        statisticAnalyzer.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(250, statisticAnalyzer.getAvgUserPosts(), 0);
        assertEquals(125, statisticAnalyzer.getAvgUserComments(), 0);
        assertEquals(0.5, statisticAnalyzer.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void checkAvgCommentsGreaterThanPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 2000;
        int comments = 4000;

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When

        StatisticAnalyzer statisticAnalyzer = new StatisticAnalyzer();
        statisticAnalyzer.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(250, statisticAnalyzer.getAvgUserPosts(), 0);
        assertEquals(500, statisticAnalyzer.getAvgUserComments(), 0);
        assertEquals(2, statisticAnalyzer.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void checkAvgZeroUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 2000;
        int comments = 4000;
        users.clear();

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When

        StatisticAnalyzer statisticAnalyzer = new StatisticAnalyzer();
        statisticAnalyzer.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(0, statisticAnalyzer.getAvgUserPosts(), 0);
        assertEquals(0, statisticAnalyzer.getAvgUserComments(), 0);
        assertEquals(2, statisticAnalyzer.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void checkAvgThousandUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        int posts = 2000;
        int comments = 4000;
        users.clear();
        for(int i=0; i<100; i++){
            users.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        //When

        StatisticAnalyzer statisticAnalyzer = new StatisticAnalyzer();
        statisticAnalyzer.calculateAdvStatistics(statisticsMock);

        //Then

        assertEquals(20, statisticAnalyzer.getAvgUserPosts(), 0);
        assertEquals(40, statisticAnalyzer.getAvgUserComments(), 0);
        assertEquals(2, statisticAnalyzer.getAvgCommentsPerPost(), 0);

    }

}
