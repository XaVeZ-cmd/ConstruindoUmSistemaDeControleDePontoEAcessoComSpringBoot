package com.dio.live.service;

import com.dio.live.model.NivelAcesso;
import com.dio.live.model.TipoData;
import com.dio.live.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {

    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository){
        this.nivelAcessoRepository = nivelAcessoRepository;
    }
    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso); //cria e retorna o objeto
    }

    public List<NivelAcesso> findAll() {
        return nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long idNiveAcesso) {
        return nivelAcessoRepository.findById(idNiveAcesso);
    }

    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso); //update retorna o objeto
    }

    public void deleteNivelAcessoById(Long idNiveAcesso) {
        nivelAcessoRepository.deleteById(idNiveAcesso);
    }//deleta


}