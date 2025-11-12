import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    public void testDepositoNegativo() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(-50);
        assertEquals(0, conta.getSaldo());
    }
}