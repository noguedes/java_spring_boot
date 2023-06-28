package med.voll.api.controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*Esta anotação indica que esta classe deve ser carregada durante a inicialização do projeto */
@RequestMapping("medicos") /*Esta anotação informa ao Spring que esta classe está mapeada na URL /medicos  */
public class MedicoController {

    @PostMapping /*Informa o protocolo HTTP que este método ira lidar (no caso POST) */
    public void cadastrar(@RequestBody /*Esta anotação informa ao Spring que o parametro ==> String json1 deve capiturar o body da requisição */ DadosCadastroMedico dados) {
        System.out.println(dados);
    }
    
}
