package seedu.duke.event;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventList {
    private String name;
    private ArrayList<Event> events;

    public EventList(String name) {
        this.name = name;
        events = new ArrayList<Event>();
    }

    public EventList(String name, ArrayList<Event> events) {
        this.name = name;
        this.events = new ArrayList<Event>(events);
    }

    public void add(Event event) {
        events.add(event);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Event> checkEventsOnDate(LocalDate checkDate) {
        ArrayList<Event> eventsOnDate = new ArrayList<>();

        for (Event event: events) {
            if (event.date == checkDate) {
                eventsOnDate.add(event);
            }
        }

        return eventsOnDate;
    }
}
