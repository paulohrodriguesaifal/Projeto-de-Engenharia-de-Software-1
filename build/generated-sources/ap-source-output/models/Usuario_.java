package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Disciplina;
import models.Prova;
import models.Questao;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-22T20:27:33")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile CollectionAttribute<Usuario, Disciplina> disciplinaCollection;
    public static volatile CollectionAttribute<Usuario, Prova> provaCollection;
    public static volatile CollectionAttribute<Usuario, Questao> questaoCollection;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, String> email;

}