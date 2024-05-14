package Polimorfismo.QuestaoPolinomio.Entidades;

public class Termo {
    private double a; //variavel 
    private double i; //expoente
    private double x = 0;
    
    public Termo(double a, double i) {
        this.a = a;
        this.i = i;
    } 

    public Termo() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

     public double getX() {
        return x;
    }
        
    public void setX(double x) {
        this.x = x;
    }   
        
    public double calcula(double x){
        double temp = Math.pow(x, i);
        return temp * a;
    }

    public void insere(Termo termo){
        this.a = termo.getA();
        this.i = termo.getI();
    }
}
