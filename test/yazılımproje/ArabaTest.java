package yazılımproje;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Rule;

/**
 *
 * @author feyza
 */
public class ArabaTest {
    @Rule
    public BenimKuralim performans = new BenimKuralim();
    public static Araba a;
    public ArabaTest() {
    }
    @BeforeClass
    public static void ArabaBeforeTest(){
        a = new Araba(60);
    }
    @AfterClass
    public static void ArabaAfterTest(){
        a=null;
    }
    @Test
    public void ArabaOlustuTest(){
       
        assertNotNull(a);
                
    }
    @Test
    public void surTest(){
        try{
            a.sur(3);
            fail("hız girilmediği için hata vermeliydi");
        }
        catch(IllegalArgumentException ex){
            a.setHiz(140);
        }
        a.sur(3);
        assertEquals(420,a.getYol(),0);
        assertEquals(22,a.getDepo(),0.5);
    }
    /*
    İLK BAŞTA BÖYLEYDİ
    @Test
    public void surTest(){
        a.setHiz(140);
        a.sur(3);
        assertEquals(420,a.getYol(),0);
        assertEquals(22,a.getDepo(),0.5);
    }*/
    @Test
    public void menzilTest(){
       
        a.setHiz(100);
        a.sur(1);
        assertEquals(220,a.menzil(),10);
    }
@Test
public void performansTest(){
    a.SifirYuz();
}
}

