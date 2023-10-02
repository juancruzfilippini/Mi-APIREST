package com.example.demo.services;

import com.example.demo.entities.Base;
import com.example.demo.entities.Localidad;
import com.example.demo.entities.Persona;
import com.example.demo.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository){
        super(baseRepository);
    }

}
