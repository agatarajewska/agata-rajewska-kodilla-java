package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ExercisesList javaExercisesList = new JavaExercisesList();
        ExercisesList sqlExercisesList = new SqlExercisesList();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");


        javaExercisesList.registerObserver(johnSmith);
        javaExercisesList.registerObserver(ivoneEscobar);
        sqlExercisesList.registerObserver(johnSmith);
        //When
        javaExercisesList.addExercise("Streams 1 exercises");
        javaExercisesList.addExercise("Streams 2 exercises");
        javaExercisesList.addExercise("Spring basics exercises");
        sqlExercisesList.addExercise("Select exercises");
        sqlExercisesList.addExercise("New table exercise ");
        sqlExercisesList.addExercise("Create user exercise");
        //Then
        assertEquals(6, johnSmith.getUpdateCount());
        assertEquals(3, ivoneEscobar.getUpdateCount());
    }
}
