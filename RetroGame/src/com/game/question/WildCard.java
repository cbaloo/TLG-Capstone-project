package com.game.question;

import java.util.HashMap;
import java.util.Map;

public class WildCard {

    private static Map<String, String> wildCardLobby = new HashMap<>() {
        {
            put("WHO 'INSTRUCTS' THE  INSTRUCTORS ON ADOBE CONNECT?", "JEANNETTE");
        }
    };
    private static Map<String, String> wildCardJava = new HashMap<>() {
        {
            put("DID JAY WIN FIRST PLACE IN HIS AIR GUITAR COMPETITION? (TRUE/FALSE)", "FALSE");
            put("CLASSMATE WHO WOWS ALL WITH HIS/HER PROJECT?", "DHRUTI");
            put("CLASSMATE WHO HAVE SPENT THE MOST AMOUNT OF TIME UNDERWATER?", "JOSH");
        }
    };
    private static Map<String, String> wildCardJS = new HashMap<>() {
        {
            put("HOW MANY INSTRUCTORS DID WE HAVE FOR OUR JAVASCRIPT COURSE?(1/2)", "2");
            put("WE HAVE SEEN ALMOST ALL THE ROOMS OF THIS CLASSMATES' APARTMENT?", "DAEUN");
        }
    };
    private static Map<String, String> wildCardAlgorithm = new HashMap<>() {
        {
            put("TOM IS A MAN OF MAN OF MANY TALENTS? (TRUE/FALSE)", "TRUE");
            put("STEVE CAN DO NO WRONG?? (TRUE/FALSE)", "TRUE");
            put("CLASSMATE WHO LOVES DOING LAUNDRY?", "HIRO");
        }
    };
    private static Map<String, String> wildCardLinux = new HashMap<>() {
        {
            put("WAS PHOTOGRAPHY ONE OF JOHN'S OTHER PASSION?(TRUE/FALSE)", "TRUE");
            put("CLASSMATE WHO LOVES GARDENING AND HAS RECENTLY GOTTEN INTO BIRD WATCHING?", "MICHAEL");
        }
    };
    private static Map<String, String> wildCardPython = new HashMap<>() {
        {
            put("WE WERE IS SOME KIND OF GANG WHILE WE WERE GOING THROUGH THE PYTHON COURSE?(TRUE/FALSE)", "TRUE");
            put("CLASSMATE WHO LIVES CLOSEST TO MOUNT RAINIER", "BRAD");
        }
    };
    private static Map<String, String> wildCardCapstone = new HashMap<>() {
        {
            put("RENNIE MAKES INFRASTRUCTURE AS SERVICE(IAAS) PIZZA EVERY SUNDAY? (TRUE/FALSE)", "FALSE");
            put("CLASSMATE WHO HAS THE MOST SCREENS", "BRUCE");

        }
    };

    public static Map<String, String> getWildCardLobby() {
        return wildCardLobby;
    }

    public static Map<String, String> getWildCardJava() {
        return wildCardJava;
    }

    public static Map<String, String> getWildCardJS() {
        return wildCardJS;
    }

    public static Map<String, String> getWildCardAlgorithm() {
        return wildCardAlgorithm;
    }

    public static Map<String, String> getWildCardLinux() {
        return wildCardLinux;
    }

    public static Map<String, String> getWildCardPython() {
        return wildCardPython;
    }

    public static Map<String, String> getWildCardCapstone() {
        return wildCardCapstone;
    }
}
