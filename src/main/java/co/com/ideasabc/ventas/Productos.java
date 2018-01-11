package co.com.ideasabc.ventas;

public class Productos {
    private String Codigo;
    private String Descripcion;
    private Long Costo;
    private String Categoria;

    public Productos(){
            }

    public Productos(String Codigo, String Descripcion, Long Costo, String Categoria){
        setCodigo(Codigo);
        setDescripcion(Descripcion);
        setCosto(Costo);
        setCategoria(Categoria);
    }

    public String getCodigo(){
        return this.Codigo;
    }

    public void setCodigo(String codigo){
        this.Codigo = codigo;
    }

    public String getDescripcion(){
        return this.Descripcion;
    }

    public void setDescripcion(String descripcion){
        this.Descripcion = descripcion;
    }

    public Long getCosto(){
        return this.Costo;
    }

    public void setCosto(Long costo){
        this.Costo=costo;
    }

    public String getCategoria(){
        return this.Categoria;
    }

    public void setCategoria(String categoria){
        this.Categoria=categoria;
    }
}
