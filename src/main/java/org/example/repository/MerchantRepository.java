package org.example.repository;


import org.example.domain.table.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {

}
