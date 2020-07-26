package com.game.question;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.*;

public class IceBreaker {
    private static List<String> iceBreaker = new ArrayList(Arrays.asList(
            "IF YOU COULD GO ANYWHERE IN THE WORLD, WHERE WOULD YOU GO?",
            "IF IT WAS POSSIBLE, WHAT SUPER POWER WOULD YOU HAVE?",
            "WHERE DID YOU GROW UP?",
            "WHAT IS YOUR SSN?!?!?!",
            "WHAT WAS YOUR FIRST CAR?",
            "ARE YOU A MORNING PERSON?",
            "WOULD YOU RATHER GO FOR A HIKE OR FOR A SWIM?",
            "WOULD YOU RATHER BE A PROFESSIONAL ATHLETE OR A PROFESSIONAL TASTE TESTER?"
    ));



    public static String getIceBreaker() {
        Collections.shuffle(iceBreaker);
        return iceBreaker.get(0);
    }
}
