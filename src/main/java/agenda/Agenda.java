package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    
    public Set<Event> lesEvents = new HashSet<>();
    ArrayList<Event> aujourdhui = new ArrayList<>();
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        lesEvents.stream().filter(evenement -> (evenement.equals(e))).forEachOrdered(_item -> {
            lesEvents.remove(e);
        });
lesEvents.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        for (Event e1 : lesEvents) {
            if (e1.isInDay(day)){
                aujourdhui.add(e1);
            }
        }
        return aujourdhui;
    }
}
