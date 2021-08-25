import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Funcionario funcionario1 = new Funcionario(1, "Maria", "04687900975", 2000.00);
        Funcionario funcionario2 = new Funcionario(2, "Joana", "04787000573", 3000.00);
        Funcionario funcionario3 = new Funcionario(3, "Cecília", "04283900765", 4000.00);

        FuncionarioService serviceFunc = new FuncionarioService();

        serviceFunc.save(funcionario1);
        serviceFunc.save(funcionario2);
        serviceFunc.save(funcionario3);

        funcionario2.setNome(funcionario2.getNome() + " - alterado");

        serviceFunc.update(funcionario2);

        FuncionarioRepository repositoryFunc = new FuncionarioRepository();

        repositoryFunc.findAll();

        repositoryFunc.findById(2);

        Diretor diretor1 = new Diretor(1, "João", "04687900975", 10000.00, 250.00);
        Diretor diretor2 = new Diretor(2, "Carlos", "04687900975", 10000.00, 250.00);
        Diretor diretor3 = new Diretor(3, "José", "04687900975", 10000.00, 250.00);

        DiretorService serviceDir = new DiretorService();

        serviceDir.save(diretor1);
        serviceDir.save(diretor2);
        serviceDir.save(diretor3);

        diretor2.setNome(diretor2.getNome() + " - alterado");

        serviceDir.update(diretor2);

        DiretorRepository repositoryDir = new DiretorRepository();

        repositoryDir.findAll();

        repositoryDir.findById(2);
    }
}
