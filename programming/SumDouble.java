public class SumDouble {
     public  int sumDouble(int a, int b) {
        if(a != b) return a+b;
		else return 2*(a+b);
    }

    public static void main(String[] args) {

        SumDouble sd = new SumDouble();
        System.out.println(sd.sumDouble(1, 2));
        System.out.println(sd.sumDouble(3, 2));  
        System.out.println(sd.sumDouble(2, 2)); 
    }
}