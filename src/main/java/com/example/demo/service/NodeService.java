package com.example.demo.service;

import com.example.demo.model.Node;
import com.example.demo.repository.NodeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NodeService {

    private final NodeRepository repository;

    public NodeService(NodeRepository repository) {
        this.repository = repository;
    }

    public List<Node> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Node> getEmployeeById(String id) {
        return repository.findById(id);
    }

    public Node createEmployee(Node node) {
        return repository.save(node);
    }

    public Node updateEmployee(String id, Node node) {
        node.setId(id);
        return repository.save(node);
    }

    public void deleteEmployee(String id) {
        repository.deleteById(id);
    }
}
