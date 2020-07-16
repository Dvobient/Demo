import java.util.ArrayList;

public class rekusrive {

    private int recsearch(ArrayList<Integer> al) {
        if (al.size() == 1) {
            return al.get(0); //Базовый случай(сводим к нему задачу)
        }
        else {
            int a = al.remove(0);
            return a + recsearch(al);
        }
    }

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(3);
        al.add(1);
        al.add(6);
        al.add(10);
        al.add(3);

        rekusrive rk = new rekusrive();
        int result = rk.recsearch(al);
        System.out.println(result);
    }
}
