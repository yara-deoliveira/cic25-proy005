package es.cic.curso25.proy005;

import org.springframework.stereotype.Service;

@Service
//Cuando haya dependencias de bbdd - JPA y h2 -> @Transaction
public class TelefonoService {

    //Contiene Lógica de Negocio - de tipo CRUD
    //En orden:

    private long contador = 0;

    public long create(Telefono telefono) {

        return ++contador; //Primero incrementa y pasa a valer 1
    }


}
