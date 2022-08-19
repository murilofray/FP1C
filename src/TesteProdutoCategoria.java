
import br.edu.ifsp.pep.modelo.Categoria;
import br.edu.ifsp.pep.modelo.Produto;
import br.ifsp.edu.pep.dao.CategoriaDAO;
import br.ifsp.edu.pep.dao.ProdutoDAO;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TesteProdutoCategoria {
    public static void main(String[] args) {
            EntityManager em = Persistence
                .createEntityManagerFactory("aula1PU")
                .createEntityManager();
        
        Categoria categoria = new Categoria ();
        categoria.setDescricao("Informática");
        
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        categoriaDAO.inserir(categoria);
        
        Produto produto = new Produto();
        produto.setDescricao("Teclado");
        produto.setPreco(new BigDecimal(60.0));
        produto.setQuantidade(100);
        
        produto.setCategoria(categoria);
        
        ProdutoDAO produtoDao = new ProdutoDAO();
        produtoDao.inserir(produto);
        
        List<Produto> produtos = produtoDao.buscar();
        for (Produto p : produtos) {
            System.out.println("Descrição: " + p.getDescricao());
            System.out.println("Categoria: " + p.getCategoria().getDescricao());
        }
 
    }
    
}
