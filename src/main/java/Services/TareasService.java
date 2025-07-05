package Services;

import Entidades.Tareas;
import java.util.List;
import java.util.Optional;


public interface TareasService {
    List<Tareas> getAllTareas();
    List<Tareas> getTareasByCompletado(boolean completado);
    Tareas agregarTareas(Tareas t);
    Tareas actualizarTareas(Integer id, Tareas t);
    void eliminarTareas(Integer id);
}
