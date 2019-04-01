package br.com.home.repository;

import br.com.home.repository.interfaces.ContratoRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class VeiculoRepository implements ContratoRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void create(Object veiculo) {
        entityManager.getTransaction().begin();
        entityManager.persist(veiculo);
        entityManager.getTransaction().commit();
    }

    @Override
    public List read() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select v from Veiculo as v");
        List lista = query.getResultList();
        entityManager.getTransaction().commit();
        return lista;
    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(Integer id) {

    }
}
