package com.rubafikri.orderservice.reporistry;

import com.rubafikri.orderservice.entity.LLibOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderReporisity extends JpaRepository <LLibOrder,Long> {
    LLibOrder findByOrderid(Long orderid);
}
