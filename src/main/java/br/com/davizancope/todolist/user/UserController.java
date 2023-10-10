package br.com.davizancope.todolist.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")

public class UserController {

    /*
     * TIPOS DE RETORNO
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (double) numeros 0.0000
     * Float (float) numeros 0.000
     * char (caracteres) A, B, C
     * Date (data)
     * Void (sem retorno)
     */

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
