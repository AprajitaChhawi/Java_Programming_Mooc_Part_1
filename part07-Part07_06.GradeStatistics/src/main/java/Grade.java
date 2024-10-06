
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aprajitachhawi
 */
public class Grade {
    private ArrayList<Integer> marks;
    private ArrayList<Integer> passingmarks;
    public Grade(){
        this.marks = new ArrayList<>();
        this.passingmarks = new ArrayList<>();
    }
    public double averagePoints(){
        double average = 0.0;
        if(this.marks.size()==0){
            return average;
        }
        for(int i:marks){
            average = average+i;
        }
        return average/this.marks.size();
    }
    public void add(int i){
        this.marks.add(i);
        if(i>49){
            this.passingmarks.add(i);
        }
    }
    public String averagePointsPassing(){
        double average = 0.0;
        if(this.passingmarks.size()==0){
            return "-";
        }
        for(int i:passingmarks){
            average = average+i;
        }
        return average/this.passingmarks.size()+"";
    }
    public double passingPercentage(){
        if(this.marks.size()==0){
            return 0.0;
        }
        return (100*(float)this.passingmarks.size())/this.marks.size();
    }
    public void printGradeDistribution() {
        int[] gradeDistArr = new int[6];
        for (int grade : this.marks) {
            if (grade >= 90) {
                gradeDistArr[0]++;
            } else if (grade <= 89 && grade > 79) {
                gradeDistArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeDistArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeDistArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDistArr[4]++;
            } else if (grade <= 49) {
                gradeDistArr[5]++;
            }
        }
        System.out.println("Grade distribution:");
        int gradDistIndex = 5;

        for (int e : gradeDistArr) {
            System.out.print(gradDistIndex + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n"); //line break
            gradDistIndex--;
        }

    }
}
