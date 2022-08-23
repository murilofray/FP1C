package br.edu.ifsp.pep.modelo;

import br.edu.ifsp.pep.modelo.Acessorio;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-23T07:51:50")
@StaticMetamodel(Veiculo.class)
public class Veiculo_ { 

    public static volatile SingularAttribute<Veiculo, Integer> codigo;
    public static volatile SingularAttribute<Veiculo, String> tipoCombustivel;
    public static volatile SingularAttribute<Veiculo, BigDecimal> valor;
    public static volatile SingularAttribute<Veiculo, Integer> anoFabricacao;
    public static volatile ListAttribute<Veiculo, Acessorio> acessorios;
    public static volatile SingularAttribute<Veiculo, Integer> anoModelo;
    public static volatile SingularAttribute<Veiculo, String> fabricante;
    public static volatile SingularAttribute<Veiculo, Date> dataCadastro;
    public static volatile SingularAttribute<Veiculo, String> modelo;

}