package cl.zerodevelopment.sismoschile;

public class SismosLista {
    private String Fecha;
    private String Latitud;
    private String Longitud;
    private String Profundidad ;
    private String Magnitud;
    private String Agencia;
    private String RefGeografica;
    private String FechaUpdate;

    public SismosLista(String fecha, String latitud, String longitud, String profundidad, String magnitud, String agencia, String refGeografica, String fechaUpdate) {
        Fecha = fecha;
        Latitud = latitud;
        Longitud = longitud;
        Profundidad = profundidad;
        Magnitud = magnitud;
        Agencia = agencia;
        RefGeografica = refGeografica;
        FechaUpdate = fechaUpdate;
    }

    public String getFecha() {
        return Fecha;
    }



    public String getLatitud() {
        return Latitud;
    }



    public String getLongitud() {
        return Longitud;
    }



    public String getProfundidad() {
        return Profundidad;
    }



    public String getMagnitud() {
        return Magnitud;
    }



    public String getAgencia() {
        return Agencia;
    }



    public String getRefGeografica() {
        return RefGeografica;
    }


    public String getFechaUpdate() {
        return FechaUpdate;
    }
}

