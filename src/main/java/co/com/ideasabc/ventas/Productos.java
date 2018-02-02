package co.com.ideasabc.ventas;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "productos")
@NamedQueries({
@NamedQuery(name="buscarProductos", query="select a from Productos a where a.descrip_producto like :description")
})
public class Productos implements Serializable{
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int producto_id;
private String codigo_producto;
private String descrip_producto;
private BigDecimal precio1;
private BigDecimal precio2;
private BigDecimal precio3;
private BigDecimal precio4;
private BigDecimal costo;
private int unidad_en_compra;
private BigDecimal equivalencia_en_compra;
private int unidad_en_venta;
private BigDecimal equivalencia_en_venta;
private BigDecimal cant_total;
private BigDecimal cant_minima;
private int Categoria_id;
private int Sub_categoria_id;
private String Acepta_lote;
private BigDecimal valor_inventario;
private String imagen;
private BigDecimal incremento1;
private BigDecimal incremento2;
private BigDecimal incremento3;
private BigDecimal incremento4;
private String codigo_fabricante;
private int producto_fisico;
private int situacion_producto;
private String tipo_producto;
private int bodega_id;
private String mostrar_componente;
private String factura_sin_stock;
private String avisa_expiracion;
private int factura_con_precio;
private String producto_equivalente;
private String cuenta_compra;
private String cuenta_Venta;
private String cuenta_inventario;
private int suplidor1_id;
private int impuesto1_id;
private String impto1_en_vtas;
private String impto1_en_compras;
@Temporal(TemporalType.DATE)
private Date ultima_venta;
private int otro_impto_id;
private String otro_impto_vtas;
private String otro_impto_compras;
private BigDecimal precio_de_compra_0;
@Temporal(TemporalType.DATE)
private Date precio_actualizado;
private String requiere_nro_serie;
private BigDecimal costo_dolar;
private String comentario;
private String comenta_factura;
private int retencion_id;
private String rete_vtas;
private String rete_compras;
private String notas;

public Productos(){

}

public Productos(int producto_id){
    this.producto_id = producto_id;

}
    public int getProducto_id() {
        return producto_id;
    }

