public class WandaSwitchAntigo{

public static void main(String[] args) {
    String faseWanda = "Wandavision";
    String status;
    switch (faseWanda) {
        case "Wandavision":
            
        status = "Criaçao do hex vida suburbana.";

            break;
        
        case "Vingadora":
            status = "Heroína em treinamento";

            break;
        
        case "Feitiçeira Escalarte":
            status  = "Domínio da magia do caos.";

            break;
    
        default:
            status = "Fase Desconhecida";
            break;
    }

    System.out.println("Status: " + status);

}

}