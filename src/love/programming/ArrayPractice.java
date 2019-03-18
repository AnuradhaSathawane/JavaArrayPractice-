package love.programming;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] myIntArray1 = new int[100];
        String[] myStringArray = {"one","two","three","four","five","six"};
        for(int i =0;i< myIntArray1.length;i++){
            i++;
            myIntArray1[i] = i;
            System.out.println(myIntArray1[i]);
        }
    }
}
