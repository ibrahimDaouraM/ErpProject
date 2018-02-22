package ma.iknengenieering.ErpProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.iknengenieering.ErpProject.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
