package com.littlestar.bean.vue;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TableObj {
    private String name;
    private Integer todayBuy;
    private Integer monthBuy;
    private Integer TotalBuy;
}
