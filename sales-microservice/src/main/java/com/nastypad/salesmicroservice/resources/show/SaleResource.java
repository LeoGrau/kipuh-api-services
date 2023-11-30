package com.nastypad.salesmicroservice.resources.show;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleResource {
    public Long id;
    public String name;
    public int Stock;
}
