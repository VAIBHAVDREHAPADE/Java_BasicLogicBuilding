package learn.basics.lambdas;

public class RunnableLabdaInterface {
    public static void main(String[] args) {
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Runnable 1 Start");
    }
};
new Thread(runnable).start();

Runnable lambda = ( ) ->  System.out.println("Runnable 2 Start");
new Thread(lambda).start();
    }
}
