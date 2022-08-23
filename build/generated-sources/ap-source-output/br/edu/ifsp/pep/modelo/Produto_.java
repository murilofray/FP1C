package br.edu.ifsp.pep.modelo;

import br.edu.ifsp.pep.modelo.Categoria;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-23T07:51:50")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, BigDecimal> preco;
    public static volatile SingularAttribute<Produto, Categoria> categoria;
    public static volatile SingularAttribute<Produto, Integer> id;
    public static volatile SingularAttribute<Produto, Integer> quantidade;
    public static volatile SingularAttribute<Produto, String> descricao;

}