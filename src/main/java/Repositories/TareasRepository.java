package Repositories;

import Entidades.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareasRepository extends JpaRepository<Tareas, Integer> {
}
