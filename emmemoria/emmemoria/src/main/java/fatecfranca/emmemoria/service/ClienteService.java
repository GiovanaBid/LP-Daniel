package fatecfranca.emmemoria.service;

import fatecfranca.emmemoria.model.Cliente;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> lista = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cliente> listar(){
        return this.lista;
    }

    public Cliente criar(Cliente c){
        c.setId(nextId++);
        this.lista.add(c);
        return c;
    }

    public boolean remover(Long id){
        for (int i = 0; i < this.lista.size(); i++){
            if (lista.get(i).getId().equals(id)){
                this.lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cliente atualizar(Long id, Cliente novo){
        for(int i = 0; i < lista.size(); i++){
            if (lista.get(i).getId().equals(id)){
                novo.setId(id);
                lista.set(i, novo);
                return novo;
            }
        }
        return null;
    }
}