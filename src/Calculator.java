public class Calculator {

    public double calculation(double a, double b){
        double result;
        if(a>b)
            result = add(a,b);
        else if(b>a)
            result = multiply(a,b);
        else
            result = square(a);
        return result;
    }

    private double add(double a, double b){
        double sum = a+b;
        System.out.println("Suma liczb " + a + " i " + b + " wynosi: " + sum);
        return sum;
    }

    private double multiply(double a, double b){
        double product = a*b;
        System.out.println("Iloczyn liczb " + a + " i " + b + " wynosi: " + product);
        return product;
    }

    private double square(double a){
        double square = a*a;
        System.out.println("Kwadrat liczby " + a + " wynosi: " + square);
        return square;
    }



}
