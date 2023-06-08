package edu.autoservice.repository;

import edu.autoservice.model.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceItemsRepository extends JpaRepository<ServiceItem, Integer> {
}
