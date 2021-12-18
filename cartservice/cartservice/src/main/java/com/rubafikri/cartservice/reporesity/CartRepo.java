package com.rubafikri.cartservice.reporesity;

import com.rubafikri.cartservice.entity.LLibCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepo extends JpaRepository<LLibCart, Long> {
    LLibCart findByCartId(Long cartId);
}
