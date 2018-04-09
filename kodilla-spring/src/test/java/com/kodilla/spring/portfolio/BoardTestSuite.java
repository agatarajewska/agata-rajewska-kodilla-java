package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        Board board = (Board) context.getBean(Board.class);
        //Then
        board.addToDoTask("Task1");
        board.addInProgressTask("Task2");
        board.addDoneTask("Task3");

        board.getToDoList().getTasks().stream()
                .forEach(System.out::println);

        board.getInProgressList().getTasks().stream()
                .forEach(System.out::println);

        board.getDoneList().getTasks().stream()
                .forEach(System.out::println);

    }
}
