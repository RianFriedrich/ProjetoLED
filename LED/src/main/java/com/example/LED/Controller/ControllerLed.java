package com.example.LED.Controller;

import com.example.LED.ControlePorta.ControlePorta;
import com.example.LED.model.Estado;
import com.example.LED.repository.LedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;


@Controller
@RequestMapping(path = "/led")
public class ControllerLed {

    @Autowired
    private LedRepository ledRepository;

    ControlePorta porta = new ControlePorta("COM3", 9600);



    @GetMapping (path = "/ligar")
    public String ligar(){
        Estado estado = new Estado();
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        estado.setData(timeStamp);
        estado.setEstado("Ligado");
        ledRepository.save(estado);
        porta.enviaDados(1);
        return "ligado";
    }
    @GetMapping(path = "/desligar")
    public String desligar(){
        Estado estado = new Estado();
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        estado.setData(timeStamp);
        estado.setEstado("Desigado");
        ledRepository.save(estado);
        porta.enviaDados(2);
        return "desligado";
    }
}
