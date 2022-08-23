
import br.edu.ifsp.pep.modelo.Acessorio;
import br.edu.ifsp.pep.modelo.Veiculo;
import br.ifsp.edu.pep.dao.AcessorioDAO;
import br.ifsp.edu.pep.dao.CategoriaDAO;
import br.ifsp.edu.pep.dao.VeiculoDAO;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class TesteVeiculoAcessorio {
    private static VeiculoDAO veiculoDAO = new VeiculoDAO();
    public static void main(String[] args) {
        adicionarVeiculo();
    }
     private static void adicionarVeiculo() {
        AcessorioDAO acessorioDAO = new AcessorioDAO();
        for (int i = 0; i < 10; i++) {
            Acessorio acessorio = new Acessorio();
            acessorio.setDescricao("Acessorio " + i);
            acessorioDAO.inserir(acessorio);

            Veiculo veiculo = new Veiculo();
            veiculo.setAcessorios(acessorioDAO.buscar());
            veiculo.setAnoFabricacao(2009);
            veiculo.setAnoModelo(2010);
            veiculo.setDataCadastro(new Date());
            veiculo.setFabricante("Ford");
            veiculo.setModelo("Edge");
            veiculo.setTipoCombustivel("Gasolina");
            veiculo.setValor(new BigDecimal(60.0 * (i + 1)));
            
            veiculoDAO.inserir(veiculo);
        }
    }
}
