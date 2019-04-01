package br.com.home.resource;

import br.com.home.domain.Veiculo;
import br.com.home.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VeiculoResource {

    @Autowired
    VeiculoRepository repository;

    @RequestMapping(value = "/veiculo", method = RequestMethod.POST)
    public String cadastra(Model model, Veiculo veiculo) {
        repository.create(veiculo);
        model.addAttribute("veiculo", veiculo);
        return "cadastrado";
    }

    @RequestMapping("/")
    public String acessa() {
        return "cadastrado";
    }
}
