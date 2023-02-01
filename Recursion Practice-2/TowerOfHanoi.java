public class TowerOfHanoi {
    public static void main(String[] args) {
        int n=3;
        hanoifun(n, 'A', 'C', 'B');
    }

    private static void hanoifun(int n, char s, char d, char i) {
        if(n == 1)
        {
            System.out.println("Move disk 1 from "+s+" to "+d);
            return;
        }
        hanoifun(n-1,s,i,d);
        System.out.println("Move disk "+n+" from rod "+s+" to "+d);
        hanoifun(n-1,i,d,s);
    }

}
