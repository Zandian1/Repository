package com.company;

public class BoundedCounter {
    private int value;
    private int upperLimit;


    public BoundedCounter(int upperLimit) {

        this.upperLimit=upperLimit;
    }

    public void setValue(int newValue)
    {
        if (newValue>0&&newValue<=upperLimit)
        {
            this.value = newValue;
        }
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if (this.value<10)
        {
            return ("0"+this.value);
        }
        else
            return (""+this.value);
    }

    public int getValue() {
        return this.value;
    }
}


