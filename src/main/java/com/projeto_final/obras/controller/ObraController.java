package com.projeto_final.obras.controller;

import com.projeto_final.obras.controller.dto.ObraDto;
import com.projeto_final.obras.model.Obra;
import net.bytebuddy.asm.Advice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

@RestController
public class ObraController {

    @RequestMapping("/obras")
    public List<ObraDto> hello(){
        Obra obra = new Obra(new BigInteger("1"), "Obra 1",new BigInteger("30"), "Tharcyl", "Tharcyl", "Deiretor", "Outorgante", "Titular");

        return ObraDto.converter(Arrays.asList(obra, obra));
    }

}
