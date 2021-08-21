import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Funcionario funcionario = new Funcionario(1, "Maria", "04687900975", 2000.00);
//
//        FuncionarioService service = new FuncionarioService();
//
//        service.save(funcionario);
//
//        funcionario.setNome(funcionario.getNome() + " - alterado");
//
//        service.update(funcionario);
//
//        FuncionarioRepository repository = new FuncionarioRepository();
//
//        repository.findAll();
//
//        repository.findById(1);

        Diretor diretor1 = new Diretor(1, "João", "04687900975", 10000.00, 250.00);
        Diretor diretor2 = new Diretor(2, "Carlos", "04687900975", 10000.00, 250.00);
        Diretor diretor3 = new Diretor(3, "José", "04687900975", 10000.00, 250.00);

        DiretorService service = new DiretorService();

        service.save(diretor1);
        service.save(diretor2);
        service.save(diretor3);

        diretor2.setNome(diretor2.getNome() + " - alterado");

        service.update(diretor2);

        DiretorRepository repository = new DiretorRepository();

        repository.findAll();

        repository.findById(2);
    }
}
