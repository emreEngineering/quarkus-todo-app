package com.code.todo.resource;

import com.code.todo.model.Task;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@Path("/tasks")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TaskResource {

    @GET
    public List<Task> getAll() {
        return Task.listAll();
    }

    @POST
    @Transactional
    public Task create(Task task) {
        task.persist();
        return task;
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Task update(@PathParam("id") Long id, Task updatedTask) {
        Task task = Task.findById(id);
        if (task == null) {
            throw new NotFoundException();
        }
        task.title = updatedTask.title;
        task.completed = updatedTask.completed;
        return task;
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id) {
        Task task = Task.findById(id);
        if (task == null) {
            throw new NotFoundException();
        }
        task.delete();
    }
}
