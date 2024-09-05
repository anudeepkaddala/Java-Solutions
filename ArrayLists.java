import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class ArrayLists{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        //add
        list.add(0);
        list.add(6);
        list.add(5);
        System.out.println(list);

        //getting element in an index
        int ele=list.get(1);
        System.out.println(ele);

        //add element in between
        list.add(1,3);
        System.out.println(list);

        //set a previously alotted index element into new element in its place

        list.set(0,20);
        System.out.println(list);

        //delete an element in an index

        list.remove(2);
        System.out.println(list);

        //size of this arraylist

        int size=list.size();
        System.out.println(size);

        //looping in ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    
        //sorting: we use a special class called Collections

        Collections.sort(list);
        System.out.println(list);
    
    
    }
}