package com.tlbtech.bffagendadortarefas.business;


import com.tlbtech.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import com.tlbtech.bffagendadortarefas.infrastructure.client.EmailClient;
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
