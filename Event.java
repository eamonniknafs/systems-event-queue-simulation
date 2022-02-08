public class Event{
    private char type;
    private double time;

    public Event(char ty, double ti){ 
        type = ty;
        time = ti;
    }

    public double getTime(){
        return time;
    }
    
    public char getType(){
        return type;
    }
}