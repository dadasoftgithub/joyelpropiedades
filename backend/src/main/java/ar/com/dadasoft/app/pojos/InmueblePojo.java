package ar.com.dadasoft.app.pojos;


public class InmueblePojo {

    private Integer esVenta;
    private Long idTipoPropiedad;  //TipoPropiedad
    private Integer superficie;
    private String cantAmbiente;
    private String piso;
    private String depto;
    private Long idEstado;        //Estado
    private String calle;
    private Integer altura;
    private Long idLocalidad;     //Localidad
    private boolean aptoCredito;
    private Integer importe;
    private String descripcion;



    public InmueblePojo() {
    }

    public InmueblePojo(Integer esVenta, Long idTipoPropiedad, Integer superficie, String cantAmbiente, String piso, String depto, Long idEstado, String calle, Integer altura, Long idLocalidad, boolean aptoCredito, Integer importe, String descripcion) {
        this.esVenta = esVenta;
        this.idTipoPropiedad = idTipoPropiedad;
        this.superficie = superficie;
        this.cantAmbiente = cantAmbiente;
        this.piso = piso;
        this.depto = depto;
        this.idEstado = idEstado;
        this.calle = calle;
        this.altura = altura;
        this.idLocalidad = idLocalidad;
        this.aptoCredito = aptoCredito;
        this.importe = importe;
        this.descripcion = descripcion;
    }



    public Integer getEsVenta() {
        return esVenta;
    }

    public void setEsVenta(Integer esVenta) {
        this.esVenta = esVenta;
    }

    public Long getIdTipoPropiedad() {
        return idTipoPropiedad;
    }

    public void setIdTipoPropiedad(Long idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public String getCantAmbiente() {
        return cantAmbiente;
    }

    public void setCantAmbiente(String cantAmbiente) {
        this.cantAmbiente = cantAmbiente;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Long getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public boolean isAptoCredito() {
        return aptoCredito;
    }

    public void setAptoCredito(boolean aptoCredito) {
        this.aptoCredito = aptoCredito;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
