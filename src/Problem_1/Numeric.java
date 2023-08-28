package Problem_1;

public class Numeric {
    double ans ;
    public void result(double x , int n)
    {
        if(n<0)
        {
            ans = 1/Math.pow(x,-n);
        }
        else if(n==0)
        {
            ans = 1;
        }
        else if(n%2==0)
        {
            ans =Math.pow((Math.pow(x,n)/2),2);
        }
        else
        {
            ans = Math.pow(x,n-1)*x;
        }


    }

    public double getAns() {
        return ans;
    }
}
