public class Bottle{
    private double capacity;
    private double current;

    public Bottle(double c){
        capacity = c;
        current = c;
    }

    public double updateAmount(double liquid){
        current -= liquid;
        if (current < (capacity * .25)){
            current = capacity;
        }
        return current;
    }
}
