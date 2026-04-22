package med.voll.api.controller;

import med.voll.api.medico.DaddosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")

public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DaddosCadastroMedico dados) {
        System.out.println(dados);
    }
}
