package com.kodilla.testing.forum.statistics;

public class StatisticAnalyzer {

    private int usersCount;
    private int totalPosts;
    private int totalComments;
    private double avgUserPosts;
    private double avgUserComments;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        totalPosts = statistics.postsCount();
        totalComments = statistics.commentsCount();

        if(getUsersCount() == 0){
            avgUserPosts = 0;
            avgUserComments = 0;
        }else{
            avgUserPosts = (double) getTotalPosts() / getUsersCount();
            avgUserComments = (double) getTotalComments() / getUsersCount();
        }

        if(getTotalComments() == 0 && getTotalPosts() == 0){
            avgCommentsPerPost = 0.0;
        }else{
            avgCommentsPerPost = (double) getTotalComments() / getTotalPosts();
        }

    }

    public void showStatistics(){
        System.out.println("Total users: "+ getUsersCount());
        System.out.println("Total posts: "+ getTotalPosts());
        System.out.println("Total comments"+ getTotalComments());
        System.out.println("Average posts per user: "+ getAvgUserPosts());
        System.out.println("Average comments per user: "+ getAvgUserComments());
        System.out.println("Average comments per post: "+ getAvgCommentsPerPost());
    }

    public int getUsersCount() {

        return usersCount;
    }

    public int getTotalPosts() {

        return totalPosts;
    }

    public int getTotalComments() {

        return totalComments;
    }

    public double getAvgUserPosts() {

        return avgUserPosts;
    }

    public double getAvgUserComments() {

        return avgUserComments;
    }

    public double getAvgCommentsPerPost() {

        return avgCommentsPerPost;
    }
}