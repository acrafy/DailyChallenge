package concurso;

public class registrarEnvio {
            
    // registerSend, verify if the message follow the requirements, if so, call manageSend and pass parameters
    // and return the message, if not, then return null.
    public String registerSend(String name, int problem, String send){
        Concurso concurso=new Concurso(name);
        
        if (concurso.getNumTeams().contains(name) && problem >= 0 && problem < concurso.getNumProblems().length && send!=null && send!=""){
            Envio envio=new Envio(name,problem,send);
            envio.manageSend(name, problem, send);
            return (name+","+send);
        }else{
            return null;
        }
    }
    
    
}
