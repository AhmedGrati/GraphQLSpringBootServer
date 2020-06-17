package com.example.androidgraphql.AndroidGraphQL.QueryResolver;

import com.example.androidgraphql.AndroidGraphQL.Model.Todo;
import com.example.androidgraphql.AndroidGraphQL.Repository.TodoRepo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TodoQueryResolver implements GraphQLQueryResolver {
    @Autowired
    public TodoRepo todoRepo;

    public List<Todo> getAllTodos() {
        return this.todoRepo.findAll();
    }
}
