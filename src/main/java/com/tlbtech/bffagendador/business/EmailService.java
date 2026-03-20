package com.tlbtech.bffagendador.business;


import com.tlbtech.bffagendador.business.dto.out.TarefasDTOResponse;
import com.tlbtech.bffagendador.infrastructure.client.EmailClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final EmailClient emailClient;

    public void enviaEmail(TarefasDTOResponse dto) {
        emailClient.enviarEmail(dto);
    }


}