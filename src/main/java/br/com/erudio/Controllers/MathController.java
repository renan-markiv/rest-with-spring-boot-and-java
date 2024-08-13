package br.com.erudio.Controllers;

import br.com.erudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

import static br.com.erudio.converters.NumberConverter.convertToDouble;
import static br.com.erudio.converters.NumberConverter.isNumeric;

@RestController
public class MathController {

    private static final AtomicLong counter = new AtomicLong();

    private SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne")
            String numberOne,
            @PathVariable(value = "numberTwo")
            String numberTwo)
        {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {throw new UnsupportedMathOperationException("Please set a numeric value");}
        return math.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne")
            String numberOne,
            @PathVariable(value = "numberTwo")
            String numberTwo)
    {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {throw new UnsupportedMathOperationException("Please set a numeric value");}
        return math.sub(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double mult(
            @PathVariable(value = "numberOne")
            String numberOne,
            @PathVariable(value = "numberTwo")
            String numberTwo)
            {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
                return math.mult(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne")
            String numberOne,
            @PathVariable(value = "numberTwo")
            String numberTwo)
            {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
                return math.div(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/avg/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)
    public Double avg(
            @PathVariable(value = "numberOne")
            String numberOne,
            @PathVariable(value = "numberTwo")
            String numberTwo)
            {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
                return math.avg(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

}
