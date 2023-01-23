package math;
public class max {
    int a,b;
    public max(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void display(){
        if (a>b) {
            System.out.println("a is max");
        } else {
           System.out.println("b is max"); 
        }
    }
}
