class diff21 {
     public int diff21(int n) {
        int diff = Math.abs(n - 21);
		if(n>21){
			return 2*diff;
		}
		return diff;
    }

    public static void main(String[] args) {

        diff21 d = new diff21();
        System.out.println(d.diff21(19));
        System.out.println(d.diff21(10));  
        System.out.println(d.diff21(21));
		System.out.println(d.diff21(26));
    }
}