package Test;

public class Calculator {
    private double firstOperand;
    private double secondOperand;
    private char operator;

    public Calculator(){
        firstOperand = 0;
        secondOperand = 0;
        operator = ' ';
    }
    
     public void setFirstOperand(double firstOperand) {
         firstOperand = firstOperand;
     }
     public void setSecondOperand(double secondOperand) {
         secondOperand = secondOperand;
     }
    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getResult() {
        double result = 0;
        switch (operator) {
            case '+' -> {
                return firstOperand + secondOperand;
            }
            case '-' -> { 
                return firstOperand - secondOperand;
            }
            case '*' -> { 
                return firstOperand * secondOperand;
            }
            case '/' -> { 
                if (secondOperand != 0){
                    return firstOperand / secondOperand;
                 
                }
                else {
                    System.out.println("Illegal Divisionn.");
                }
            }
            default -> System.out.println("Invalid operator.");
        }
        return result;
                
    }

    public void setsecondOperand(double secondOperand) {
       

   
    }

    public void setfirstOperand(double firstOperand) {
 
    }
    }

    

    

   
