/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import clases.Perfil;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author anton
 */
@Local
public interface Perfiles {
    
    public List<Perfil> getPerfiles();
    public Perfil getPerfil(Perfil.Rol id) throws PerfilInexistenteException;
    
}
