
public class Sports {

    private String home_name;
    private String visting_name;
    private int home_team_points;
    private int visiting_team_points;

    public Sports(String home_name , String visting_name ,int home_team_points ,int visiting_team_points) {
        this.home_name = home_name;
        this.visting_name = visting_name;
        this.home_team_points = home_team_points;
        this.visiting_team_points = visiting_team_points;
    }

    public String getHomeName() {
        return this.home_name;
    }
    
    public String getVisitingName() {
        return this.visting_name;
    }
    

    public int getHomeTeam() {
        return this.home_team_points;
    }
    
    public int getVisitingTeam() {
        return this.visiting_team_points;
    }

}
