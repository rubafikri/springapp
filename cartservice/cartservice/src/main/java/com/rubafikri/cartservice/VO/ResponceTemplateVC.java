package com.rubafikri.cartservice.VO;

import com.rubafikri.cartservice.entity.LLibCart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponceTemplateVC {
    private LLibCart libCart;
    private LibOrder libOrder;
}
