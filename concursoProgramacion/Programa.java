package concurso;
import java.util.ArrayList;
import java.util.List;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Concurso concurso=new Concurso();
        Envio envio =new Envio();
        
        // Declared and initialized three objects.
    	Concurso Sesion1 = new Concurso("Sesion 1",2);
    	Concurso Sesion2 = new Concurso("Seasion 2",3);
    	Concurso Sesion3 = new Concurso("Seasion 3",3);
    	
        // Create a List that contains the three objects made before.
        List<Object> container= new ArrayList<Object>();
    	container.add(Sesion1);
    	container.add(Sesion2);
    	container.add(Sesion3);
        System.out.println(concurso);
        System.out.println(container.get(0));
        
        // Loop, show "nameContest", add teams "nameTeam" and
        // loop again for "manageSend(1,2)
        for (int i = 0; i < container.size(); i++) {
            System.out.println(container.get(i));
            concurso.addTeam("Equipo1");
            concurso.addTeam("Equipo 2");
            concurso.addTeam("Equipo 3");         
            for (int j = 0; j < concurso.getNumTeams().size(); j++) {
                envio.manageSend(concurso.getNameContest(),j ,"(1,2)");
            }
        }
        
    }
    
}