package ma.iknengenieering.ErpProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.iknengenieering.ErpProject.entities.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long>{

}
