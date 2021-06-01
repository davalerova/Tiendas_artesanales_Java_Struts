/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Ciudad;
import model.Rol;
import model.RolUsuario;
import model.Usuario;
import model.TipoDocumentoIdentidad;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import services.CiudadService;
import services.RolService;
import services.RolUsuarioService;
import services.UsuarioService;
import services.TipoDocumentoIdentidadService;

/**
 *
 * @author daval
 */
public class UsuarioController extends ActionSupport implements SessionAware {

    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<TipoDocumentoIdentidad> listaTiposDocumentoIdentidad = new ArrayList<>();
    private List<String> listaTiposDocumentoIdentidadString = new ArrayList<>();
    private List<Ciudad> listaCiudades = new ArrayList<>();
    private List<String> listaCiudadesString = new ArrayList<>();
    private List<RolUsuario> listaRolesUsuario = new ArrayList<>();
    private UsuarioService usuarioService = new UsuarioService();
    private TipoDocumentoIdentidadService tipoDocumentoIdentidadService = new TipoDocumentoIdentidadService();
    private CiudadService ciudadService = new CiudadService();
    private Usuario usuario = new Usuario();
    private String id;
    private String numDocIdent;
    private String tipoDocumentoIdentidad;
    private String ciudad;
    private RolUsuario rolUsuario;
    private RolService rolService = new RolService();
    private RolUsuarioService rolUsuarioService = new RolUsuarioService();
    private Rol rol = new Rol();
    private String nickname;
    private String contrasena;
    private Map<String, String> sessionMap;

    @Override
    public String execute() throws Exception {
        if (this.validarSesion()) {
            return SUCCESS;
        } else {
            return ERROR;
        }

    }

