
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int teamGames = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                
                String[] data = row.split(",");
                String home = data[0];
                String visiting = data[1];
                int homeScore = Integer.valueOf(data[2]);
                int visitingScore = Integer.valueOf(data[3]);
                if (home.equals(team)) {
                    teamGames++;
                    if (homeScore > visitingScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                if (visiting.equals(team)) {
                    teamGames++;
                    if (visitingScore > homeScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("File could not be read.");
        }
        
        System.out.println("Games: " + teamGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
