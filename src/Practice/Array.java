package Practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Array {
    public static void main(String [] args) throws Exception{
        int a = 10;
        double d = 3.14;
        int [] arr = {1, 3};

        ArrayList alist = new ArrayList();
        alist.add(1);
        alist.add((double)3.14);
        System.out.println();

        for (int i=0; i<alist.size(); i++)
            System.out.println(alist.get(i));

        ArrayList<Integer> ilist = new ArrayList<>();
        ilist.add(1);

        LinkedList llist = new LinkedList();
        llist.add(1);
        llist.add(2);
        llist.add(3.14);

        for (int i = 0; i < llist.size(); i++)
            System.out.println(llist.get(i));
    }
}
