package com.BestDSE;

public class SaferVersion
{

    private static BestDSEver mySaferVersionDS;

    private SaferVersion(){}

    public static synchronized Object getInstance(int index) throws Exception {
        if(mySaferVersionDS == null){
            mySaferVersionDS = new BestDSEver();
            return 0;
        }
        else
            return mySaferVersionDS.get(index);
        }



    public static synchronized void add(Object o){
        if(mySaferVersionDS == null){
            mySaferVersionDS = new BestDSEver();
        }
        mySaferVersionDS.insert(o);
        System.out.println(o + " has been added");
    }

    public static synchronized void remove(Object o) {
        if(mySaferVersionDS == null){
            System.out.println("You can not remove an item from empty Data Structure");
        }
        else {
            try {
                mySaferVersionDS.remove((Integer) o);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Index " + o + " has been removed");
        }
    }

}

class Main {

    public static void main(String[] args) throws Exception {

        SaferVersion test = null;

        test.remove(3);
        test.add(1);
        test.add(2);
        test.remove(0);
        System.out.println(test.getInstance(0));

    }
}
