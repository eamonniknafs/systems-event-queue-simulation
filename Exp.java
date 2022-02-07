double getExp(double lambda){
    return -1/lambda * Math.log(Math.random());
}

public class Main {
    public static void main(String[] args) {
        double lambda = 0.5;
        double exp = getExp(lambda);
        System.out.println(exp);
    }
}