import java.util.ArrayList;

public class BinaryGap2 {

    public static void main(String[] args) {

        TimeTest t = new TimeTest("findgap");

        t.start();
        int num = 570;

        String st = Integer.toBinaryString(num);

        System.out.println(st);
        //System.out.println(st.length());

        ArrayList<Integer> l = new ArrayList<>();

        for (int i = 0; i<st.length(); i++) {
            if(st.charAt(i)=='0') continue;
            l.add(i);

        }

        Printer.vlist(l);

        //int sum = 0;
        int tot = 0;


        for(int i = 0; i<l.size()-1; i++){
            int sum = Math.abs(l.get(i) - l.get(i+1))-1;
            if(sum>=tot){
                tot = sum;
            }
        }
        t.finish();

        System.out.println("BynaryGap = " + tot);

        t.exec_time();
    }
}
