
package aula25v01;

import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**

 @author Tomas
 */
public class DocenteTest{
    
    public DocenteTest(){
    }
    
    @BeforeClass
    public static void setUpClass(){
    }
    
    @AfterClass
    public static void tearDownClass(){
    }
    
    @Before
    public void setUp(){
    }
    
    @After
    public void tearDown(){
    }
    
    

    /**
     * Test of setNombre method, of class Docente.
     */
    @Test
    public void testSetNombre(){
        System.out.println("setNombre");
        String nombreAuxliar = "";
        Docente instance = new Docente();
        instance.setNombre(nombreAuxliar);
        
    }

    /**
     * Test of setApellido method, of class Docente.
     */
    @Test
    public void testSetApellido(){
        System.out.println("setApellido");
        String apellidoAuxiliar = "";
        Docente instance = new Docente();
        instance.setApellido(apellidoAuxiliar);
    }

    /**
     * Test of setDni method, of class Docente.
     */
    @Test
    public void testSetDni(){
        System.out.println("setDni");
        int dniAuxiliar = 0;
        Docente instance = new Docente();
        instance.setDni(dniAuxiliar);
    }

    /**
     * Test of setTituloHabilitante method, of class Docente.
     */
    @Test
    public void testSetTituloHabilitante(){
        System.out.println("setTituloHabilitante");
        String tituloHabilitanteAuxiliar = "";
        Docente instance = new Docente();
        instance.setTituloHabilitante(tituloHabilitanteAuxiliar);
    }

    /**
     * Test of setHonorario method, of class Docente.
     */
    @Test
    public void testSetHonorario(){
        System.out.println("setHonorario");
        float honorarioAuxiliar = 0.0F;
        Docente instance = new Docente();
        instance.setHonorario(honorarioAuxiliar);
    }

    /**
     * Test of getNombre method, of class Docente.
     */
    @Test
    public void testGetNombre(){
        System.out.println("getNombre");
        Docente instance = new Docente();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getApellido method, of class Docente.
     */
    @Test
    public void testGetApellido(){
        System.out.println("getApellido");
        Docente instance = new Docente();
        String expResult = null;
        String result = instance.getApellido();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDni method, of class Docente.
     */
    @Test
    public void testGetDni(){
        System.out.println("getDni");
        Docente instance = new Docente();
        int expResult = 0;
        int result = instance.getDni();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTituloHabilitante method, of class Docente.
     */
    @Test
    public void testGetTituloHabilitante(){
        System.out.println("getTituloHabilitante");
        Docente instance = new Docente();
        String expResult = null;
        String result = instance.getTituloHabilitante();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHonorario method, of class Docente.
     */
    @Test
    public void testGetHonorario(){
        System.out.println("getHonorario");
        Docente instance = new Docente();
        float expResult = 0.0F;
        float result = instance.getHonorario();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getId method, of class Docente.
     */
    @Test
    public void testGetId(){
        System.out.println("getId");
        Docente instance = new Docente();
        int expResult = Docente.getListaDocente().size();
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setListaDocente method, of class Docente.
     */
    @Test
    public void testSetListaDocente(){
        System.out.println("setListaDocente");
        Set<Docente> listaDocenteAuxiliar = new HashSet<>();
        Docente.setListaDocente(listaDocenteAuxiliar);
    }

    /**
     * Test of getDocentePorId method, of class Docente.
     */
    @Test
    public void testGetDocentePorId(){
        System.out.println("getDocentePorId");
        int idActual = 0;
        Docente expResult = null;
        Docente result = Docente.getDocentePorId(idActual);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Docente.
     */
    @Test
    public void testEquals(){
        System.out.println("equals");
        Object objetoAuxiliar = null;
        Docente instance = new Docente();
        boolean expResult = false;
        boolean result = instance.equals(objetoAuxiliar);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Docente.
     */
    @Test
    public void testToString(){
        System.out.println("toString");
        Docente instance = new Docente();
        String expResult = null;
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
