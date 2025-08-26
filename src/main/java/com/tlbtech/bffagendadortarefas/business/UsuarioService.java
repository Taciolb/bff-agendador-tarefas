package com.tlbtech.bffagendadortarefas.business;


import com.tlbtech.bffagendadortarefas.business.dto.in.EnderecoDTORequest;
import com.tlbtech.bffagendadortarefas.business.dto.in.LoginRequestDTO;
import com.tlbtech.bffagendadortarefas.business.dto.in.TelefoneDTORequest;
import com.tlbtech.bffagendadortarefas.business.dto.in.UsuarioDTORequest;
import com.tlbtech.bffagendadortarefas.business.dto.out.EnderecoDTOResponse;
import com.tlbtech.bffagendadortarefas.business.dto.out.TelefoneDTOResponse;
import com.tlbtech.bffagendadortarefas.business.dto.out.UsuarioDTOResponse;
import com.tlbtech.bffagendadortarefas.infrastructure.client.UsuarioClient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioClient client;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO) {

        return client.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginRequestDTO dto){

        return client.login(dto);
    }

    public UsuarioDTOResponse buscarUsuarioPorEmail(String email, String token) {

       return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token) {

        client.deleteUsuarioPorEmail(email,token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto){

        return client.atualizDadoUsuario(dto, token);

    }

    public EnderecoDTOResponse atualizaEndereço(Long idEndereco, EnderecoDTORequest enderecoDTO, String token){

        return client.atualizaEndereco(enderecoDTO,idEndereco,token);

    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest dto, String token) {

        return client.atualizaTelefone(dto, idTelefone,token);

    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto){

        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto){

        return client.cadastraTelefone(dto, token);
    }
}
