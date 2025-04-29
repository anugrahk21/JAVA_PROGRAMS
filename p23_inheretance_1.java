import java.util.Scanner;

//program to show the use of inheritance in java
//here, single inheritance is used
//here, CarLoan class is inheriting the properties of Loan class

class Loan {
    int t;
    double r,p;
    public Loan(int t,double r,double p){//constructor
        this.t=t;//this keyword is used to refer to the variable of the current class. 
        //This is used to avoid confusion between class attributes and parameters passed to the constructor.
        this.r=r;
        this.p=p;
    }
    public float calculateInterest(){
        return (float)(t*p*r)/100;
    }
}

class CarLoan extends Loan { //inheritance(Child class CarLoan is inheriting the properties of parent class Loan)
    double f;
    float k=calculateInterest();
    public CarLoan(double p,double r,int y,double f){
        super(y,r,p); //calling the constructor of the parent class
        this.f=f;
    }
    public float calculateTotalCost(){
        return (float)f+k;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double interestRate = scanner.nextDouble();
        int loanTerm = scanner.nextInt();
        double processingFee = scanner.nextDouble();
        
        CarLoan carLoan = new CarLoan(principal, interestRate, loanTerm, processingFee);//
        //here, carLoan->object of CarLoan class
        //principal, interestRate, loanTerm, processingFee->parameters passed to the constructor of CarLoan class
        //new CarLoan(principal, interestRate, loanTerm, processingFee)->creating an object of CarLoan class (here carLoan)
                                                                        // and passing the parameters to the constructor of CarLoan class
        //new is used to allocate memory at runtime
        System.out.printf("Total Interest: %.2f\n", carLoan.calculateInterest());
        System.out.printf("Total Cost : %.2f\n", carLoan .calculateTotalCost());
        
        scanner.close();
    }
 }