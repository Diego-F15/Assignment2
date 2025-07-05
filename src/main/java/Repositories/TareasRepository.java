package Repositories;

import Entidades.Tareas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareasRepository extends JpaRepository<Tareas, Integer> {
    List<Tareas> findByDisponible(boolean disponible);
}
