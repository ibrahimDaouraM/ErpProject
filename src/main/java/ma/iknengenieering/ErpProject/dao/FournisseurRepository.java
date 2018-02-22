package ma.iknengenieering.ErpProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.iknengenieering.ErpProject.entities.Fournisseur;
@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {

}
