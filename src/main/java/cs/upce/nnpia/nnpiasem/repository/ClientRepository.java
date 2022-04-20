package cs.upce.nnpia.nnpiasem.repository;

import cs.upce.nnpia.nnpiasem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
