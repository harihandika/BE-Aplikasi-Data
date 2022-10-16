package com.isidata.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isidata.models.entities.DataPenduduk;

public interface RepositoriDataPenduduk extends CrudRepository<DataPenduduk, String> {
    List<DataPenduduk> findByNameContains(String name);
}
