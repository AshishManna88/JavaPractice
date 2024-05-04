package demo.Collections.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

    private int id;
    private String name;
    private String address;
    private String gender;

    public ArrayListPractice(int id, String name, String address, String string){
        this.id = id; this.name = name; this.address = address; this.gender = string;
    }

    
    @Override
    public String toString() {
        return "ArrayListPractice [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender
                + "]";
    }


    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(8);
        intList.add(4);
        intList.add(9);
        intList.add(6);
        intList.add(7);
        System.out.println(intList);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println("list of "+ i + " index: " + intList.get(i));
        }

        System.out.println(intList.contains(3)?"This is exist":"This is not exist");

        List<String> strList = Arrays.asList("A", "B", "C", "D");
        System.out.println(strList);
        
        System.out.println(Collections.binarySearch(intList, 4));

        ArrayListPractice p = new ArrayListPractice(001, "Ashish", "Address 1", "M");
        ArrayListPractice q = new ArrayListPractice(002, "Ashish2", "Address 2", "M");

        ArrayList newList = new ArrayList<>();
        newList.add(p);
        newList.add(q);

        for (int i = 0; i < newList.size(); i++) {
            
            System.out.println(newList.get(i));
        }


        
    }
}
