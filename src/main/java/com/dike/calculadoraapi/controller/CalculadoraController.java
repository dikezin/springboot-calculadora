package com.dike.calculadoraapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.dike.calculadoraapi.service.CalculadoraService;
import com.dike.calculadoraapi.model.Resultado;

@RestController

public class CalculadoraController {
    private CalculadoraService calculadoraService;
    public CalculadoraController (CalculadoraService calculadoraService){
        this.calculadoraService=calculadoraService;
    }
    @GetMapping("/sumar")
public Resultado sumar (@RequestParam int a, @RequestParam int b){
        int resultado=calculadoraService.sumar(a,b);
        return new Resultado ("Suma ",  resultado);
    }
    @GetMapping("/restar")
public int restar (@RequestParam int a, @RequestParam int b){
        return calculadoraService.restar(a,b);
}
    @GetMapping("/multiplicar")
public int multiplicar (@RequestParam int a, @RequestParam int b){
        return calculadoraService.multiplicar(a,b);
    }
    @GetMapping("/dividir")
    public int dividir (@RequestParam int a, @RequestParam int b){
        return calculadoraService.multiplicar(a,b);
    }
}
