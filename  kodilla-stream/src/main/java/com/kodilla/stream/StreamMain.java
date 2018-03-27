package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.BookDirectory;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;

import java.util.Map;

public class StreamMain {
    public static void main(String[] args) {


        Forum forum = new Forum();
        Map<Integer, ForumUser> map = forum.getUserList().stream()
                .filter(u -> u.getSex() == 'M' && LocalDate.now().minusYears(u.getBirthDate().getYear()).getYear() > 20 && u.getTotalPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));


        map.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }

}

