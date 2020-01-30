package concurso;

import java.util.Arrays;

public class Envio {
    
    final private String teamName;
    final private int orderProblem;
    final private String solution;
    
    public Envio(String name,int order,String send){
        this.teamName=name;
        this.orderProblem=order;
        this.solution=send;
        
    }
    // manageSend, sendMSG a string with the solution of the problem for 'numProblems', to the 'numProblems' of the index given by parameter (o)
    
    /**
     * Hace el envio del mensaje con el texto (name+"+"+send).
     * @param name Nombre del equipo
     * @param order Numero de orden de la pregunta
     * @param send Mensaje como solucion a enviar
     */
    public void manageSend(String name, int order, String send) {
        Concurso concurso=new Concurso();
        Arrays.asList(concurso.getNumProblems()).indexOf(order);
        concurso.getsendMSG().add(name+","+send);
        
        // Missing inmutable part or i don't really know what it means.
        
    }

    
}
