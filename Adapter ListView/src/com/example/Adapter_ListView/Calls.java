package com.example.Adapter_ListView;

/**
 * Created with IntelliJ IDEA.
 * User: Brounie
 * Date: 30/05/13
 * Time: 11:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Calls implements Comparable<Calls>{
    private String nombreContacto;
    private String horaLlamada;
    private String fechaLlamada;
    private int icon;
    private int avatar;

    public Calls(String nombre, String hora, int icon){
        setNombreContacto(nombre);
        setHoraLlamada(hora);
        setIcon(icon);
    }

    public Calls(String nombre, String hora, String fecha, int avatar){
        setNombreContacto(nombre);
        setHoraLlamada(hora);
        setFechaLlamada(fecha);
        setAvatar(avatar);
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getHoraLlamada() {
        return horaLlamada;
    }

    public void setHoraLlamada(String horaLlamada) {
        this.horaLlamada = horaLlamada;
    }

    public String getFechaLlamada() {
        return fechaLlamada;
    }

    public void setFechaLlamada(String fechaLlamada) {
        this.fechaLlamada = fechaLlamada;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    @Override
    public int compareTo(Calls contacto) {
        return this.getNombreContacto().compareTo(contacto.getNombreContacto());
    }
}
