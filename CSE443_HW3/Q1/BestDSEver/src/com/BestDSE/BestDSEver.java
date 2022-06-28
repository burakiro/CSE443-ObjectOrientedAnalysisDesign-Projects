package com.BestDSE;


public class BestDSEver {
    private static final int SIZE_FACTOR=5;

    private Object data[];

    private int index;

    private int size;

    public BestDSEver(){
        this.data=new Object[SIZE_FACTOR];
        this.size=SIZE_FACTOR;
    }

    public void insert(Object obj){
        if(this.index==this.size-1){
            //we need to increase the size of data[]
            increaseSizeAndReallocate();
        }
        data[this.index]=obj;
        this.index++;

    }

    private void increaseSizeAndReallocate() {
        this.size=this.size+SIZE_FACTOR;
        Object newData[]=new Object[this.size];
        for(int i=0; i<data.length;i++){
            newData[i]=data[i];
        }
        this.data=newData;
    }

    public Object get(int i) throws Exception{
        if(i>this.index-1){
            throw new Exception("ArrayIndexOutOfBound");
        }
        if(i<0){
            throw new Exception("Negative Value");
        }
        return this.data[i];

    }

    public void remove(int i) throws Exception{
        if(i>this.index-1){
            throw new Exception("ArrayIndexOutOfBound");
        }
        if(i<0){
            throw new Exception("Negative Value");
        }
        for(int x=i; x<this.data.length-1;x++){
            data[x]=data[x+1];
        }
        this.index--;

}}
