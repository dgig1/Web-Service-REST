package vagasws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpresaController {

    @Autowired
    private EmpresaRepo empresaRepo;

    @GetMapping("/vagasws/api/empresa")
    public Iterable<Empresa> getEmpresas() {
        Iterable<Empresa> empresa = empresaRepo.findAll();
        return empresa;
    }

    @PostMapping("/vagasws/api/empresa")
    public Empresa createEmpresa(@RequestBody Empresa e) {
        return empresaRepo.save(e);
        }
}