    public boolean validarSesion() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String s = (String) session.getAttribute("login");
        if (s != null && !s.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public String findUsuarioById() {
        this.usuario = this.usuarioService.findById(Integer.parseInt(this.id));
        if (this.usuario == null || String.valueOf(this.usuario.getId()) == null) {
            addFieldError("id", "El usuario con número de id " + this.id + " no se encuentra registrada en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }

    public String findUsuarioByNumeroDocumentoIdentidad() {
        this.usuario = this.usuarioService.findByNumeroDocumentoIdentidad(this.numDocIdent);
        if (this.usuario == null || this.usuario.getNumeroDocumentoIdentidad() == null) {
            addFieldError("numDocIdent", "El usuario con número de número de documemnto de identidad " + this.numDocIdent + " no se encuentra registrado en el sistema");
            return INPUT;
        } else {
            return SUCCESS;

        }
    }

    public void devolverTodos() {
        listaUsuarios.clear();
        listaUsuarios = usuarioService.findAll();
    }

    public void encontrarPorId() {
        usuario = new Usuario();
        usuario = usuarioService.findById(Integer.parseInt(id));
    }

    public String insertar() {
        usuarioService.insert(usuario);
        return SUCCESS;
    }

    public String actualizar() {
        usuarioService.update(usuario);
        return SUCCESS;
    }

    public String save() {
        usuario.setTipoDocumentoIdentidad(tipoDocumentoIdentidadService.findByDescripcion("Cédula de ciudadanía"));
        usuario.setCiudad(ciudadService.findByDescripcion(ciudad));
        rol = rolService.findById(4);

        System.out.println("Ayudaaaaaaaaa");
        System.out.println(usuario);
        usuarioService.insert(usuario);
        return SUCCESS;
    }

    public void eliminar() {
        usuarioService.delete(usuario);
        usuario = new Usuario();
    }

    public String back() {
        return SUCCESS;
    }

    public String add() {
        usuario = new Usuario();
        listaTiposDocumentoIdentidad = tipoDocumentoIdentidadService.findAll();
        for (TipoDocumentoIdentidad tipoDocumento : listaTiposDocumentoIdentidad) {
            listaTiposDocumentoIdentidadString.add(tipoDocumento.getDescripcion());
            System.out.println("Prueba lista tipo documento identidad: " + tipoDocumento.getDescripcion());
        }

        listaCiudades = ciudadService.findAll();
        for (Ciudad ciud : listaCiudades) {
            listaCiudadesString.add(ciud.getDescripcion());
        }
        return SUCCESS;
    }

    public String validarCredenciales() {

        this.usuario = this.usuarioService.findByNickname(nickname);
        if (this.usuario == null) {

            return INPUT;
        } else if (!this.usuario.getContrasena().equals(contrasena)) {

            addFieldError("nickname", "Usuario o contraseña incorrectos");
            return INPUT;
        } else {
            this.listaRolesUsuario = rolUsuarioService.findByIdUsuario(this.usuario.getId());
            this.sessionMap.put("login", "true");
            return SUCCESS;
        }
    }
    
    public String logout() {
        this.sessionMap.clear();
        return "success";
    }

    public String insertarUsuarioCliente() {
        return SUCCESS;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<TipoDocumentoIdentidad> getListaTiposDocumentoIdentidad() {
        return listaTiposDocumentoIdentidad;
    }

    public void setListaTiposDocumentoIdentidad(List<TipoDocumentoIdentidad> listaTiposDocumentoIdentidad) {
        this.listaTiposDocumentoIdentidad = listaTiposDocumentoIdentidad;
    }

    public List<String> getListaTiposDocumentoIdentidadString() {
        return listaTiposDocumentoIdentidadString;
    }

    public void setListaTiposDocumentoIdentidadString(List<String> listaTiposDocumentoIdentidadString) {
        this.listaTiposDocumentoIdentidadString = listaTiposDocumentoIdentidadString;
    }

    public List<Ciudad> getListaCiudades() {
        return listaCiudades;
    }

    public void setListaCiudades(List<Ciudad> listaCiudades) {
        this.listaCiudades = listaCiudades;
    }

    public List<String> getListaCiudadesString() {
        return listaCiudadesString;
    }

    public void setListaCiudadesString(List<String> listaCiudadesString) {
        this.listaCiudadesString = listaCiudadesString;
    }

    public UsuarioService getUsuarioService() {
        return usuarioService;
    }

    public void setUsuarioService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public TipoDocumentoIdentidadService getTipoDocumentoIdentidadService() {
        return tipoDocumentoIdentidadService;
    }

    public void setTipoDocumentoIdentidadService(TipoDocumentoIdentidadService tipoDocumentoIdentidadService) {
        this.tipoDocumentoIdentidadService = tipoDocumentoIdentidadService;
    }

    public CiudadService getCiudadService() {
        return ciudadService;
    }

    public void setCiudadService(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumDocIdent() {
        return numDocIdent;
    }

    public void setNumDocIdent(String numeroDocuementoIdentidad) {
        this.numDocIdent = numeroDocuementoIdentidad;
    }

    public String getTipoDocumentoIdentidad() {
        return tipoDocumentoIdentidad;
    }

    public void setTipoDocumentoIdentidad(String tipoDocumentoIdentidad) {
        this.tipoDocumentoIdentidad = tipoDocumentoIdentidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public RolUsuario getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(RolUsuario rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public RolService getRolService() {
        return rolService;
    }

    public void setRolService(RolService rolService) {
        this.rolService = rolService;
    }

    public RolUsuarioService getRolUsuarioService() {
        return rolUsuarioService;
    }

    public void setRolUsuarioService(RolUsuarioService rolUsuarioService) {
        this.rolUsuarioService = rolUsuarioService;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public List<RolUsuario> getListaRolesUsuario() {
        return listaRolesUsuario;
    }

    public void setListaRolesUsuario(List<RolUsuario> listaRolesUsuario) {
        this.listaRolesUsuario = listaRolesUsuario;
    }

    public void setSession(Map map) {
        this.sessionMap = (SessionMap) map;
    }

}
