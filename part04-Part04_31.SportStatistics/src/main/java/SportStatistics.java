
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Sports> records = new ArrayList<>();
        try {
            Scanner sc = new Scanner(Paths.get(file));
            while(sc.hasNextLine()){
                String[] parts = sc.nextLine().split(",");
                String homename=parts[0];
                String visitingname=parts[1];
                int homepoints = Integer.valueOf(parts[2]);
                int visitingpoints = Integer.valueOf(parts[3]);
                records.add(new Sports(homename,visitingname,homepoints,visitingpoints));
            }
        } catch (Exception ex) {
            System.out.println("Reading the file "+file+" failed.");
        }
        System.out.println("Team:");
        String name = scan.nextLine();
        int count=0;
        int win=0;
        for (Sports sports: records) {
            if(name.equals(sports.getHomeName()) || name.endsWith(sports.getVisitingName())){
                count=count+1;
            }
            if((name.equals(sports.getHomeName()) && sports.getHomeTeam()>sports.getVisitingTeam()) || (name.equals(sports.getVisitingName()) && sports.getHomeTeam()<sports.getVisitingTeam())){
                win=win+1;
            }
        }
        System.out.println("Games: "+count);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+(count-win));

    }

}
