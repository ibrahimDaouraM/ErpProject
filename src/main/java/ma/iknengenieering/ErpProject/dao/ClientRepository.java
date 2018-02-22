package ma.iknengenieering.ErpProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.iknengenieering.ErpProject.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
