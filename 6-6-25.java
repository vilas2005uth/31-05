FACTORIAL OF A NUMBER

class Main {
    public static void main(String[] args) {
        System.out.println(fact(16));
    }
public static int fact(int n){
        if (n==1) {
            return 1;
        }
       int val=n*fact(n-1);
       return val;
    }
}
