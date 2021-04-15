package model;
// Generated 25/03/2021 09:05:30 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * RolUsuario generated by hbm2java
 */
public class RolUsuario  implements java.io.Serializable {


     private int id;
     private Rol rol;
     private Usuario usuario;
     private Set estadoAprobacionRolUsuarios = new HashSet(0);

    public RolUsuario() {
    }

	
    public RolUsuario(int id, Rol rol, Usuario usuario) {
        this.id = id;
        this.rol = rol;
        this.usuario = usuario;
    }
    public RolUsuario(int id, Rol rol, Usuario usuario, Set estadoAprobacionRolUsuarios) {
       this.id = id;
       this.rol = rol;
       this.usuario = usuario;
       this.estadoAprobacionRolUsuarios = estadoAprobacionRolUsuarios;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Set getEstadoAprobacionRolUsuarios() {
        return this.estadoAprobacionRolUsuarios;
    }
    
    public void setEstadoAprobacionRolUsuarios(Set estadoAprobacionRolUsuarios) {
        this.estadoAprobacionRolUsuarios = estadoAprobacionRolUsuarios;
    }




}

