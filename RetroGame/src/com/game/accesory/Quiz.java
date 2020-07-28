package com.game.accesory;

import java.util.HashMap;
import java.util.Map;

public class Quiz {
    private static Map<String,String> quizLobby =new HashMap<>(){
        {
            put("HOW MANY AMAZON LEADERSHIP PRINCIPLES ARE THERE?","14");
            put("HOW MANY MONTHS IS YOUR TLG LEARNING JOURNEY?", "4");
        }
    };

    private static Map<String,String> quizJava =new HashMap<>(){
        {
//            put("WHAT DOES OOP STAND FOR?", "OBJECT ORIENTED PROGRAMMING");
            put("WHAT DOES JVM STAND FOR?","JAVA VIRTUAL MACHINE");
            put("JAVA USES THE 'PUBLIC', 'PROTECTED,' AND '-------' ACCESS KEYWORDS.","PRIVATE");
            put("IF YOU DECLARE NO CONSTRUCTORS, A '-------' CONSTRUCTOR IS AUTOMATICALLY ASSIGNED.","DEFAULT");
//            put("WHAT DOES THE '!=' OPERATOR STAND FOR?","NOT EQUAL");
//            put("WHAT IDE DID WE PRIMARILY USE DURING OUR JAVA COURSE?","INTELLIJ");
        }
    };
    private static Map<String,String> quizJS =new HashMap<>(){
        {
            put("WHICH COMPANY DEVELOPED JAVASCRIPT, NETGEAR OR NETSCAPE?", "NETSCAPE");
            put("JAVASCRIPT CAN BE USED WITH CSS AND '----' TO CREATE INTERACTIVE WEB PAGES.", "HTML");
            put("JAVASCRIPT WAS FIRST KNOWN AS LIVESCRIPT OR ECMASCRIPT?", "LIVESCRIPT");
//            put("IN JAVASCRIPT, SEMI-COLONS ARE REQUIRED (TRUE/FALSE)", "FALSE");
            put("JSON STANDS FOR JAVASCRIPT OBJECT '--------'", "NOTATION");

        }
    };
    private static Map<String, String> quizAlgorithm = new HashMap<>() {
        {
            put("A SET CAN HAVE DUPLICATES?(TRUE/FALSE)", "FALSE");
            put("LIST/ARRAY ARE ORDERED DATA STRUCTURE(TRUE/FALSE)","TRUE");
            put("STACK IS ALSO CALLED FIRST IN FIRST OUT(TRUE/FALSE)", "FALSE");
        }
    };
    private static Map<String, String> quizLinux = new HashMap<>() {
        {
            put("WHAT US THE LINUX COMMAND TO CHANGE THE DIRECTORIES?", "CD");
            put("WHAT US THE LINUX COMMAND TO LIST THE CONTENTS OF A DIRECTORY?", "LS");
            put("WHAT US THE LINUX COMMAND TO MAKE A DIRECTORY?", "MKDIR");

        }
    };
    private static Map<String, String> quizPython = new HashMap<>() {
        {
            put("WHITE SPACES ARE THE LEAST OF OUR WORRIES WHILE CODING IN PYTHON? (TRUE/FALSE)", "FALSE");
            put("LIST IS A PREDEFINED DATA TYPE IN PYTHON? (TRUE/FALSE)", "TRUE");
            put("TUPLE IS MUTABLE? (TRUE/FALSE)", "FALSE");
        }
    };
    private static Map<String, String> quizCapstone = new HashMap<>() {
        {
//            put("HOW MANY PRINCIPLES DOES AGILE HAVE?", "12");
            put("IN AGILE, THE HIGHEST PRIORITY IS TO SATISFY THE '--------'.", "CUSTOMER");
            put("A USER STORY IS A TOOL USED IN '-----' SOFTWARE DEVELOPMENT", "AGILE");
//            put("WHEN USING AGILE, SPRINTS TYPICALLY LAST BETWEEN 1 AND 4 '-----'.", "WEEKS");
            put("WORKING SOFTWARE IS THE PRIMARY MEASURE OF '--------'?", "PROGRESS");
        }
    };

    public static Map<String, String> getQuizLobby() {
        return quizLobby;
    }

    public static Map<String, String> getQuizJava() {
        return quizJava;
    }

    public static Map<String, String> getQuizJS() {
        return quizJS;
    }

    public static Map<String, String> getQuizAlgorithm() {
        return quizAlgorithm;
    }

    public static Map<String, String> getQuizLinux() {
        return quizLinux;
    }

    public static Map<String, String> getQuizPython() {
        return quizPython;
    }

    public static Map<String, String> getQuizCapstone() {
        return quizCapstone;
    }
}
