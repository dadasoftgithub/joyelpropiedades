package ar.com.dadasoft.app.pojos;


public class InmueblePojo {

    private Long idTipoPropiedad;  //TipoPropiedad
    private Integer esVenta;
    private Integer importe;
    private Integer superficie;
    private String calle;
    private Integer altura;
    private Long idLocalidad;     //Localidad
    private String descripcion;
    private Long idEstado;        //Estado
    private String cantAmbiente;
    private String piso;
    private String depto;
    private Integer aptoCredito;


    public InmueblePojo() {
    }

    public InmueblePojo(Long idTipoPropiedad, Integer esVenta, Integer importe, Integer superficie, String calle, Integer altura, Long idLocalidad, String descripcion, Long idEstado, String cantAmbiente, String piso, String depto, Integer aptoCredito) {
        this.idTipoPropiedad = idTipoPropiedad;
        this.esVenta = esVenta;
        this.importe = importe;
        this.superficie = superficie;
        this.calle = calle;
        this.altura = altura;
        this.idLocalidad = idLocalidad;
        this.descripcion = descripcion;
        this.idEstado = idEstado;
        this.cantAmbiente = cantAmbiente;
        this.piso = piso;
        this.depto = depto;
        this.aptoCredito = aptoCredito;
    }


    public Long getIdTipoPropiedad() {
        return idTipoPropiedad;
    }

    public void setIdTipoPropiedad(Long idTipoPropiedad) {
        this.idTipoPropiedad = idTipoPropiedad;
    }

    public Integer getEsVenta() {
        return esVenta;
    }

    public void setEsVenta(Integer esVenta) {
        this.esVenta = esVenta;
    }

    public Integer getImporte() {
        return importe;
    }

    public void setImporte(Integer importe) {
        this.importe = importe;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
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

    public Integer getAptoCredito() {
        return aptoCredito;
    }

    public void setAptoCredito(Integer aptoCredito) {
        this.aptoCredito = aptoCredito;
    }
}
