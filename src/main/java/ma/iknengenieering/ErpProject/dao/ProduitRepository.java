package ma.iknengenieering.ErpProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import ma.iknengenieering.ErpProject.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
