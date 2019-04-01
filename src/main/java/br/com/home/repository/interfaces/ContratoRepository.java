package br.com.home.repository.interfaces;

import java.util.List;

public interface ContratoRepository {

    public void create(Object object);

    public List read();

    public void update(Object object);

    public void delete(Integer id);
}
