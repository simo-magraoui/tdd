import static org.junit.jupiter.api.Assertions.*;


import org.example.BankAccount;
import org.example.Calculator;
import org.junit.jupiter.api.Test;
public class BankAccountTest {



    @Test
    public void testdeposit(){
        BankAccount bank= new BankAccount();
        bank.deposit(6);
        assertEquals(6,  bank.getBalance());
    }



    @Test public void withdraw(){

        BankAccount bank= new BankAccount();

        assertThrows(IllegalArgumentException.class, () -> {
            bank.withdraw(-1);
        });

    }


    @Test public void getBalance(){


        BankAccount bank= new BankAccount();
        assertEquals(0,  bank.getBalance());
    }






}
