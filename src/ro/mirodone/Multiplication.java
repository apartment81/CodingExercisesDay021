package ro.mirodone;

public class Multiplication {

    public void MultiplicationTable ( int number) {

        int n = 10;

        System.out.println(" Multiplication Table for : " + number);

        for ( int i = 0 ; i <= n; i++){
            System.out.println(number + " X " + i + " = " + i*number);
        }

    }

}
