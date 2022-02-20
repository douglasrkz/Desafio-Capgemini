import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class questao3Test {

    questao3 q3 = new questao3();

    @Test
    void main() {
    }

    @Test
    void deveriaRetornarONumeroDeAnagrama() {
        String senha = "ovo";
        try{
            q3.verificarAnagrama(senha);
        }catch (InputMismatchException e){
            Assertions.fail();
        }
    }
    }