package com.example.androidgraphql.AndroidGraphQL.Repository;

import com.example.androidgraphql.AndroidGraphQL.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepo extends JpaRepository<Todo,Long> {
    List<Todo> findAll();

    @Override
    <S extends Todo> S save(S s);

    void deleteById(Long id);

    Optional<Todo> findById(Long id);
}
