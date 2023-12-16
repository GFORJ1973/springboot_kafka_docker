package br.com.hgl.kafka.producer.resource;


import br.com.hgl.kafka.producer.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
public class MensagemResource {
    @Autowired
    MensagemService mensagemService;

    @PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody String mensagem){
        mensagemService.sendMessage(mensagem);
        return ResponseEntity.ok().body("Mensagem enviada com sucesso: " + mensagem);
    }
}
