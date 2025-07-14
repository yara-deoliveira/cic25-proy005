package es.cic.curso25.proy005;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/telefono")
public class TelefonoController {


    //Operaciones CRUD (Create, Read, Update, Delete)





    @GetMapping
    public String mensaje() {
        return "Hola mundo";
    }

}
