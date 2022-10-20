package com.isidata.models.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.isidata.models.entities.DataPenduduk;

public interface RepositoriDataPenduduk extends CrudRepository<DataPenduduk, String> {

    // @Query("SELECT d FROM DataPenduduk d WHERE " +
    // "d.nik LIKE CONCAT('%',:query, '%')")
    // List<DataPenduduk> searchDataPenduduks(String query);

    // @Query("SELECT d FROM DataPenduduk d WHERE " +
    // "d.name LIKE CONCAT('%',:query, '%')")
    // List<DataPenduduk> searchDataPenduduks(String query);

    // search by nik
    @Query("SELECT d FROM DataPenduduk d WHERE d.nik LIKE %?1%")
    List<DataPenduduk> searchDataPendudukbyNIK(String nik);

    // search by name
    @Query("SELECT d FROM DataPenduduk d WHERE d.name LIKE %?1%")
    List<DataPenduduk> searchDataPendudukbyName(String name);

    // search by nik and name
    @Query("SELECT d FROM DataPenduduk d WHERE d.nik LIKE %?1% AND d.name LIKE %?2%")
    List<DataPenduduk> searchDataPendudukbyNIKandName(String nik, String name);

    List<DataPenduduk> findByNameContains(String name);
}
