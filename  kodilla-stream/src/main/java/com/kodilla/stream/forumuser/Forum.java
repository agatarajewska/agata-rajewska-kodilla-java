package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    public List<ForumUser> getUserList() {
        final List<ForumUser> userList = new ArrayList<>();

        userList.add(new ForumUser(1, "Antoni", 'M', LocalDate.of(1995, 1, 1), 25));
        userList.add(new ForumUser(2, "Maciej", 'M', LocalDate.of(2000, 1, 1), 0));
        userList.add(new ForumUser(3, "Anastazja", 'K', LocalDate.of(2000, 1, 1), 0));
        userList.add(new ForumUser(4, "Renata", 'K', LocalDate.of(2000, 1, 1), 0));
        userList.add(new ForumUser(5, "Wojciech", 'M', LocalDate.of(2000, 1, 1), 5));
        userList.add(new ForumUser(6, "Katarzyna", 'K', LocalDate.of(1995, 1, 1), 121));
        userList.add(new ForumUser(7, "Aleksandra", 'K', LocalDate.of(1995, 1, 1), 13));
        userList.add(new ForumUser(8, "Michał", 'M', LocalDate.of(1995, 1, 1), 254));
        userList.add(new ForumUser(8, "Arkadiusz", 'M', LocalDate.of(1995, 1, 1), 0));


        return new ArrayList<ForumUser>(userList);
    }
}
