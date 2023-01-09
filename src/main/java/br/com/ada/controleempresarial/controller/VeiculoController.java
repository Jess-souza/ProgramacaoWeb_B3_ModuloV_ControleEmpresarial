package br.com.ada.controleempresarial.controller;

import br.com.ada.controleempresarial.model.Veiculo;
import br.com.ada.controleempresarial.service.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping("/veiculos")
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    @GetMapping("/veiculos")
    public List<Veiculo> listar() {
        return veiculoService.listar();
    }

    @GetMapping("/{id}")
    public Veiculo buscarPorId(@PathVariable Long id) {
        return veiculoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable Long id) {
        veiculoService.deletarPorId(id);
    }

    @GetMapping("/veiculos/{anoFabricacao}")
    public Veiculo buscarPorAno(@PathVariable int anoFabricacao) {
        return veiculoService.buscarPorAno(anoFabricacao);
    }
}
