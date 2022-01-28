package com.nicolasgandrade.bootcamp;

import com.nicolasgandrade.bootcamp.entities.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Courses
        Content course1 = new Course(
                "APIs with Spring Boot",
                "Learn how to build APIs using Java 11 + Spring",
                6
        );

        Content course2 = new Course(
                "Java Collections",
                "Learn how to implement collections in your Java Projects",
                3
        );

        //Mentoring
        Content mentoring1 = new Mentoring(
                "Applying to interviews",
                "Take some tips to get along job interviews",
                3,
                new Date()
        );

        //Bootcamp
        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Java Developer - GFT Starter",
                "Aprenda Java e tenha sua chance de estagiar na GFT!",
                30
        );
        bootcamp.getContentSet().add(course1);
        bootcamp.getContentSet().add(course2);
        bootcamp.getContentSet().add(mentoring1);

        //Devs
        Dev dev1 = new Dev("Joao");
        Dev dev2 = new Dev("Maria");

        dev1.subscribeToBootcamp(bootcamp);
        dev2.subscribeToBootcamp(bootcamp);

        System.out.println("Joao subscribed to the following content: " + dev1.getSubscribedContent());
        System.out.println("Maria subscribed to the following content: " + dev2.getSubscribedContent());

        System.out.println("===================");

        dev1.goAhead();
        dev2.goAhead();
        dev2.goAhead();

        System.out.println("Updated Status of content completed:");
        System.out.println("Joao: " + dev1.getCompletedContent());
        System.out.println("Maria: " + dev2.getCompletedContent());

        System.out.println("===================");

        System.out.println("Updated Status of remaining content:");
        System.out.println("Joao: " + dev1.getSubscribedContent());
        System.out.println("Maria: " + dev2.getSubscribedContent());

        System.out.println("===================");

        System.out.println("Final XP -> JOAO: " + dev1.calculateXp());
        System.out.println("Final XP -> MARIA: " + dev2.calculateXp());
//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(mentoring1);
    }
}
