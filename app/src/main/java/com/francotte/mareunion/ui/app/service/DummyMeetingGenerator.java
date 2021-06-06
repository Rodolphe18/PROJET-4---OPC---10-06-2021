package com.francotte.mareunion.ui.app.service;

import com.francotte.mareunion.ui.app.model.Meeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DummyMeetingGenerator {

    static List<Meeting> generateMeetings() {
        return new ArrayList<>(DUMMY_MEETINGS);
    }

    public static List<Meeting> DUMMY_MEETINGS = Arrays.asList(
            new Meeting(1, "pot de départ", "jean, michel, jack, thierry", "Salle A",
                    14, 30),
            new Meeting(2, "anniversaire", "jean, michel, jack, thierry", "Salle D",
                    15,  00),
            new Meeting(3, "pot d'arrivée'", "jean, michel, jack, thierry", "Salle J",
                    17,  15),
            new Meeting(4, "point hebdomadaire", "jean, michel, jack, thierry", "Salle B",
                    9,  30),
            new Meeting(5, "plénière", "jean, michel, jack, thierry", "Salle F",
                    11,  30));

}

