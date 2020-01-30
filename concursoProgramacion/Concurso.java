package concurso;
import java.util.List;

public class Concurso {
    
    private String nameContest;
  
    // Yet i don't get what it means by (range 0-(numProblems.length-1))
    private final int[] numProblems;
  
    private List<String> nameTeam;
    private int numParticipants() {
    	return nameTeam.size();
    }
    private List<String> sendMSG;
    
    // Contructors
  
    // Empty constructor added for testing
    public Concurso() {
        this.numProblems=new int[5];
    }
    
    // Constructor that get Contest name and the number of total problems, rest of parameters are null.
    public Concurso(String name,int problems) {
        this.nameContest=name;
        this.numProblems=new int[problems];
        this.nameTeam=null;
        this.sendMSG=null;
    }
  
    // Constructor that only get the Contest name, set number of total problems to '5' and rest of paremeters are null.
    public Concurso(String name){
        this.nameContest=name;
        this.numProblems=new int[5];
        this.nameTeam=null;
        this.sendMSG=null;
    }
  
    // ~~~  Methods  ~~~
    
    // addTeam, add a team's name to 'numTems' after check if the "team's name" 
    // is already on the List or not, it accept various arguments (varargs).
    
    /**
     * Add team's name after checking if it is not on the list.
     * @param team Team's name or names to be added.
     */
    public void addTeam(String... team){ // team = "team1,team 2,team3";
        for (String s : team) {        
            if (!nameTeam.contains(s)){		// this gets me "java.lang.NullPointerException" error.
                nameTeam.add(s);
            }
        }            
    }
    
    // delTeam, remove a team's name from 'nameTeam' and return true/false 
    // if it was deleted, also Delete all the team's "List<String> sendMSG" data. 
    
    /**
     * Remove team's name after checking if it is on the list.
     * @param team Team's name to be removed.
     * @return True if 'team' was succefully removed, otherwise returns false.
     */  
    public boolean delTeam(String team) {
        if (nameTeam.contains(team)){
            nameTeam.remove(team);
            // Missing delete data stuff
            for (int i = 0; i < sendMSG.size(); i++) {
                if (sendMSG.contains(team)){
                    sendMSG.remove(i);
                }    
            }
            
            return true;
        }else{
            return false;
        }        
    }
    
    // Getters
    public String getNameContest() {
        return nameContest;
    }

    public int[] getNumProblems() {
        return numProblems;
    }

    public List<String> getNumTeams() {
        return nameTeam;
    }

    
    public List<String> getsendMSG() {
        return sendMSG;
    }

    // Setters
    public void setNameConstest(String nombreConcurso) {
        this.nameContest = nombreConcurso;
    }

    public void setNumTeams(List<String> numEquipos) {
        this.nameTeam = numEquipos;
    }

    public void setEnvios(List<String> envios) {
        this.sendMSG = envios;
    }
    
}