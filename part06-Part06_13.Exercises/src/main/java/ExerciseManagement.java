
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<Exercise> exerciseList;
    
    public ExerciseManagement(){
        this.exerciseList = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList(){
        ArrayList<String> exercise = new ArrayList<>();
        for(Exercise e : exerciseList){
            exercise.add(e.getName());
        }
        return exercise;
    }
    public void add(String exercise){
        exerciseList.add(new Exercise(exercise));
    }
    public void markAsCompleted(String exercise) {
        for(Exercise e : exerciseList){
            if(e.getName().equals(exercise)){
                e.setCompleted(true);
            }
        }
    }
    public boolean isCompleted(String exercise) {   
        for(Exercise e : exerciseList){
            if(e.getName().equals(exercise)){
                return e.isCompleted();
            }
        }
        return false;
    }
}
