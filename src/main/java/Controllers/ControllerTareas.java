package Controllers;

import Entidades.Tareas;
import Services.TareasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareasMetaphorceAPI/tareas")
public class ControllerTareas {
    @Autowired
    TareasService tareasService;

    @GetMapping
    public ResponseEntity<List<Tareas>> listarTareas(){
        return ResponseEntity.ok(tareasService.getAllTareas());
    }

    @PostMapping
    public ResponseEntity<?> agregarTareas(@RequestBody Tareas newTareas){
        return ResponseEntity.ok(tareasService.agregarTareas(newTareas));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarTareas(@PathVariable("id") Integer id, @RequestBody Tareas newTareas){
        return ResponseEntity.ok(tareasService.actualizarTareas(id,newTareas));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTareas(@PathVariable("id") Integer id){
        return ResponseEntity.ok(eliminarTareas(id));
    }

    @GetMapping("/noCompletadas")
    public ResponseEntity<List<Tareas>> listarCompletadas(){
        return ResponseEntity.ok(tareasService.getTareasByCompletado(false));
    }


}