    public void setProducto_id(int producto_id) {
        this.producto_id = producto_id;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getDescrip_producto() {
        return descrip_producto;
    }

    public void setDescrip_producto(String descrip_producto) {
        this.descrip_producto = descrip_producto;
    }

    public BigDecimal getPrecio1() {
        return precio1;
    }

    public void setPrecio1(BigDecimal precio1) {
        this.precio1 = precio1;
    }

    public BigDecimal getPrecio2() {
        return precio2;
    }

    public void setPrecio2(BigDecimal precio2) {
        this.precio2 = precio2;
    }

    public BigDecimal getPrecio3() {
        return precio3;
    }

    public void setPrecio3(BigDecimal precio3) {
        this.precio3 = precio3;
    }

    public BigDecimal getPrecio4() {
        return precio4;
    }

    public void setPrecio4(BigDecimal precio4) {
        this.precio4 = precio4;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public int getUnidad_en_compra() {
        return unidad_en_compra;
    }

    public void setUnidad_en_compra(int unidad_en_compra) {
        this.unidad_en_compra = unidad_en_compra;
    }

    public BigDecimal getEquivalencia_en_compra() {
        return equivalencia_en_compra;
    }

    public void setEquivalencia_en_compra(BigDecimal equivalencia_en_compra) {
        this.equivalencia_en_compra = equivalencia_en_compra;
    }

    public int getUnidad_en_venta() {
        return unidad_en_venta;
    }

    public void setUnidad_en_venta(int unidad_en_venta) {
        this.unidad_en_venta = unidad_en_venta;
    }

    public BigDecimal getEquivalencia_en_venta() {
        return equivalencia_en_venta;
    }

    public void setEquivalencia_en_venta(BigDecimal equivalencia_en_venta) {
        this.equivalencia_en_venta = equivalencia_en_venta;
    }

    public BigDecimal getCant_total() {
        return cant_total;
    }

    public void setCant_total(BigDecimal cant_total) {
        this.cant_total = cant_total;
    }

    public BigDecimal getCant_minima() {
        return cant_minima;
    }

    public void setCant_minima(BigDecimal cant_minima) {
        this.cant_minima = cant_minima;
    }

    public int getCategoria_id() {
        return Categoria_id;
    }

    public void setCategoria_id(int Categoria_id) {
        this.Categoria_id = Categoria_id;
    }

    public int getSub_categoria_id() {
        return Sub_categoria_id;
    }

    public void setSub_categoria_id(int Sub_categoria_id) {
        this.Sub_categoria_id = Sub_categoria_id;
    }

    public String getAcepta_lote() {
        return Acepta_lote;
    }

    public void setAcepta_lote(String Acepta_lote) {
        this.Acepta_lote = Acepta_lote;
    }

    public BigDecimal getValor_inventario() {
        return valor_inventario;
    }

    public void setValor_inventario(BigDecimal valor_inventario) {
        this.valor_inventario = valor_inventario;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public BigDecimal getIncremento1() {
        return incremento1;
    }

    public void setIncremento1(BigDecimal incremento1) {
        this.incremento1 = incremento1;
    }

    public BigDecimal getIncremento2() {
        return incremento2;
    }

    public void setIncremento2(BigDecimal incremento2) {
        this.incremento2 = incremento2;
    }

    public BigDecimal getIncremento3() {
        return incremento3;
    }

    public void setIncremento3(BigDecimal incremento3) {
        this.incremento3 = incremento3;
    }

    public BigDecimal getIncremento4() {
        return incremento4;
    }

    public void setIncremento4(BigDecimal incremento4) {
        this.incremento4 = incremento4;
    }

    public String getCodigo_fabricante() {
        return codigo_fabricante;
    }

    public void setCodigo_fabricante(String codigo_fabricante) {
        this.codigo_fabricante = codigo_fabricante;
    }

    public int getProducto_fisico() {
        return producto_fisico;
    }

    public void setProducto_fisico(int producto_fisico) {
        this.producto_fisico = producto_fisico;
    }

    public int getSituacion_producto() {
        return situacion_producto;
    }

    public void setSituacion_producto(int situacion_producto) {
        this.situacion_producto = situacion_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public int getBodega_id() {
        return bodega_id;
    }

    public void setBodega_id(int bodega_id) {
        this.bodega_id = bodega_id;
    }

    public String getMostrar_componente() {
        return mostrar_componente;
    }

    public void setMostrar_componente(String mostrar_componente) {
        this.mostrar_componente = mostrar_componente;
    }

    public String getFactura_sin_stock() {
        return factura_sin_stock;
    }

    public void setFactura_sin_stock(String factura_sin_stock) {
        this.factura_sin_stock = factura_sin_stock;
    }

    public String getAvisa_expiracion() {
        return avisa_expiracion;
    }

    public void setAvisa_expiracion(String avisa_expiracion) {
        this.avisa_expiracion = avisa_expiracion;
    }

    public int getFactura_con_precio() {
        return factura_con_precio;
    }

    public void setFactura_con_precio(int factura_con_precio) {
        this.factura_con_precio = factura_con_precio;
    }

    public String getProducto_equivalente() {
        return producto_equivalente;
    }

    public void setProducto_equivalente(String producto_equivalente) {
        this.producto_equivalente = producto_equivalente;
    }

    public String getCuenta_compra() {
        return cuenta_compra;
    }

    public void setCuenta_compra(String cuenta_compra) {
        this.cuenta_compra = cuenta_compra;
    }

    public String getCuenta_Venta() {
        return cuenta_Venta;
    }

    public void setCuenta_Venta(String cuenta_Venta) {
        this.cuenta_Venta = cuenta_Venta;
    }

    public String getCuenta_inventario() {
        return cuenta_inventario;
    }

    public void setCuenta_inventario(String cuenta_inventario) {
        this.cuenta_inventario = cuenta_inventario;
    }

    public int getSuplidor1_id() {
        return suplidor1_id;
    }

    public void setSuplidor1_id(int suplidor1_id) {
        this.suplidor1_id = suplidor1_id;
    }

    public int getImpuesto1_id() {
        return impuesto1_id;
    }

    public void setImpuesto1_id(int impuesto1_id) {
        this.impuesto1_id = impuesto1_id;
    }

    public String getImpto1_en_vtas() {
        return impto1_en_vtas;
    }

    public void setImpto1_en_vtas(String impto1_en_vtas) {
        this.impto1_en_vtas = impto1_en_vtas;
    }

    public String getImpto1_en_compras() {
        return impto1_en_compras;
    }

    public void setImpto1_en_compras(String impto1_en_compras) {
        this.impto1_en_compras = impto1_en_compras;
    }

    public Date getUltima_venta() {
        return ultima_venta;
    }

    public void setUltima_venta(Date ultima_venta) {
        this.ultima_venta = ultima_venta;
    }

    public int getOtro_impto_id() {
        return otro_impto_id;
    }

    public void setOtro_impto_id(int otro_impto_id) {
        this.otro_impto_id = otro_impto_id;
    }

    public String getOtro_impto_vtas() {
        return otro_impto_vtas;
    }

    public void setOtro_impto_vtas(String otro_impto_vtas) {
        this.otro_impto_vtas = otro_impto_vtas;
    }

    public String getOtro_impto_compras() {
        return otro_impto_compras;
    }

    public void setOtro_impto_compras(String otro_impto_compras) {
        this.otro_impto_compras = otro_impto_compras;
    }

    public BigDecimal getPrecio_de_compra_0() {
        return precio_de_compra_0;
    }

    public void setPrecio_de_compra_0(BigDecimal precio_de_compra_0) {
        this.precio_de_compra_0 = precio_de_compra_0;
    }

    public Date getPrecio_actualizado() {
        return precio_actualizado;
    }

    public void setPrecio_actualizado(Date precio_actualizado) {
        this.precio_actualizado = precio_actualizado;
    }

    public String getRequiere_nro_serie() {
        return requiere_nro_serie;
    }

    public void setRequiere_nro_serie(String requiere_nro_serie) {
        this.requiere_nro_serie = requiere_nro_serie;
    }

    public BigDecimal getCosto_dolar() {
        return costo_dolar;
    }

    public void setCosto_dolar(BigDecimal costo_dolar) {
        this.costo_dolar = costo_dolar;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComenta_factura() {
        return comenta_factura;
    }

    public void setComenta_factura(String comenta_factura) {
        this.comenta_factura = comenta_factura;
    }

    public int getRetencion_id() {
        return retencion_id;
    }

    public void setRetencion_id(int retencion_id) {
        this.retencion_id = retencion_id;
    }

    public String getRete_vtas() {
        return rete_vtas;
    }

    public void setRete_vtas(String rete_vtas) {
        this.rete_vtas = rete_vtas;
    }

    public String getRete_compras() {
        return rete_compras;
    }

    public void setRete_compras(String rete_compras) {
        this.rete_compras = rete_compras;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

}
