package mx.com.itam.adsi.examen;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSolucion {
    private final static Logger LOG = Logger.getLogger(TestSolucion.class);
    
    private static final String HEXA = "0123456789abcdef";
    private static final String BINARIO = "01";
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isCorrectCalcTest() {
        String s="";
        LOG.info("Ejecutando la prueba");
        
        s="abab";
        assertTrue("Probando "+s,calc(s, true));
        
        s="aa";
        assertTrue("Probando "+s,calc(s, true));

        s="1212";
        assertTrue("Probando "+s,calc(s, true));
        
        s="abdfabdf";
        assertTrue("Probando "+s,calc(s, true));

        s="acac";
        assertTrue("Probando "+s,calc(s, true));
        
        s="nonono";
        assertTrue("Probando "+s,calc(s, true));

        s="sisisi";
        assertTrue("Probando "+s,calc(s, true));
        
        s="holaholahola";
        assertTrue("Probando "+s,calc(s, true));

        s="123123";
        assertTrue("Probando "+s,calc(s, true));
        
        s="abdabd";
        assertTrue("Probando "+s,calc(s, true));

        s="babab";
        assertTrue("Probando "+s,calc(s, false));
        
        s="a";
        assertTrue("Probando "+s,calc(s, false));

        s="";
        assertTrue("Probando "+s,calc(s, false));
        
        s="abababa";
        assertTrue("Probando "+s,calc(s, false));

        s="abba";
        assertTrue("Probando "+s,calc(s, false));
        
        s="ab35ab";
        assertTrue("Probando "+s,calc(s, false));
        
        s="ababc";
        assertTrue("Probando "+s,calc(s, false));
        
        s="abbc";
        assertTrue("Probando "+s,calc(s, false));

        s="1231";
        assertTrue("Probando "+s,calc(s, false));
        
        s="111211121111111";
        assertTrue("Probando "+s,calc(s, false));
    }
    
    private boolean calc(String s, boolean res) {
        boolean r = Solucion.problema(s);
        return res==r;
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
