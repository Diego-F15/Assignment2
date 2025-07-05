package Services;

import Entidades.Tareas;
import Repositories.TareasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TareasServiceImplement implements TareasService {
    private TareasRepository tareasRepository;

    @Autowired
    public TareasServiceImplement(TareasRepository tareasRepository) {
        this.tareasRepository = tareasRepository;
    }

    @Override
    public List<Tareas> getAllTareas(){return tareasRepository.findAll();}

    @Override
    public List<Tareas> getTareasByCompletado(boolean completado){return tareasRepository.findByDisponible(completado);}

    @Override
    public Tareas agregarTareas(Tareas tareas){
        return tareasRepository.save(tareas);
    }

    @Override
    public Tareas actualizarTareas(Integer id, Tareas tareas){
        tareas.setId(id);
        return tareasRepository.save(tareas);
    }

    @Override
    public void eliminarTareas(Integer id){
        tareasRepository.deleteById(id);
    }
}
