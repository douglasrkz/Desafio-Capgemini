import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class questao2Test {

    questao2 q2 = new questao2();

    @Test
    void main() {
    }

    @Test
    void deveriaRetornarTamanhoValido() {
        String senha = "asdqwe";
        Boolean esperado = q2.validaTamanho(senha);
        assertTrue(esperado);
    }

    @Test
    void deveriaRetornarTamanhoInvalido() {
        String senha = "asdqw";
        Boolean esperado = q2.validaTamanho(senha);
        assertFalse(esperado);
    }

    @Test
    void deveriaRetornarSeExisteDigito() {
        String senha = "dsaweq1";
        Boolean esperado = q2.validaDigito(senha);
        assertTrue(esperado);
    }

    @Test
    void deveriaRetornarSeNaoExisteDigito() {
        String senha = "dsaweq";
        Boolean esperado = q2.validaDigito(senha);
        assertFalse(esperado);
    }


    @Test
    void deveriaRetornarSeTemMinuscula() {
        String senha = "ASDWEe";
        Boolean esperado = q2.validaMinusculo(senha);
        assertTrue(esperado);
    }

    @Test
    void deveriaRetornarSeNaoTemMinuscula() {
        String senha = "ASDQWE";
        Boolean esperado = q2.validaMinusculo(senha);
        assertFalse(esperado);
    }

    @Test
    void deveriaRetornarSeTemMaiscula() {
        String senha = "asdqeW";
        Boolean esperado = q2.validaMaiusculo(senha);
        assertTrue(esperado);
    }

    @Test
    void deveriaRetornarSeNaoTemMaiscula() {
        String senha = "asdqee";
        Boolean esperado = q2.validaMaiusculo(senha);
        assertFalse(esperado);
    }

    @Test
    void deveriaRetornarSeTemCaractereEspecial() {
        String senha = "asdqwe!";
        Boolean esperado = q2.validaCaractereEspecial(senha);
        assertTrue(esperado);
    }

    @Test
    void deveriaRetornarSeNaoTemCaractereEspecial() {
        String senha = "asdqwe";
        Boolean esperado = q2.validaCaractereEspecial(senha);
        assertFalse(esperado);
    }

    @Test
    void validaFinal() {
        try{
            q2.validaFinal("asdqweW!1");
        }catch (Exception e){
            Assertions.fail();}

    }
}