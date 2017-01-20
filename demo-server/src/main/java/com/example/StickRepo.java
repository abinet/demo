package com.example;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by abinetsky on 20.01.17.
 */
@RepositoryRestResource
public interface StickRepo extends PagingAndSortingRepository<Stick, Long> {

    Page<Stick> findByIdIn(@Param("ids") List<Long> ids, Pageable pageable);

    //List<T> findAll(@Param("ids") List<Long> id);
}
