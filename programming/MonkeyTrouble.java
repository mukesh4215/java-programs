public class MonkeyTrouble {
     public boolean monkeyTrouble(boolean aSmile, boolean bSmile)  {
        if((aSmile && bSmile) || (!aSmile && !bSmile)) return true;
		else return false;
    }

    public static void main(String[] args) {

        MonkeyTrouble mt = new MonkeyTrouble();
        System.out.println(mt.monkeyTrouble(true, true));
        System.out.println(mt.monkeyTrouble(false, false));  
        System.out.println(mt.monkeyTrouble(true, false)); 
    }
}
