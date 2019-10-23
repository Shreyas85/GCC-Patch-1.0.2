package skeleton.answers;

public class Question1 {

    public static double calculateTotalPayment(double a, double b, double c) {
         double tot;
        int temp = (int) a;
        double repay = (a*c)/100;
        tot = (int) repay;
        if(repay<50) repay = 50;
        while(a>0){
            double interest = (a*b)/100;
            if(a<50){
                repay = a;
                a=0;
            }
            else{
                a = a + interest;
                a = a-repay;
            }
            tot = tot + (int) repay;
        }
        return tot;
    }

}
