import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class questao1Test {
    questao1 q1 = new questao1();

    @Test
    void main() {
    }

    @Test
    void deveriaFazerAPiramide() {
        int numero = 8;
        try{
            q1.piramide(numero);
        }catch (InputMismatchException e){
            Assertions.fail();
            }
        }
    }

