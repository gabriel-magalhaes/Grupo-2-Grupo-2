/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.net.URL;
import type.TipoPersonal;

/**
 *
 * @author Tamires
 */
public class Personal extends Pessoa{
    public long id;
    public TipoPersonal especialidade;
    private URL pagina;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoPersonal getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(TipoPersonal especialidade) {
        this.especialidade = especialidade;
    }

    public URL getPagina() {
        return pagina;
    }

    public void setPagina(URL pagina) {
        this.pagina = pagina;
    }
   
    
}
