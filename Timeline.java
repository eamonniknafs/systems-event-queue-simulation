import java.util.Comparator;
import java.util.PriorityQueue;

public class Timeline {
    PriorityQueue<Event> timeline = new PriorityQueue<Event>(11, new Comparator<Event>(){
        public int compare(Event e1, Event e2){
            if (e1.getTime() < e2.getTime()){
                return -1;
            } else if (e1.getTime() > e2.getTime()){
                return 1;
            } else {
                return 0;
            }
        }
    });

    void addToTimeline(Event e) {
        timeline.add(e);
    }
    
    Event popNext() {
        return timeline.poll();
    }

    public static void main(String args[]){
        double lambdaA = Double.parseDouble(args[0]);
        double lambdaB = Double.parseDouble(args[1]);
        int T = Integer.parseInt(args[2]);
        Timeline t = new Timeline();
        double timeA = 0;
        double timeB = 0;
        while (timeA < T || timeB < T){
            if (timeA < T){
                t.addToTimeline(new Event('A', timeA));
                timeA += Exp.getExp(lambdaA);
            } 
            if (timeB < T){
                t.addToTimeline(new Event('B', timeB));
                timeB += Exp.getExp(lambdaB);
            }
        }
        int A=0;
        int B=0;
        while (t.timeline.peek() != null){
            Event e = t.popNext();
            if (e.getType() == 'A'){
                System.out.println("A"+A+": "+e.getTime());
                A++;
            } else {
                System.out.println("B"+B+": "+e.getTime());
                B++;
            }
            
        }
    }
}
