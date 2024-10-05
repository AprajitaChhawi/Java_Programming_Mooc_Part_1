public class Statistics {
    private int count;
    private int sum;
    public Statistics() {
        this.count=0;
        this.sum=0;
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        this.sum=this.sum+number;
        this.count=this.count+1;
        // write code here
    }

    public int getCount() {
        return this.count;
        // write code here
    }
    public int sum() {
        return this.sum;
        // write code here
    }

    public double average() {
        if(this.count>0){
            double average = (float)this.sum/this.count;
            return average;
        }
        return 0.0;
        // write code here
    }
}