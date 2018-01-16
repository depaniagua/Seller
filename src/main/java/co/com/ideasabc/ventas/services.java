package co.com.ideasabc.ventas;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service/")
public class services {
    private EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("VentasPU");

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Productos> getData(){
        List<Productos> result = new ArrayList<>();        
        EntityManager em = emf.createEntityManager();
        
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Productos.class));
        Query q = em.createQuery(cq);

        result = q.getResultList();
  
      return result;   

    }    
}
