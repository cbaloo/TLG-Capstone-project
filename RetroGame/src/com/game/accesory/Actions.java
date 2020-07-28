package com.game.accesory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actions {

    private static List<String> actionsLobby=new ArrayList(Arrays.asList(
            "ENTER JAVA(J)"
    ));
    private static List<String> actionsJava=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"

    ));
    private static List<String> actionsJS=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"

    ));
    private static List<String> actionsAlgorithm=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"

    ));
    private static List<String> actionsLinux=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"

    ));
    private static List<String> actionsPython=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"

    ));
    private static List<String> actionsCapstone=new ArrayList(Arrays.asList(
            "TAKE QUIZ(Q)",
            "TAKE WILD CARD QUIZ(W)"

    ));
    public static List<String> getActionsLobby() {
        return actionsLobby;
    }

    public static List<String> getActionsJava() {
        return actionsJava;
    }

    public static List<String> getActionsJS() {
        return actionsJS;
    }

    public static List<String> getActionsAlgorithm() {
        return actionsAlgorithm;
    }

    public static List<String> getActionsLinux() {
        return actionsLinux;
    }

    public static List<String> getActionsPython() {
        return actionsPython;
    }

    public static List<String> getActionsCapstone() {
        return actionsCapstone;
    }
}
