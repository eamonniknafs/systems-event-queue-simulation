import java.util.Comparator;
import java.util.PriorityQueue;

public class Timeline {
    PriorityQueue<Event> timeline = new PriorityQueue<Event>(11, new Comparator<Event>(){
        public int compare(Event e1, Event e2){
            return e1.getTime() - e2.getTime();
        }
    });

    void addToTimeline(Event e) {
        timeline.add(e);
    }
    
    Event popNext() {
        return timeline.poll();
    }

    public static void main(String args[]){
        Timeline t = new Timeline();
        Event e = new Event();
        t.addToTimeline(e);
    }
}
