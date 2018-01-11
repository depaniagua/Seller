package co.com.ideasabc.ventas;
import java.util.LinkedList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service/")
public class services {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Productos> getData(){
        List<Productos> result = new LinkedList<>();
        result.add(new Productos("1010", "Lapiz", new Long(1200), "Papelería"));
        result.add(new Productos("1020", "Casa", new Long(5000), "Otros"));
        return result;        
    }    
}
