package com.example.androidgraphql.AndroidGraphQL.MutationResolver;

import com.example.androidgraphql.AndroidGraphQL.Model.Todo;
import com.example.androidgraphql.AndroidGraphQL.Model.TodoInput;
import com.example.androidgraphql.AndroidGraphQL.Repository.TodoRepo;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TodoMutationResolver implements GraphQLMutationResolver {
    @Autowired
    public TodoRepo todoRepo;

    public Todo addTodo(TodoInput todoInput) {
        Todo todo = new Todo(todoInput.getTitle(),todoInput.getDescription(),todoInput.getDuration());
        return this.todoRepo.save(todo);
    }

    public boolean deleteTodoById(Long id) {
        Optional<Todo> todo = this.todoRepo.findById(id);
        if(todo.isPresent()){
            this.todoRepo.deleteById(id);
            return true;
        }
        return false;
    }
}